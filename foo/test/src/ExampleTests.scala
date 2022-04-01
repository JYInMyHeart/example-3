package foo
import utest._
object ExampleTests extends TestSuite{
  def tests = Tests{
    test("hello"){
      val result = Example.hello()
      assert(result == "Hello World")
      result
    }
    test("flexibleFizzBuzz"){
      val result  = Example.flexibleFizzBuzz(println(_))
      val output = new Array[String](100)
      var i = 0
      val result1  = Example.flexibleFizzBuzz { s =>
        output(i) = s
        i += 1
      }
      assert(output(0) == "1")

    }
  }
}
