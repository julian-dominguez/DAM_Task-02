package com.juliandominguez.dam_task_02.`class`

data class Hero constructor(var name:String, var alterEgo:String, var imgUrl:String) {

    fun getFullName(): String = "$alterEgo => $name"
}