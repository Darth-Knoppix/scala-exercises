package com.sethcorker.scalatra_app

import org.scalatra.test.scalatest._

class ScalatraAppTests extends ScalatraFunSuite {

  addServlet(classOf[ScalatraApp], "/*")

  test("GET / on ScalatraApp should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
