package crazyJvm.week2

/**
 * Created by shaolei on 2015/6/17.
 * 编写?个BankAccount类，假如deposit和withdraw?法，和?个只读的balance属性。
 */
class BankAccount {
  def apply() = new BankAccount
  private var account: Int = 0

  def deposit(money: Int): Unit ={
    account += money
    println(s"There is $account yuan in your account!")
  }

  def withdraw(money : Int): Unit ={
    assert(money <= account,"The money you withdraw should be less than account!" )
    account -= money
    println(s"There is $account yuan in your account!")
  }

  def balance = account

}

object BankAccount extends App{
  val a = new BankAccount
  a.deposit(100)
  println(a.balance)
  a.withdraw(100)
}
