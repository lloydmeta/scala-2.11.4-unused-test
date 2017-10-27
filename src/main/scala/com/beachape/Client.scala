package com.beachape

class Client(config: Config) {

  override def toString: String = s"Client[${config.host}:${config.port}]"

}
