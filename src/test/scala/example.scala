package com.paulbutcher.scalargs.example

import com.paulbutcher.scalargs.{Parser, arg}

object Example {
  def main(args: Array[String]) {
    val parser = new Parser(
      arg("-t", "--test", "A test argument", (arg: Int) => {println(arg)})
    )
    val unhandled = parser.parse(args)
  }
}
