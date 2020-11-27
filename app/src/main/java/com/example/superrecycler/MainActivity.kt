package com.example.superrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.adapters.PaisAdapter
import com.example.superrecycler.modelo.pais
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.miRecycler)

        val listaPaises = ArrayList<pais>()

        listaPaises.add(pais("México", "https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fwww.tamaulipas.gob.mx%2Ffomentocivico%2Fwp-content%2Fuploads%2Fsites%2F20%2F2017%2F04%2Fbandera-mexico-portavox-e1492461746506.jpg"))
        listaPaises.add(pais("Estados Unidos", "https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fwww.lifeder.com%2Fwp-content%2Fuploads%2F2018%2F11%2Fbandera-1795-1818.png"))
        listaPaises.add(pais("Venezuela", "https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Fthumb%2F0%2F06%2FFlag_of_Venezuela.svg%2F1200px-Flag_of_Venezuela.svg.png"))
        listaPaises.add(pais("Perú", "https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Ff%2Ff2%2FBandera_peruana_DOS.jpg"))

        miRecycler!!.layoutManager = GridLayoutManager(this, 1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = PaisAdapter(listaPaises, this)
    }
}