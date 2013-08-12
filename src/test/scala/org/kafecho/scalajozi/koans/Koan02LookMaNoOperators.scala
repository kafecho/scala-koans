package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan02LookMaNoOperators extends KoanSuite {

  koan("In scala, -,+,/,* are methods, not operators") {
    (1 + 1) should equal(__)
    (1. + (1)) should equal(__)
    (1. * (5)) should equal(__)
  }

  koan("methods can be invoked like operators") {
    val s = "hello"
    s.length should be(__)

    (s length) should be(__)

    (s contains "x") should be(__)
  }

  koan("Simple rationals") {

    case class Rational(num: Int, denum: Int) {
      def *(another: Rational): Rational = {
        Rational(this.num * another.num, this.denum * another.denum)
      }

      Rational(1, 2) * Rational(2, 1) should equal( __ )
    }
  }

}