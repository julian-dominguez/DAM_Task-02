package com.juliandominguez.dam_task_02.`class`

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.juliandominguez.dam_task_02.databinding.ItemListBinding

/**
 * Clase encargada del paso de información al RecyclerView
 * Esta clase es de tipo RecyclerView y su adapter, es el adapter interno creado para el manejo de
 * su información.
 */
class HeroAdapter constructor(private val heroes: List<Hero>): RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    /**
     * Clase interna de tipo ViewHolder que me permite enlazar el RecyclerView con el Item (View),
     * ademas de permitir acceder a los componentes gráficos de la vista.
     */
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        /**
         * Me permite acceder a los elementos de la vista (item_list.xml)
         */
        val viewBinding = ItemListBinding.bind(view)
    }

    /**
     * Va creando los elementos (Componentes)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    /**
     * Le asigna los valores a cada componente
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    /**
     * Cuenta los elementos que debe crear
     */
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}