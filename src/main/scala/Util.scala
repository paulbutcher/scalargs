package com.paulbutcher.scalargs

object Util {
  def asPairs[T](seq: Seq[T]) = seq match {
    case s if s.isEmpty => Seq()
    case s => {
      val successors = s.tail.map(x => Some(x)) :+ None
      s zip successors
    }
  }
}