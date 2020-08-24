package xyz.angm.terra3d.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import xyz.angm.terra3d.client.Terra3D

fun main() {
    val config = LwjglApplicationConfiguration()
    LwjglApplication(Terra3D(), config)
}
