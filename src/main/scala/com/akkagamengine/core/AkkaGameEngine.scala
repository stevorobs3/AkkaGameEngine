package com.akkagamengine.core

import com.badlogic.gdx.graphics.g2d.{Sprite, SpriteBatch}
import com.badlogic.gdx.graphics.{GL20, Texture}
import com.badlogic.gdx.{ApplicationListener, Gdx}

class AkkaGameEngine extends ApplicationListener
  with HasLogger {
  val LogId = "AkkaGameEngine"

  lazy val batch = new SpriteBatch()
  lazy val texture = new Texture(Gdx.files.internal("Assets/libgdx.png"))
  var sprite : Sprite = new Sprite()

  override def create(): Unit = {
    Gdx.gl.glClearColor(1, 0, 0, 1)
  }

  override def render(): Unit = {
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    batch.begin()
    batch.draw(texture,0,0)
    batch.end()
  }

  override def resize(width: Int, height: Int): Unit = {}

  override def dispose(): Unit = {
    batch.dispose()
    texture.dispose()
  }

  override def pause(): Unit = {}

  override def resume(): Unit = {}
}
