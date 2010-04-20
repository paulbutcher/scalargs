package com.paulbutcher.Scalargs

class Parser(descriptions: ArgumentHandler*) {
  def parse(args: Array[String]) = {
    if (args.isEmpty)
      args
    else {
      val argsTail = args.tail.map(x => Some(x))
      val argumentPairs = args.zipAll(argsTail, "", None)
      for {
          pair <- argumentPairs
          if (!descriptions.exists(_.handles(pair._1, pair._2)))
        } yield pair._1
    }
  }
}

object arg {
  def apply[T: Manifest](short: String, long: String, description: String, action: T => Unit) = {
    new ArgumentDescription(action, Some(short), Some(long), Some(description))
  }
}
