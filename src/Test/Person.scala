package Test
object Person {
  println("scala")
  val age = 10
  def getAge = age
}
class Person(name:String){
  println(s"$name")
  var myname :String = name
  def getName = this.myname
  def getName_=(newname:String){
    myname = newname
    println(myname)
  }


  def this(name:String, age:Int){
    this(name)
    println(name+" "+age)
  }

  def this(name:String, age:Int, sex:String){
    this(name)
    println(name+" "+age+" "+sex)
  }
}