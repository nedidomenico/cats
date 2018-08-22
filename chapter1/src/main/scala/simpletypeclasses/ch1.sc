import simpletypeclasses.JsonWriterInstances._
import simpletypeclasses.JsonSyntax._
import simpletypeclasses._ //{Json, JsonInst, JsonWriterInstances, Person}


val a = JsonInst.toJson(Person("Dave", "dave@example.com"))
val a2 = JsonInst

val b = Person("Dave", "dave@example.com").toJson

val c = JsonWriterInstances[Json]

val d = JsonWriterInstances.apply[Json]



