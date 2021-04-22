package com.sethcorker.scalatra_app

import org.scalatra._

class ScalatraApp extends ScalatraServlet {
  var orders = List(1, 2, 3, 4, 5)

  get("/") {
    views.html.hello()
  }

  get("/orders/?") {
    orders
  }

  post("/orders/?") {
    orders = orders ++ List(orders.last + 1)
    status_=(204)
  }

  delete("/orders/:id/?") {
    val id = params("id").toInt
    val statusCode = if (orders.contains(id)) 200 else 400
    orders = orders.filterNot(x => x == id)
    status_=(statusCode)
  }

}
