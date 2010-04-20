package com.paulbutcher.Scalargs.example

import com.paulbutcher.Scalargs.{Parser, arg}

object Test {
  def main(args: Array[String]) {
    val parser = new Parser(
      arg("-t", "--test", "A test argument", (arg: Int) => {println(arg)})
    )
    val unhandled = parser.parse(args)
  }
}
