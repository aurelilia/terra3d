package xyz.angm.rox

import xyz.angm.rox.Family.Companion.allOf
import xyz.angm.terra3d.common.ecs.components.specific.DayTimeComponent
import xyz.angm.terra3d.common.ecs.dayTime

fun main() {
    dayTime
    val fam = allOf(DayTimeComponent::class)
    val engine = Engine()
    val e = engine.entity { with<DayTimeComponent>() }
    engine.remove(e)
    val ed = engine.entity { with<DayTimeComponent>() }
    println(engine[fam])
}