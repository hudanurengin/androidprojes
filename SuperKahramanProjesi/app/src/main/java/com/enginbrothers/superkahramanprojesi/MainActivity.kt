package com.enginbrothers.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isim=""
    private var yas:Int?=null
    private var meslek=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun superKahramanYap(view: View){
        isim=isimtext.text.toString()
        yas=yastext.text.toString().toIntOrNull()
        meslek=meslektext.text.toString()

        if(yas==null){
           sonucText.text="Doğru Yaşı Giriniz"
        }
        else{
            val superkahraman=SuperKahraman(isim,yas!!,meslek)
            sonucText.text="İsim:${superkahraman.isim} Yaş:${superkahraman.yas} Meslek:${superkahraman.meslek}"

        }

    }
}