package com.enginbrothers.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //toast,alert
        //applicationContext->app context
        //this,this@MainActivity->aktivitenin contexti


        Toast.makeText(this,"Hoşgeldin",Toast.LENGTH_LONG).show()
    }
    fun mesajgoster(view: View){
        val uyariMesaji=AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("Şifre hatası")
        uyariMesaji.setMessage("Lütfen şifreyi doğru giriniz!")
        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Baştan Deneyin",Toast.LENGTH_LONG).show()

        })
        uyariMesaji.setNegativeButton("Hayır"){dialogInterface,i ->
           Toast.makeText(this,"Hayırı seçtiniz,Deneyemiyorsunuz",Toast.LENGTH_LONG).show()

        }
        uyariMesaji.show()

    }
}