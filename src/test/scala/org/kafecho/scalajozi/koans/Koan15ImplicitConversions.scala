package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class Koan15ImplicitConversions extends KoanSuite {

  koan("Working with frequencies"){
   case class Hertz(value: Long)
  object Conversions {
    /** Monkey patch a Long to add extra frequency related methods.*/
    implicit class FrequencyConversion(what: Long) {
      def Hz = Hertz(what)
      def kHz = Hertz(what * 1000)
      def MHz = Hertz(what * 1000 * 1000)
      def GHz = Hertz(what * 1000 * 1000 * 1000)
    }
  }
  
  import Conversions._
  
  val frequency = 5 GHz

  frequency.isInstanceOf[Hertz] should be ( __ )
 
  frequency.isInstanceOf[Int] should be ( __ )
  }
}