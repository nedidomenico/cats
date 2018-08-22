package simpletypeclasses

/***
  *
  * A type class is an interface or API that represents some functionality we want
  * to implement. In Cats a type class is represented by a trait with at least
  * one type parameter. For example, we can represent generic “serialize to JSON”
  * behaviour as follows:
  *
  */


// The "serialize to JSON" behaviour is encoded in this trait
trait JsonWriter[A] {
  def write(value: A): Json
}