package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan08Methods extends KoanSuite{
	koan("Let's define a method"){
	  def add2(i : Int) : Int = {
	    return (i + 2)
	  }
	  
	  add2(0) should equal (__)
	}

	koan("Return is optional"){
	  def add2(i : Int) : Int = {
	   i + 2
	  }
	  
	  add2(0) should equal (__)
	}

	koan("Return type is optional"){
	  def add2(i : Int)  = i + 2
	  
	  add2(0) should equal (__)
	}
	
	koan("Nested method"){
	  def add2(i : Int) = {
	    def add1(x : Int) = x + 1
	    add1(add1(i))
	  }

	  add2(0) should equal (__)

	}
}