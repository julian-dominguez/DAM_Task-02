package com.juliandominguez.dam_task_02.interfaces

import com.juliandominguez.dam_task_02.`class`.Hero

/**
 * Interface puente entre el HeroAdapter y el MainActivity
 */
interface OnClickListener {

    fun onClick(hero: Hero)

}