package com.elemica.client

/**
 * This main method simply creates a new `HiveTest` instance. Then it tries to 
 * print out the tables on the Hive server.
 **/
object Main {
	def main(args: Array[String]) {
		val hiveTest = new HiveTest()
		hiveTest.printAllTables()
	}
}