package com.elemica.client

import org.apache.hadoop.hive.jdbc.HiveDriver
import java.sql.{Connection, DriverManager, Statement, ResultSet}

object HiveTest {
    val SCRIBE_VERB_AUDIT_TABLE = "scribe_verb_audits" 
    val DRIVER_NAME             = "org.apache.hadoop.hive.jdbc.HiveDriver"
}

// Code borrowed from https://cwiki.apache.org/confluence/display/Hive/HiveServer2+Clients#HiveServer2Clients-UsingJDBC
class HiveTest {
	import HiveTest._

    try {
      Class.forName(DRIVER_NAME);
    } catch { 
    	case e: ClassNotFoundException => {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	      System.exit(1);
    	}
	}

	val connection: Connection  = DriverManager.getConnection("jdbc:hive://localhost:10000/default", "", "")
    val stmt: Statement         = connection.createStatement()

    def printAllTables(): Unit = {
		val resultSet: ResultSet    = stmt.executeQuery(s"select * from $SCRIBE_VERB_AUDIT_TABLE")
	    println("printing result set...")
	    println(resultSet)
	}
}