package org.apache.ibatis.test2;

import org.apache.ibatis.BaseDataTest;
import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Date;

public class MySqlTest extends BaseDataTest {

    private static DataSource ds=null;


    @BeforeClass
    public static void beforeTest(){
        try {
            ds=createMySqlDataSource();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMysqlConnection() throws Exception{
        DataSource ds=createMySqlDataSource();
        try {
            ds.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testASql(){
        try {
          //  Connection con=ds.getConnection();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     *
     for(int i=0;i<metaData.getColumnCount();i++){

     //System.out.println("className:" + metaData.getColumnClassName(i));
     //   System.out.println("ColumnName" + metaData.getColumnName(i));
     //  System.out.println("ColumnTypeName" + metaData.getColumnTypeName(i));
     //   System.out.println("CatalogName" + metaData.getCatalogName(i));
     //   System.out.println("SchemaName" + metaData.getSchemaName(i));
     //   System.out.println("ColumnDisplaySize" + metaData.getColumnDisplaySize(i));
     }
     System.out.println(metaData.getColumnCount());
     */


}
