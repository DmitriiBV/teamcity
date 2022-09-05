import org.json4s.jackson

object example {

  def main(args: Array[String]):Unit = {

    val jsonString = os.read(os.pwd/"spark_config.json")

    val jsonString2 = os.read(os.pwd/"other.json")

    var json = jackson.JsonMethods.parse(jsonString)

    var data = ujson.read(jsonString)

    println(json)

    println()

    println(data)



  }
}
