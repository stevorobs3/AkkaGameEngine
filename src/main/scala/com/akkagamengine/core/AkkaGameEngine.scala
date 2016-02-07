package com.akkagamengine.core

import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.{ApplicationListener, Gdx}
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class AkkaGameEngine extends ApplicationListener {
  lazy val spriteBatch = new SpriteBatch()

  override def create(): Unit = {
    Gdx.gl.glClearColor(1, 0, 0, 1)
  }

  override def render(): Unit = {
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
  }

  private def update(func: SpriteBatch => Unit) = {
  }
  override def dispose(): Unit = {
  }

  override def resume(): Unit = {}

  override def resize(width: Int, height: Int): Unit = {}

  override def pause(): Unit = {}
}
