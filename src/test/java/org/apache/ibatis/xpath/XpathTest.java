package org.apache.ibatis.xpath;

import org.apache.ibatis.io.Resources;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author yu.yang
 */
public class XpathTest {

    /**
     * 用xpath解析xml文件
     */
    public void testXpathParse(){
        ArrayList result = new ArrayList();
        String filePath="resources/test/mybatis-config.xml";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = null;
        try {
            InputStream inputStream= Resources.getResourceAsStream(filePath);
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xpath = xPathFactory.newXPath();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
