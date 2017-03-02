package com.akkagamengine.core

import com.badlogic.gdx.graphics.Texture.TextureFilter
import com.badlogic.gdx.graphics.{GL20, OrthographicCamera, Texture}
import com.badlogic.gdx.{ApplicationListener, Gdx}
import com.badlogic.gdx.graphics.g2d.{Sprite, SpriteBatch, TextureRegion}

class AkkaGameEngine extends ApplicationListener
  with HasLogger {
  val LogId = "AkkaGameEngine"

  lazy val camera = new OrthographicCamera(1, Gdx.graphics.getHeight/ Gdx.graphics.getWidth)
  lazy val batch = new SpriteBatch()
  lazy val texture = new Texture(Gdx.files.internal("Assets/libgdx.png"))
  var sprite : Sprite = new Sprite()

  override def create(): Unit = {
    camera
    batch
    info(s"${texture.getWidth} by ${texture.getHeight}")
    texture.setFilter(TextureFilter.Linear, TextureFilter.Linear)
    val region = new TextureRegion(texture, 0, 0, 318, 159)
    sprite = new Sprite(region)

    info(s"${sprite.getX}, ${sprite.getY}, ${sprite.getWidth}, ${sprite.getHeight}")
  }

  override def render(): Unit = {
    Gdx.gl.glClearColor(1, 1, 1, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    batch.setProjectionMatrix(camera.combined)
    batch.begin()
    sprite.draw(batch)
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
