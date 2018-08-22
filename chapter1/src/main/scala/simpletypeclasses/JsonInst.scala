package simpletypeclasses

/***
  *
  * A type class interface is any func onality we expose to users. Interfaces are
  * generic methods that accept instances of the type class as implicit parameters.
  * There are two common ways of specifying an interface: Interface Objects and
  * Interface Syntax.
  *
  * The simplest way of crea ng an interface is to place methods in a singleton
  * object:
  *
  */

object JsonInst {
  def toJson[A](value: A)(implicit w: JsonWriter[A]): Json =
    w.write(value)
}