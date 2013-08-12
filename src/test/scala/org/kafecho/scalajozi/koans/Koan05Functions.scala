package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan05Functions extends KoanSuite {

  koan("Function literals") {
    val triple = (x: Int) => x * 3

    triple(1) should equal(__)

    // The apply() rule also applies here.
    triple(1) should equal(triple.apply(1))

    // You can compose functions together.
    val square = (x: Int) => x * x
    val tripleTheSquare = triple.compose(square)
    val squareTheTriple = square.compose(triple)

    square(2) should equal(__)

    tripleTheSquare(2) should equal(__)

    squareTheTriple(2) should equal(__)
  }
  
  koan("A higher order function takes a function as a parameter."){
    
    // In Scala you can define methods inside other methods.
    def processNumber (n : Int, fn: Int => Int) : Int = fn(n)
    
    val triple = (x: Int) => x * 3
    
    processNumber( 1, triple ) should equal ( __ )

    // The function you pass as a parameter can be defined inline.
    processNumber (2, x => x * x) should equal ( __ )
  }
}
