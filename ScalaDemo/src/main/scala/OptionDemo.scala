/**
 * FileName: OptionDemo
 * Date:   20242024/11/26上午9:28
 * Description:${DESCRIPTION}
 * <author> maziyu
 */
object OptionDemo extends App{
    val maybeString: Option[String] = Option("Hello World")

    maybeString match {
      case Some(s:String) => println(s)
      case None => println("No String")
    }



    val maybeStringNone: Option[String] = None

    maybeStringNone match {
     case Some(i:String) => println(i)
     case None => println("No Int")
    }
}
