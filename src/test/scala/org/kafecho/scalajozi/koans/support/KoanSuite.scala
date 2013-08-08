package org.kafecho.scalajozi.koans.support

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite
import org.scalatest.matchers.Matcher
import org.scalatest.exceptions.TestPendingException
import org.scalatest.exceptions.TestFailedException

trait KoanSuite extends FunSuite with ShouldMatchers {

  def koan(name: String)(fun: => Unit) = test(name)(fun)

  def __ : Matcher[Any] = { fail("Please fill the __") }
    //throw new TestFailedException("Missing code")
  //}

}