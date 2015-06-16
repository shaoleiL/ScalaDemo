package crazyJvm.week2

/**
 * Created by shaolei on 2015/6/16.
 */
class MatchDemo {

}

object MatchDemo extends App{

  val value = 1
  val result = value match {
    case 1 => "这是  1 "
    case 2 => "这是  2 "
    case _ => "其他值 "
  }

  val result2 = value match{
    case i if i == 1 => "这是  11 "
    case i if i == 2 => "这是  2 "
    case _ => "其他值 "
  }
  println(result2)

  def t(obj:Any)  = obj match {
    case x: Int => "this is Int type"
    case s: String => "this is String type"
    case _ => "other type"
  }

  println(t(1L))
}


