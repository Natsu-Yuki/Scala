package Test
class Cats extends Animals {
  override def eat: Unit = {
    println("eating mouse")
  }

  override def run: Unit = {
    println("running")
  }

  override def toString = s"Cats($eat, $run)"
}
