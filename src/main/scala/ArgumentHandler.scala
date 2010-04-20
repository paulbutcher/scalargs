package com.paulbutcher.scalargs

trait ArgumentHandler {
  def handles(arg: String, subsequent: Option[String]): Boolean
}
