package org.kafecho.scalajozi.koans

import org.scalatest.matchers.Matcher
import org.scalatest.exceptions.TestPendingException
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.kafecho.scalajozi.koans.support.KoanSuite

@RunWith(classOf[JUnitRunner])
class Koan00TypeInference extends KoanSuite{

  koan("Types and ; can be inferred"){
	  val x : Int = 42
	  val y = 42
	  (x == y) should be ( __ )
	  
	  // No need for semicolons
	  val a = 42;
	  
	  val b = 42
	  
	  // Type inference works with collections.
	  val capitalToCountry : Map[String, String] = Map("Paris" -> "France", "Pretoria" -> "SA")
	  val countryToCapital = Map("France" -> "France", "SA" -> "Pretoria")
  }
}