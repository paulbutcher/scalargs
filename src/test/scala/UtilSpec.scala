package com.paulbutcher.scalargs.test

import org.scalatest.Spec
import com.paulbutcher.scalargs.Util._

class UtilSpec extends Spec {

  describe("asPairs") {

    it("should return an empty sequence given an empty sequence") {
      expect(Seq()) { asPairs(Seq()) }
    }
    
    it("should return a single pair given a one-element sequence") {
      expect(Seq(("foo", None))) { asPairs(Seq("foo")) }
    }
    
    it("should return three pairs given a three-element sequence") {
      expect(Seq(("foo", Some("bar")), ("bar", Some("baz")), ("baz", None))) {
        asPairs(Seq("foo", "bar", "baz"))
      }
    }
  }
}
