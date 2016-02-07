package com.akkagamengine.desktop

import com.akkagamengine.core.AkkaGameEngine
import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

object DesktopLauncher extends App {
  val config = new LwjglApplicationConfiguration()
  new LwjglApplication(new AkkaGameEngine(), config)
}