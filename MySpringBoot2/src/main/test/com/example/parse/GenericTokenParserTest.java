package com.example.parse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericTokenParserTest {

    public static class VariableTokenHandler implements TokenHandler {
        private final Map<String, String> variables;

        VariableTokenHandler(Map<String, String> variables) {
            this.variables = variables;
        }

        @Override
        public String handleToken(String content) {
            return variables.get(content);
        }
    }

    @Test
    void configReplace() throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("/mnt/a9fa8c34-c74f-4630-a351-26c3ce01cd04/mycode/EveryThing/MySpringBoot2/src/main/resources/muban.conf"));

        GenericTokenParser genericTokenParser = new GenericTokenParser("${", "}", new VariableTokenHandler(new HashMap<String, String>() {
            {
                put("table", "James");
                put("exe_cores", "10");
                put("host", "127.0.0.1");
                put("day", LocalDate.now().toString());
            }
        }));

        ArrayList<String> newContent = new ArrayList<>(strings.size());
        for (String string : strings) {
            newContent.add(genericTokenParser.parse(string));
        }
        Files.write(Paths.get("/mnt/a9fa8c34-c74f-4630-a351-26c3ce01cd04/mycode/EveryThing/MySpringBoot2/src/main/resources/muban.conf11"), newContent);

    }


    @Test
    void MyTest() {
        GenericTokenParser genericTokenParser = new GenericTokenParser("${", "}", new VariableTokenHandler(new HashMap<String, String>() {
            {
                put("AA", "James");

            }
        }));

        String parse = genericTokenParser.parse("AA ${AA} AA");
        System.out.println(parse);
    }

    @Test
    void shouldDemonstrateGenericTokenReplacement() {
        GenericTokenParser parser = new GenericTokenParser("${", "}", new VariableTokenHandler(new HashMap<String, String>() {
            {
                put("first_name", "James");
                put("initial", "T");
                put("last_name", "Kirk");
                put("var{with}brace", "Hiya");
                put("", "");
            }
        }));

        String parse = parser.parse("${first_name} ${initial} ${last_name} reporting.");
        System.out.println(parse);
        assertEquals("James T Kirk reporting.", parse);
        assertEquals("Hello captain James T Kirk", parser.parse("Hello captain ${first_name} ${initial} ${last_name}"));
        assertEquals("James T Kirk", parser.parse("${first_name} ${initial} ${last_name}"));
        assertEquals("JamesTKirk", parser.parse("${first_name}${initial}${last_name}"));
        assertEquals("{}JamesTKirk", parser.parse("{}${first_name}${initial}${last_name}"));
        assertEquals("}JamesTKirk", parser.parse("}${first_name}${initial}${last_name}"));

        assertEquals("}James{{T}}Kirk", parser.parse("}${first_name}{{${initial}}}${last_name}"));
        assertEquals("}James}T{Kirk", parser.parse("}${first_name}}${initial}{${last_name}"));
        assertEquals("}James}T{Kirk", parser.parse("}${first_name}}${initial}{${last_name}"));
        assertEquals("}James}T{Kirk{{}}", parser.parse("}${first_name}}${initial}{${last_name}{{}}"));
        assertEquals("}James}T{Kirk{{}}", parser.parse("}${first_name}}${initial}{${last_name}{{}}${}"));

        assertEquals("{$$something}JamesTKirk", parser.parse("{$$something}${first_name}${initial}${last_name}"));
        assertEquals("${", parser.parse("${"));
        assertEquals("", parser.parse("${}"));
        assertEquals("${\\}", parser.parse("${\\}"));
        assertEquals("Hiya", parser.parse("${var{with\\}brace}"));
        assertEquals("", parser.parse("${}"));
        assertEquals("}", parser.parse("}"));
        assertEquals("Hello ${ this is a test.", parser.parse("Hello ${ this is a test."));
        assertEquals("Hello } this is a test.", parser.parse("Hello } this is a test."));
        assertEquals("Hello } ${ this is a test.", parser.parse("Hello } ${ this is a test."));
    }

    @Test
    void shallNotInterpolateSkippedVaiables() {
        GenericTokenParser parser = new GenericTokenParser("${", "}", new VariableTokenHandler(new HashMap<>()));

        assertEquals("${skipped} variable", parser.parse("\\${skipped} variable"));
        assertEquals("This is a ${skipped} variable", parser.parse("This is a \\${skipped} variable"));
        assertEquals("null ${skipped} variable", parser.parse("${skipped} \\${skipped} variable"));
        assertEquals("The null is ${skipped} variable", parser.parse("The ${skipped} is \\${skipped} variable"));
    }

    @Disabled("Because it randomly fails on Github CI. It could be useful during development.")
    @Test
    void shouldParseFastOnJdk7u6() {
        Assertions.assertTimeout(Duration.ofMillis(1000), () -> {
            // issue #760
            GenericTokenParser parser = new GenericTokenParser("${", "}", new VariableTokenHandler(new HashMap<String, String>() {
                {
                    put("first_name", "James");
                    put("initial", "T");
                    put("last_name", "Kirk");
                    put("", "");
                }
            }));

            StringBuilder input = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                input.append("${first_name} ${initial} ${last_name} reporting. ");
            }
            StringBuilder expected = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                expected.append("James T Kirk reporting. ");
            }
            assertEquals(expected.toString(), parser.parse(input.toString()));
        });
    }

}
