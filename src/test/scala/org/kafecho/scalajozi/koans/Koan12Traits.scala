package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Koan12Traits extends KoanSuite{
koan ("traits") {
    trait SaysHello {
      def sayHello(name: String) = "hello " + name
    }

    class Thing extends SaysHello

    (new Thing).sayHello("Lou") should be(__)
  }

  koan ("traits can have abstract members which must be implemented") {
    trait SaysHello {
      val name: String
      def sayHello = "hello " + name
    }

    case class Person(name: String) extends SaysHello
    val p = Person("lou")

    p.sayHello should be(__)
  }

  koan ("multiple traits can be mixed in") {
    trait SaysHello {
      val name: String
      def sayHello = "hello " + name
    }

    trait SaysHelloTwice extends SaysHello {
      override def sayHello = super.sayHello + " " + super.sayHello
    }

    case class Person(name: String) extends SaysHello with SaysHelloTwice

    val p = Person("lou")

    p.sayHello should be(__)
  }

}