package crazyJvm.week2

/**
 * Created by shaolei on 2015/6/16.
 */
class WeekTwo {
}

class ApplyTest {
  def apply()="ÀàµÄapply()"
}

object ApplyTest {
  def apply() = "objectµÄapply()"
}

object WeekTwo extends App{

  var a = ApplyTest
  println(a())

  var a2 = new ApplyTest
  println(a2())
}
