package org.kafecho.scalajozi.koans


import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan03Strings extends KoanSuite{
  
	koan("Get the nth character of a String"){
	  val msg = "Hello world"
	    msg(0) should equal ( 'H' )
	    msg(4) should equal ( __ )
	}

	koan("The Apply method applied to Strings"){
	  val msg = "Hello world"
	  
	  msg(0) should equal (msg.apply(0))
	  
	  msg.apply(4) should equal ( __ )
	}
	
	koan("From Scala 2.10, you can do string interpolation."){
	  val whom = "Jozi"
	  val greeting = s"Hello $whom"
	  greeting should equal (__)
	}
}



