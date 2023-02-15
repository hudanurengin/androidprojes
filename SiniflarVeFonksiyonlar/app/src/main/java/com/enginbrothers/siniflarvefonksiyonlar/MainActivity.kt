package com.enginbrothers.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val j=-10

        if(j==0){
            ilkFonksiyon()
        }
        else {
            ikinciFonksiyon()
        }
        cikarma(100,22)
        var x=toplama(10,20)
        textView2.text="Sonuç:${x}"

        button.setOnClickListener {
            val toplamaSonucu=toplama(10,50)
            textView2.text="Sonuç:${toplamaSonucu}"
        }
        sinifCalismasıi()
        nullGuvenligi()

    }
    fun ilkFonksiyon(){
        println("ilk fonksiyon çalıştırıldı")
    }
    fun ikinciFonksiyon(){
        println("ikinci fonksiyon çalıştırıldı")

    }

    fun cikarma(x:Int,y:Int){
        textView2.text="Sonuç:${x-y}"
    }

    fun toplama (a:Int,b:Int):Int{
        return a+b
    }
/*
    fun degistir(view: View){
        val toplamaSonucu=toplama(10,50)
        textView2.text="Sonuç:${toplamaSonucu}"
    }
*/
    fun sinifCalismasıi(){

        var superman=SuperKahraman("Superman",50,"Gazeteci")
        textView2.text="Yaş=${superman.yas}"
        superman.testFonksiyonu()
        println(superman.sacrnenginial())
    }

    fun nullGuvenligi(){
        //null,nullability,null safety
        //tanımlamak
        var benimString:String?

        //initialization
        benimString="Hüdanur"

        var benimYasim:Int?=null
        //println(benimYasim)

        //benimYasim=2
        //1
        /*if(benimYasim != null){
            println(benimYasim*2)
        }
        else{
            println("null geldi")
        }*/

        //2
        // !! -> null olmayacak,?-> null olabilir
        //println(benimYasim?.minus(2))

        //3
        //elvis operatörü

        val sonuc=benimYasim?.minus(2) ?:10
        println(sonuc)

        //4
        //let
        benimYasim=5
        benimYasim?.let {
            println(it*5)
        }

    }


}
