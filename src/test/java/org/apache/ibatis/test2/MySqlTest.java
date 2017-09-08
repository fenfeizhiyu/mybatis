package org.apache.ibatis.test2;

import org.apache.ibatis.BaseDataTest;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            Connection con=ds.getConnection();
            Statement sta=con.createStatement();
            ResultSet re=sta.executeQuery("select * from t_logs");
            ResultSet re2=sta.executeQuery("select * from t_logs limit 1");
            System.out.println(re.wasNull()+""+re2.wasNull());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
