//package com.example.parse;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.StringTokenizer;
//
///**
// * @author : wangqingrong
// * @date : 2022/8/3
// */
//public class SqlSourceBuilder {
//
//    private final Map<String, ApiParamsEntity> apiParamsEntities;
//
//    public SqlSourceBuilder(Map<String, ApiParamsEntity> apiParamsEntities) {
//        this.apiParamsaEntities = apiParamsEntities;
//    }
//
//    public ApiEngineConfigEntity parse(ApiEngineConfigEntity apiExecConfigEntity) {
//        ParameterMappingTokenHandler handler = new ParameterMappingTokenHandler(this.apiParamsEntities);
//        GenericTokenParser parser = new GenericTokenParser("#{", "}", handler);
//        String sql = parser.parse(removeExtraWhitespaces(apiExecConfigEntity.getSql()));
//        List<ParameterEntity> parameterMappings = handler.getParameterMappings();
//        apiExecConfigEntity.setSql(sql);
//        apiExecConfigEntity.setConditionParam(parameterMappings);
//        return apiExecConfigEntity;
//    }
//
//    public static String removeExtraWhitespaces(String original) {
//        StringTokenizer tokenizer = new StringTokenizer(original);
//        StringBuilder builder = new StringBuilder();
//        boolean hasMoreTokens = tokenizer.hasMoreTokens();
//
//        while (hasMoreTokens) {
//            builder.append(tokenizer.nextToken());
//            hasMoreTokens = tokenizer.hasMoreTokens();
//            if (hasMoreTokens) {
//                builder.append(' ');
//            }
//        }
//        return builder.toString();
//    }
//
//    private static class ParameterMappingTokenHandler implements TokenHandler {
//        private final List<ParameterEntity> parameterMappings = new ArrayList<>();
//        Map<String, ApiParamsEntity> sqlParamsMap;
//
//        public ParameterMappingTokenHandler(Map<String, ApiParamsEntity> sqlParamsMap) {
//            this.sqlParamsMap = sqlParamsMap;
//        }
//
//        public List<ParameterEntity> getParameterMappings() {
//            return this.parameterMappings;
//        }
//
//        @Override
//        public String handleToken(String content) {
//            this.parameterMappings.add(this.buildParameterMapping(content));
//            return "?";
//        }
//
//        private ParameterEntity buildParameterMapping(String content) {
//            ApiParamsEntity apiParamsEntity = sqlParamsMap.computeIfAbsent(content, v -> {
//                throw new IllegalArgumentException(content + "不存在");
//            });
//            String attribute = apiParamsEntity.getAttribute();
//            Class<?> classType = ClassUtils.getClassType(attribute);
//            Boolean mustIn = apiParamsEntity.getMustIn() == 1;
//            String field = apiParamsEntity.getField();
//            String comment = apiParamsEntity.getComment();
//            String paramsSite = apiParamsEntity.getParamsSite();
//            String defaultValue = apiParamsEntity.getDefaultValue();
//            return new ParameterEntity(mustIn, defaultValue, null, comment, classType, attribute,
//                    parameterMappings.size() + 1, field, content, paramsSite);
//        }
//
//    }
//}
