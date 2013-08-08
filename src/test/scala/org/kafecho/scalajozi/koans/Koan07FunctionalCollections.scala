package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan07Collections extends KoanSuite {
  
  koan("Filtering"){
    val numbers = List(1,2,3,4,5,6,7,8)
    val oddNumbers = numbers.filter( n => n % 2 == 0)
    oddNumbers should equal (List( __))
    
    val evenNumbers : List[Int]= ??? // Complete this code
    evenNumbers should equal (List(1,3,5,7))
  }
  
  koan("Map: apply a function to all elements of a collection."){
    
    val numbers = List(1,2,3,4)
    
    val squared = numbers.map ( n => n * n)
    
    squared should equal (List( __))
    
    val plusOne = (x : Int) => ??? // Write a function which adds 1 to a number
    
    numbers.map (plusOne) should equal(List(2,3,4,5))
  }
  
  koan("foreach is for side effects"){
    val audience = Set("Guillaume","Jacques","Eric")

    val returnType = audience.foreach (a => println (a))
    
    returnType.isInstanceOf[Unit] should equal( __ )
  }
  
  koan ("Lists can be 'reduced' with a mathematical operation") {
        val list = List(1,3,5,7)
        // note the two _s below indicate the first and second args respectively
        list.reduceLeft( (a,b) => a + b ) should equal (16)
        list.reduceLeft( (a,b) => a * b ) should equal (105)
    }
  
  
  koan("In Scala, Strings are considered collection of characters."){
    // Longest word in Afrikaans: http://en.wikipedia.org/wiki/Longest_words#Afrikaans
    val longestWord = "Tweedehandsemotorverkoopsmannevakbondstakingsvergaderingsameroeperstoespraakskrywerspersverklaringuitreikingsmediakonferensieaankondiging"

    // Let's find how many 'e's in that word.
    val theEs = longestWord.toLowerCase.filter(c => c == 'e')
    
    theEs.size should equal (20)

    // Find the 'o's:
    val theOs = longestWord.toLowerCase.filter(c => ???) // Complete this
    
    theOs.size should equal (6)
    
    // Another more generic approach using groupBy
    // groupBy: for a given character c, find all characters in the string that are c.
    val groups : Map[Char,String]= longestWord.toLowerCase().groupBy( c => c)

    // Let's work out how often a given character appears. 
    val counts = groups.mapValues(s => s.length())
    
    counts('e') should equal(20)
    
    counts('o') should equal (6)
  }

  
}
