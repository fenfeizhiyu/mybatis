package org.apache.ibatis.test2;

import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.model.SalesOrder;
import org.apache.ibatis.session.*;
import org.apache.ibatis.submitted.permissions.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @author yu.yang
 */
public class MyBatisTest {

    private final static String xmlPath = "resources/mybatis.xml";

    private final static String sqlProperties="resources/mysql.properties";

    @Test
    public void  testMyBatis(){
        try {
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = builder.build(Resources.getResourceAsStream(xmlPath), Resources.getResourceAsProperties(sqlProperties));
            //SqlSessionManager manager = SqlSessionManager.newInstance(sqlSessionFactory);

         // SqlSession sqlSession= manager.openSession(true);
             SqlSession sqlSession=sqlSessionFactory.openSession(true);
            SalesOrder salesOrder=new SalesOrder();
            salesOrder.setId(14999751L);
           SalesOrder order= sqlSession.selectOne("SalesOrder_getByObj", salesOrder);
            System.out.println("finished");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testSql2(){
        try {
            final Reader reader = Resources.getResourceAsReader(xmlPath);
            SqlSessionManager  manager = SqlSessionManager.newInstance(reader);
            SqlSession sqlSession= manager.openSession(true);
            SalesOrder salesOrder=new SalesOrder();
            salesOrder.setId(14999751L);
            SalesOrder order= sqlSession.selectOne("SalesOrder_getByObj", salesOrder);
            System.out.println(order.getCreateTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
