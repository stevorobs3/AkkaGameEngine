package com.akkagamengine.core

import com.badlogic.gdx.Gdx

trait HasLogger {
  val Prefix : String

  def debug(message : String) : Unit = {
    Gdx.app.debug(Prefix, message)
  }

  def info(message : String) : Unit = {
    Gdx.app.log(Prefix, message)
  }

  def error(message : String) : Unit = {
    Gdx.app.debug(Prefix, message)
  }
}