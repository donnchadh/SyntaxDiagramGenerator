package net.t32leaves.syntaxDiagramGenerator
import org.{ scalatest, junit }
@junit.runner.RunWith(classOf[scalatest.junit.JUnitRunner])
class SyntaxDiagramGeneratorSpec extends scalatest.FlatSpec with scalatest.matchers.ShouldMatchers {
  "SyntaxDiagramGenerator" should "be able to process the sample grammar" in {
    Main.main(Array("src/main/scala/ebnf/EBNFParser.scala")) 
  }
  it should "create image files in the output directory" in { 
    val out = "." // TODO output to dedicated directory, include in .gitignore
    new java.io.File(out).list should contain("definitions_list.pdf")
  }
}