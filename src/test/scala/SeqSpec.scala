import org.scalatest._
import org.scalatest.matchers._

class SeqSpec extends FreeSpec with GivenWhenThen with  ShouldMatchers{
	"A Seq" - {
		"New Seq" in {
			given("new seq(1,2,3)")
			val seq = Seq(1,2,3)
			when("check size")
			val size = seq.size
			then("size should be 3")
			size should be (3)
		}
		"Add new value" in {
			given("seq(1,2,3)")
			val a = Seq(1,2,3)
			when("add new value")
			val b = a :+ 4
			val size = b.size
			println("## ->" + b)
			then("size should be 4")
			size should be (4)
		}
	}
	
}