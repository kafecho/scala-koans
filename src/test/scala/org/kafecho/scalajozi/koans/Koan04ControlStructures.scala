package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan04ControlStructures extends KoanSuite {

  koan("Most things are expressions") {

    val answer = 41
    val found = (answer == 42)

    found.isInstanceOf[Boolean] should be(__)

    val correct = if (answer == 42) true else false

    correct should be(__)
  }

  koan("A while loop is NOT an expression") {
    val meaningOfLife = 24

    val what = while (meaningOfLife != 24) {
      println("Searching for the meaning of life")
    }

    what.isInstanceOf[Unit] should be(__)
  }
  
  koan("In Scala, for is normally used as a list comprehension. You can also use it purely for side effects."){
    val result = for ( i <-0 to 42){
      println (s"Getting closer to the meaning of life. Currentlty at $i")
    }
    
    result.isInstanceOf[Unit] should be (__)
  }
  
  koan("You can create a sequence from a for comprehension"){
    val result = (for ( i <-0 to 3) yield i * 2).toList
    
    result should equal (List( __ ))
  }
  
}
