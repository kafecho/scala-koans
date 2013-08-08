package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan06Collections extends KoanSuite {

  koan("Lists are immutable data structure") {
    val greeting = List("hello", "world")

    greeting.size should equal(__)

    // Use :: to concatenate elements into a list
    ("hello" :: "world" :: Nil) should equal(greeting)

    // You can't modify a list, but you can add to the start.
    val prepended = "before we start" :: greeting
    prepended.size should equal(__)

    // Or to the end
    val appended = greeting :+ "Bye"
  }
  koan ("Lists can be accessed via head and tail") {
        val a = List(1,2,3)
        a.head should equal (1)
        a.tail should equal (List(2,3))
    }

  koan("You can deconstruct a list into its head and tail"){
    val head :: tail = List(1,2,3,4)
    head should equal( __ )
    tail should equal( __ ) // tail is a list.
  }

  
  koan ("Lists can accessed at random") {
        val a = List(1,3,5,7,9)
        a(0) should equal (1)
        a(2) should equal (5)
        a(4) should equal (9)

        intercept[NoSuchElementException] {
            println(a(5))
        }
    }

  koan("Arrays are mutable") {
    val array = Array(1, 2, 3, 4)
    array(0) should equal(__)

    // The apply rule again
    array.apply(3) should equal(__)

    // Array can be changed
    array(0) = 42

    array(0) should equal(__)
  }

  koan("Mutable sets") {
    // In Scala, you can bring a package to the scope of a method.
    import scala.collection.mutable.Set

    val southAfricans = Set("Braai", "Wine", "Sundowners")

    // Sets define a membership function
    southAfricans("Braai") should be(__) // true or false

    southAfricans("Traffic jam") should be(__)

    // The set is mutable, so I can add to it
    southAfricans += "Rugby"

    val australians = Set("Rugby", "Sports")

    // What have aussies and south africans in common?
    (australians intersect southAfricans) should equal(Set(__))
  }

  koan("Immutable sets") {
    // In Scala, default imported Set is immutable

    val southAfricansLike = Set("Braai", "Wine", "Sundowners")
    val guillaumeLikes = southAfricansLike + "Cheese"

    guillaumeLikes("Braai") should be(__)

    guillaumeLikes("Wine") should be(__)

    guillaumeLikes("Cheese") should be(__)
  }

  koan("Maps....") {
    val capitals = Map(
      "SA" -> "Pretoria",
      "France" -> "Paris",
      "USA" -> "Washington DC")
      
      capitals("SA") should equal ( __ )
    
     // Apply rule again :-)
    capitals.apply("SA") should equal ( __ )

    // The apply rule fails with an exception if the key does not exist.
    intercept[NoSuchElementException]{
      capitals("London")
    }
    
    // Or you can use get to retrieve an Option
    
    capitals.get("France") should equal (Some("France"))

    capitals.get("London") should equal (None)
    
  }
}
