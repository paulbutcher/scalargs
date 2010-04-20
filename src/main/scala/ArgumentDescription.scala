package com.paulbutcher.Scalargs

class ArgumentDescription[T: Manifest](
    action: T => Unit,
    short: Option[String] = None,
    long: Option[String] = None,
    description: Option[String] = None)
  extends ArgumentHandler {
    
  override def handles(value: String, subsequent: Option[String]) = {
    implicitly[Manifest[T]] match {
      case m if m <:< manifest[Int] => println("Argument is an int")
      case _ => println("Argument is something else");
    }
    print(value)
    false
  }
}
