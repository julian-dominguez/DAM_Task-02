package com.juliandominguez.dam_task_02.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.juliandominguez.dam_task_02.R
import com.juliandominguez.dam_task_02.`class`.Hero
import com.juliandominguez.dam_task_02.databinding.ItemListBinding

/**
 * Clase encargada del paso de información al RecyclerView
 * Esta clase es de tipo RecyclerView y su adapter, es el adapter interno creado para el manejo de
 * su información.
 */
class HeroAdapter constructor(private val _dataSetHeroes: List<Hero>) : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    private lateinit var _context: Context

    /**
     * Clase interna de tipo ViewHolder que me permite enlazar el RecyclerView con el Item (View),
     * ademas de permitir acceder a los componentes gráficos de la vista.
     */
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        // Me permite acceder a los elementos de la vista (item_list.xml)
        val viewBinding = ItemListBinding.bind(view)
    }


    // Va creando los elementos (Componentes) dinamicamente
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        _context = parent.context

        // Se crea el componente visual
        val view = LayoutInflater.from(_context).inflate(R.layout.item_list, parent, false)

        return ViewHolder(view)
    }

    // Le asigna los valores a cada componente
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hero = _dataSetHeroes[position]
        with(holder) {
            viewBinding.tvNameHero.text = hero.name
            viewBinding.tvAlterEgo.text = hero.alterEgo
        }
    }

    // Cuenta los elementos que debe crear
    override fun getItemCount(): Int = _dataSetHeroes.size

}