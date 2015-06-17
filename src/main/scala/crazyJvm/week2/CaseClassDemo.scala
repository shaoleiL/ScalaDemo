package crazyJvm.week2

/**
 * Created by shaolei on 2015/6/17.
 */
class CaseClassDemo {

}

object CaseClassDemo extends App{

  def m(p: Person2): String ={
    p match {
      case Teacher2(_) => "this is teacher"
      case Student2(_) => "this is student"
      case _ => "other type"
    }
  }

  println(m(Student2("ww")))
}

abstract class Person2
case class Teacher2(name:String) extends Person2
case class Student2(name:String) extends Person2
