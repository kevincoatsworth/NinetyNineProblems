import scala.util.control.TailCalls.TailRec

class ListFunctions {

  def findLastListElement[A](list: List[A]): A = {
    list.last
  }

  def findPenultimateListElement[A](list: List[A]): A = {
    list.reverse(1)
  }

  def findNthListElement[A](nth: Int, list: List[A]): A = {
    list(nth)
  }

  def findNumberOfElements[A](list: List[A]): Int = {
    list.length
  }

  def reverseList[A](list: List[A]): List[A] = {
    list.reverse
  }

  def checkIfPalindrome[A](list: List[A]): Boolean = {
    list == list.reverse
  }

  def flattenNestedLists[A](list: List[A]): List[A] = {
    list flatMap {
      case x: List[A] => flattenNestedLists(x)
      case e => List(e)
    }
  }

  def elimateConsecutives[A](list: List[A]): List[A] = {
    def compress(result: List[A], currentList: List[A]): List[A] = currentList match {
       case h :: tail => compress(h :: result, tail.dropWhile(_ == h))
       case Nil => result.reverse
    }
     compress(Nil, list)
  }

}
