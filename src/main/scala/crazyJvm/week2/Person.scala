package crazyJvm.week2

/**
 * Created by shaolei on 2015/6/16.
 */
class Person(val name:String , val age: Int) {
  println("��������")
  var email:String = _
  def sey(): Unit ={
    println("��������˵")
  }


  def this(name:String,  age:Int, email:String){
    this(name,age)
    this.email = email
  }
}

class student(name:String, age:Int,var school:String) extends Person(name, age){
  override def sey(): Unit ={
    println("����˵")
  }
}

object Person {

  def main(args: Array[String]) {
//    val p = new Person("С��", 22, "abc@126.com")
    val s = new student("С��", 25, "BJDX")
//    println(p.name +" = "+ p.email)
    println(s.name +" = "+s.school)
    s.sey()
  }
}
