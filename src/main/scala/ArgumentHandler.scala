package com.paulbutcher.Scalargs

trait ArgumentHandler {
  def handles(arg: String, subsequent: Option[String]): Boolean
}
