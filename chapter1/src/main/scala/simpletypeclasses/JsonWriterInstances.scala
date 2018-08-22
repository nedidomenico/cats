package simpletypeclasses

/**
  * The instances of a type class provide implementations for the types we care about,
  * including types from the Scala standard library and types from our domain model.
  *
  * In Scala we define instances by creating concrete implementations of the type class
  * and tagging them with the implicit keyword:
  *
  */

object JsonWriterInstances {

  implicit val stringWriter: JsonWriter[String] =
    new JsonWriter[String] {
      def write(value: String): Json =
        JsString(value)
    }

  implicit val personWriter: JsonWriter[Person] =
    new JsonWriter[Person] {
      def write(value: Person): Json =
        JsObject(Map(
          "name" -> JsString(value.name),
          "email" -> JsString(value.email)
        ))
    }

  def getInst[A](implicit w: JsonWriter[A]) = w

  def apply[A]: JsonWriter[A] = getInst[A]

}
