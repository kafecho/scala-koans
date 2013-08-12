package org.kafecho.scalajozi.koans

import org.junit.runner.RunWith
import org.kafecho.scalajozi.koans.support.KoanSuite
import org.scalatest.junit.JUnitRunner
import scala.annotation.tailrec

@RunWith(classOf[JUnitRunner])
class Koan16Recursion extends KoanSuite{

  koan("Recursive factorial"){

    /** This implementation of factorial is not tail recursive.
      * The last method that it calls is not itself.
      * Therefore, if n is large, it will run out of stack space.*/
    def fact(n : Int) : Int = {
      if ( n <= 1) 1
      else n * fact( n - 1)
    }
  }

  koan("Tail recursive factorial"){

    def fact(n : Int) : Int = {

      @tailrec
      /** This implementation is tail recursive. The compiler re-writes this as a loop.*/
      def tailRecFact(acc:Int, n: Int) : Int = {
        if ( n <= 1) acc
        else tailRecFact(acc * n, n - 1)
      }

      tailRecFact(1,n)
    }
  }

}
