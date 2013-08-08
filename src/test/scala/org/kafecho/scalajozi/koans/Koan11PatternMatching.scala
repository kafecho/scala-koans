package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan11PatternMatching extends KoanSuite{
  koan("Pattern matching is a switch statement on steroids"){

    val name : String = "Fred"
      
    val answer = name match{
      case "Fred" 	=> "Hi Fred"
      case "Julio" 	=> "Hola Julio"
      case "Paula"  => "Ciao Paula"
    }
    
    answer should be ( __ )
  }
  
  koan("You can deconstruct lists when pattern matching."){

    val list = List("Hello","World")
    
    list match{
      case "Hello" :: tail => println ("You've said hello")
      case _ => println ("Default statement")
    }
  }
  
  koan("You can use case classes for pattern matching."){

    case class Person(firstname:String, surname : String)
    
    def matchThis ( p : Person) : String = p match{
      case Person("Guillaume",_) => "Bonjour Guillaume"
      case Person(_,"Bond") => "Hi 007"
      case Person( name,_) => s"Hi $name"
    }
    
    matchThis( Person("Guillaume","Belrose")) should be (__)

    matchThis( Person("James","Bond")) should be (__)
    
  }

}