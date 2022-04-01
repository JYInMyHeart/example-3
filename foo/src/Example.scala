package foo
object Example{
  def main(args: Array[String]): Unit = {
    def printMessages(message:Array[Msg]):Unit = {
      def printMessage(msg: Msg) = {
        val spaces = if (msg.parent.isEmpty) "" else
      }
    }
    printMessages(Array(
    new Msg(0, None, "Hello"),
    new Msg(1, Some(0), "World"),
    new Msg(2, None, "I am Cow"),
    new Msg(3, Some(2), "Hear me moo"),
    new Msg(4, Some(2), "Here I stand"),
    new Msg(5, Some(2), "I am Cow"),
    new Msg(6, Some(5), "Here me moo, moo") ))
  }
  def hello(): String = "Hello World"


  def flexibleFizzBuzz(callback:String => Unit) = {
    for (i <- Range.inclusive(1, 100)) {
      callback(
        if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
        else if (i % 3 == 0) "Fizz"
        else if (i % 5 == 0) "Buzz"
        else i.toString
      )
    }
  }


}

class Msg(val id:Int,val parent:Option[Int],val txt:String)

