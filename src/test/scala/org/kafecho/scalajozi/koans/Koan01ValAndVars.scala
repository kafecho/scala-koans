package org.kafecho.scalajozi.koans

import org.scalatest.matchers.Matcher
import org.scalatest.exceptions.TestPendingException
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.kafecho.scalajozi.koans.support.KoanSuite

@RunWith(classOf[JUnitRunner])
class Koan01ValandVar extends KoanSuite{

  koan("A val is an immutable reference which does not change."){
    val meaningOfLife = 42
    meaningOfLife should be ( __ )
    
    // You can't reassign a val.
    // The line below does not compile. Try to uncomment it to see what happens. 
    // meaningOfLife = 360
  }
  
  koan("A var is a mutable reference."){
    var msg = "abc"
    msg should be ( "abc" )
    
    msg = "dfg"

    msg should be ( __ )
  }
  
  koan("You can't re-define the type of a var."){
    var what = "Hello world"
    // The line below does not compile. Try to uncomment it to see what happens. 
    // what = 5
  }
  
  koan("Beware, a val can point to something that is actually mutable."){
    val array = Array(1,2,3,4)

    // The reference is immutable, so you can't change what it points to.
    // The line below does not compile. Try to uncomment it to see what happens. 
    //array = Array(5,6,7,8)
    
    array(0) should be (1)
    
    // In Scala, arrays are mutable, so we can redefine the 1st value.
    array(0) = 2
    
    array(0) should be ( __ )
    
  }
  
}