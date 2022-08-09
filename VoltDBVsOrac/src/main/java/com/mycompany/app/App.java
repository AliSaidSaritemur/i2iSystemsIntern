package com.mycompany.app;

import org.voltdb.client.Client;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.ClientFactory;
import org.voltdb.client.ProcCallException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Timer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {

String[] paketNames = new String[]{"'cheap'","'expensive'","'student'","'boss'","'animal'","'monkey'","'bird'","'gold'"
,"'Thor'","'Ironman'","'Spiderman'"};
        Random rn = new Random();
        int telno ;
        int usage ;
        int kalanMik ;
        int paketNo ;
        Connection connection = DriverManager.getConnection("jdbc:voltdb://localhost:49153");
        String sqlAdd="";
     long startTime =System.currentTimeMillis();
        long finishTime ;

        for (int i = 0; i <20 ; i++) {

            telno = rn.nextInt(10000000) + 1;
            usage = rn.nextInt(10)+1;
            kalanMik =rn.nextInt(10)+1;
            paketNo =rn.nextInt(10);
             sqlAdd = sqlAdd +"INSERT INTO abone VALUES("+telno+","+usage+","+paketNames[paketNo]+","+kalanMik+");";

        }

        PreparedStatement statement = connection.prepareStatement(sqlAdd);
        statement.executeUpdate();
        finishTime =System.currentTimeMillis();
        System.out.println("time :"+(finishTime-startTime));

        Oracle oracleTime =new Oracle();
        Connection conn = oracleTime.connection("system","oracle");
        System.out.println("Oracle insert 25000 users time : "+oracleTime.insert(conn)+" ms");
        oracleTime.closeConnection(conn);

    }
}
