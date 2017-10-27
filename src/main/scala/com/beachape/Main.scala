package com.beachape

import com.softwaremill.macwire._
object Main {

  private lazy val config = {
    val host = "https://my-api.com"
    val port = 9000
    wire[Config]
  }

  private lazy val client = wire[Client]

  def main(args: Array[String]): Unit = {
    println(client)
  }

}
