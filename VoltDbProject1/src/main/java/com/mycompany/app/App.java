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
        /* Client client = null;
        ClientConfig config = null;
        try {
            config = new ClientConfig("advent","xyzzy");

            client = ClientFactory.createClient(config);

            client.createConnection("localhost", 49153);

            long start = System.currentTimeMillis();

            	System.out.println("SADASAD");
                client.callProcedure("insertnumber","1");

            System.out.println(System.currentTimeMillis() - start);
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.exit(-1);
        } catch (ProcCallException e) {
            e.printStackTrace();
        }*/
String[] paketNames = new String[]{"'cheap'","'expensive'","'student'","'boss'","'animal'","'monkey'","'bird'","'gold'"
,"'Thor'","'Ironman'","'Spiderman'"};
        Random rn = new Random();
        int telno ;
        int usage ;
        int kalanMik ;
        int paketNo ;
        Connection connection = DriverManager.getConnection("jdbc:voltdb://localhost:49154");
        String sqlAdd;
     long startTime =System.currentTimeMillis();
        long finishTime ;

        for (int i = 0; i <24000 ; i++) {

            telno = rn.nextInt(10000000) + 1;
            usage = rn.nextInt(10)+1;
            kalanMik =rn.nextInt(10)+1;
            paketNo =rn.nextInt(10);
             sqlAdd ="INSERT INTO abone VALUES("+telno+","+usage+","+paketNames[paketNo]+","+kalanMik+");";

            PreparedStatement statement = connection.prepareStatement(sqlAdd);
            statement.executeUpdate();
        }
        finishTime =System.currentTimeMillis();
        System.out.println("time :"+(finishTime-startTime));


    }
}
