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
        String filePath="resources/book.xml";
        //用 JAXP 解析文档
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = null;
        try {
            InputStream inputStream= Resources.getResourceAsStream(filePath);
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);
            //接下来创建 XPathFactory：然后使用这个工厂创建 XPath 对象
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xpath = xPathFactory.newXPath();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
