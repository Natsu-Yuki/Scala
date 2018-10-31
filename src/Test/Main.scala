package Test

import scala.collection
import scala.collection.parallel.mutable
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
  def test14()={
    val a = Array(1,2,3,4)

    val b = a.reduceLeft(_*_)
    println(b)
  }

  def test15(): Unit ={
    var list = List(1,2,3,4)

    list.foreach(println(_))
    var b = 0::list


    println(list.head)
    println(list.tail)
    b.foreach(println(_))
  }

  def test16(): Unit ={
    val set = new collection.mutable.HashSet[Int]()
    set+=1
    set.foreach(println(_))
    println()
    val sett = new  collection.mutable.LinkedHashSet[Int]()
    sett+=(1,2,3,35,6)
    sett.foreach(println(_))

  }

  def test17(): Unit ={
    List("natsu","yuki").map("my name is"+_).foreach(println(_))
    List("natsu yuki").map(_.split(" ")).foreach(println(_))
    val l =  List("natsu","yuki").zip(List(100,100))
    println(l.map(_._1))
  }

  def test18(name:String){
    name match {
      case _name=>println(_name)
    }
  }
  def test19(): Unit ={
    val s = new Student[Int,String](18,"natsu")

  }
  def main(args: Array[String]): Unit = {

    test19()

  }
}
