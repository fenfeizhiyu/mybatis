package org.apache.ibatis.test2.xmlTest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.parsing.XPathParser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class XmlParseTest {


    @Test
    public void testGetResource(){
        String filePath="resources/test/mybatis-config.xml";
        try {
           InputStream inputStream= Resources.getResourceAsStream(filePath);
            XPathParser parser=new XPathParser(inputStream);
           // parser
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
