/**
 * FileName: HelloWorld
 * Author: bai
 * Date:   20242024/7/8下午2:03
 * Description:${DESCRIPTION}
 * <author> maziyu
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val item = ("HN_CMCC_GVP_HW|河南移动软终端-大屏/中屏|0|0|0|0|0|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0")

    val strings = item.split("\\|")

    println(strings(2))

    println(strings(14))

    println("1".equalsIgnoreCase(strings(2)))
  }

}
