// build.sc
import mill._, scalalib._

object foo extends JavaModule {
  def mainClass = Some("Main")
}
