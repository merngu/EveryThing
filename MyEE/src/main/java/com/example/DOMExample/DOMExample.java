package com.example.DOMExample;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

/**
 * FileName: DOMExample
 * Date:   20242024/9/20下午5:13
 * Description:
 * <author> maziyu
 */
public class DOMExample {
    public static void main(String[] args) throws Exception {
        String xml = "<root><child>Content</child></root>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        Document doc = builder.parse(is);

        Element root = doc.getDocumentElement();
        System.out.println("Root element: " + root.getTagName());

        // 添加一个新的子元素
        Element newChild = doc.createElement("newChild");
        root.appendChild(newChild);

        System.out.println("Root element: " + root.getTagName());
    }
}
