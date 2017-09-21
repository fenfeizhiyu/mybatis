/*
 *    Copyright 2009-2012 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.parsing;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

public class XPathParserTest {

  @Test
  public void shouldTestXPathParserMethods() throws Exception {
    String resource = "resources/nodelet_test.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    XPathParser parser = new XPathParser(inputStream, false, null, null);
    assertEquals((Long)1970l, parser.evalLong("/employee/birth_date/year"));
    assertEquals((short) 6, (short) parser.evalShort("/employee/birth_date/month"));
    assertEquals((Integer) 15, parser.evalInteger("/employee/birth_date/day"));
    assertEquals((Float) 5.8f, parser.evalFloat("/employee/height"));
    assertEquals((Double) 5.8d, parser.evalDouble("/employee/height"));
    assertEquals("${id_var}", parser.evalString("/employee/@id"));
    assertEquals(Boolean.TRUE, parser.evalBoolean("/employee/active"));
    assertEquals("<id>${id_var}</id>", parser.evalNode("/employee/@id").toString().trim());
    assertEquals(7, parser.evalNodes("/employee/*").size());
    XNode node = parser.evalNode("/employee/height");
    assertEquals("employee/height", node.getPath());
    assertEquals("employee[${id_var}]_height", node.getValueBasedIdentifier());
  }

  @Test
  public void testXmlParser()throws Exception{
    String resource="resources/nodelet_test.xml";
    try{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory.setValidating(false);
        //名称空间
        factory.setNamespaceAware(false);
        //忽略注释
        factory.setIgnoringComments(true);
        //忽略空白
        factory.setIgnoringElementContentWhitespace(false);
        //把 CDATA 节点转换为 Text 节点
        factory.setCoalescing(false);
        //扩展实体引用
        factory.setExpandEntityReferences(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document=builder.parse(inputStream);
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
       // System.out.println("**:"+xPath.evaluate("/configuration/properties",document, XPathConstants.STRING));
        NodeList nodes=document.getChildNodes();
        printNodes(nodes);
        Node node= nodes.item(0);
        System.out.println((node.getChildNodes().getLength()));
    }catch (Exception e){
        e.printStackTrace();
    }
  }

  private void printNodes(NodeList nodes){
      for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeName());
      }
  }

}
