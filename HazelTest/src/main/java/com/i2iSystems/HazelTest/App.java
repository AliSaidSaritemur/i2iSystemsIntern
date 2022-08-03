package com.i2iSystems.HazelTest;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
     Hazelcast hazelcast = new Hazelcast();
     hazelcast.HazelcastOperations();
     

     Oracle oracleTime =new Oracle();
		
		Connection conn = oracleTime.connection("system","oracle");
		
		System.out.println("Oracle insert 20000 users time : "+oracleTime.insertNumbers(conn)+" ms"); 
		System.out.println("Oracle select 20000 users time : "+oracleTime.selectNumbers(conn)+" ms");       
		oracleTime.closeConnection(conn);
     
    }
}
