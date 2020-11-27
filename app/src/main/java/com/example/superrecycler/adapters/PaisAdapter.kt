package com.example.superrecycler.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.R
import com.example.superrecycler.modelo.pais
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pais_item.view.*
import java.util.ArrayList

class PaisAdapter(paises:ArrayList<pais>, contexto:Context): RecyclerView.Adapter<PaisAdapter.ViewHolder>() {
    var paises:ArrayList<pais>? = null
    var contexto:Context? = null

    init {
        this.paises = paises
        this.contexto = contexto

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaPais:View = LayoutInflater
            .from(contexto).
            inflate(R.layout.pais_item,parent,false)
        val paisViewHolder = ViewHolder(vistaPais)
        vistaPais.tag = paisViewHolder
        return paisViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pais = paises!![position]
        holder.tvNombre!!.text = pais.nombre

        Picasso.get().load(pais.imagen)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imagenFondo)

    }

    override fun getItemCount(): Int {
       return this.paises!!.count()
    }



    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista) {
        var imagenFondo: ImageView? = null
        var tvNombre:TextView? = null

        init {
            imagenFondo = vista.findViewById(R.id.idFondo)
            tvNombre = vista.findViewById(R.id.tvNombre)
        }


    }


}