package com.enginbrothers.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //veri hazırlığı
        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Thor")
        superKahramanIsimleri.add("Aquaman")

        //verimsiz tanımlamalar
        /*
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val spidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val thorBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.thor)
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)

        var superKahramanGorselleri=ArrayList<Bitmap>()
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(thorBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        */

        //Verimli Tanımlamalar
        val supermanDrawableId=R.drawable.superman
        val spidermanDrawableId=R.drawable.spiderman
        val ironmanDrawableId=R.drawable.ironman
        val thorDrawableId=R.drawable.thor
        val aquamanDrawableId=R.drawable.aquaman

        var superKahramanDrawableListesi=ArrayList<Int>()
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(thorDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)


        //Adapter
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        val adapter=RecyclerAdapter(superKahramanIsimleri,superKahramanDrawableListesi)
        recyclerView.adapter=adapter
    }
}