package Test

import scala.io.Source

object Main{
  def test1(): Unit ={
    val file = Source.fromFile("C:\\Users\\ynats\\IdeaProjects\\untitled\\src\\a.txt")
    val lines = file.getLines()
    for (content<-lines){
      println(content)
    }
  }

  def test2(): Unit ={
    val className = new ClassName
    className.getName()
    println(className.sayName)
  }
  def test3(): Unit ={
    println(Person.getAge)
    println(Person.getAge)
  }

  def test4(): Unit ={
    val cats = new Cats
    println(cats)
    cats.run
    cats.eat
  }
  def test5(): Unit ={
    val person = new Person("natsu")
    val person1 = new Person("natsu",18,"male")
    println(person.getName)
    person1.getName_=("lala")
  }
  def test6(): Unit ={
    val c = Map("china"->"beijing","english"->"landon")
    println(c.get("china"))
    println(c.get("india"))
  }

  def test7(x:Int)=(y:Int)=>(z:Int)=>x*y*z

  def func1(n:Int):Int={
    val myfunc = (i:Int,x:Int)=>i*x
    return myfunc.apply(n,2)
  }

  def h(x:Int)=x

  def func2(x:Int=>Int)=x

  def test8(x:Int,y:Int,z:Int)=x+y+z

  def test9(x:Int)(y:Int)(z:Int)=x+y+z

  def test10(x:String*): Unit ={
    for(c<-x)
      println(c)
  }

  def test11(data:String): Unit ={
    data match {
      case "a"=>println("a")
      case "b"=>println("b")
      case _=>println("null")
    }
  }
  def test12[T](a:List[T])={
    println(a.length)
  }
  def test13(i:Int): Unit ={
    println(i.toString)
  }
  def main(args: Array[String]): Unit = {
    test13(1)
  }
}
