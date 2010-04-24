package com.paulbutcher.scalargs

import Util._

class Parser(descriptions: ArgumentHandler*) {
  def parse(args: Array[String]) = {
    for {
        pair <- asPairs(args)
        if (!descriptions.exists(_.handles(pair._1, pair._2)))
      } yield pair._1
  }
}

object arg {
  def apply[T: Manifest](short: String, long: String, description: String, action: T => Unit) = {
    new ArgumentDescription(action, Some(short), Some(long), Some(description))
  }
}
