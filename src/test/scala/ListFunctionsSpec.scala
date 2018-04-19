import org.scalatest.{MustMatchers, WordSpec}

class ListFunctionsSpec extends WordSpec with MustMatchers {

  val testFunction = new ListFunctions

  "findLastListElement" must {
    "return 8 when given List(1,1,2,3,5,8)" in {
      testFunction.findLastListElement(List(1,1,2,3,5,8)) mustEqual 8
    }
  }

  "findPenultimateListElement" must {
    "return 5 when given List(1,1,2,3,5,8)" in {
      testFunction.findPenultimateListElement(List(1,1,2,3,5,8)) mustEqual 5
    }
  }

  "findNthListElement" must {
    "return 2 when given an nth of 2 and List(1,1,2,3,5,8)" in {
      testFunction.findNthListElement(2,List(1,1,2,3,5,8)) mustEqual 2
    }
  }

  "findNumberOfElements" must {
    "return 6 when given List(1,1,2,3,5,8)" in {
      testFunction.findNumberOfElements(List(1,1,2,3,5,8)) mustEqual 6
    }
  }

  "reverseList" must {
    "return List(8,5,3,2,1,1) when given List(1,1,2,3,5,8)" in {
      testFunction.reverseList(List(1,1,2,3,5,8)) mustEqual List(8,5,3,2,1,1)
    }
  }

  "checkIfPalindrome" must {
    "return true when given List(1,2,3,2,1)" in {
      testFunction.checkIfPalindrome(List(1,2,3,2,1)) mustEqual true
    }
  }

  "flattenNestedLists" must {
    "return List(1,1,2,3,5,8) when given List(List(1,1),2,List(3,List(5,8)))" in {
      testFunction.flattenNestedLists(List(List(1,1),2,List(3,List(5,8)))) mustEqual List(1,1,2,3,5,8)
    }
  }

  "eliminateConsecutives" must {
    "return List(a,b,c,a,d,e) when given List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')" in {
      testFunction.elimateConsecutives(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')) mustEqual List('a','b','c','a','d','e')
    }
  }
}