package com.enginbrothers.siniflarvefonksiyonlar

class SuperKahraman(var isim:String,var yas:Int,var meslek:String) {

    private var sacininrengi="Sarı"

    fun testFonksiyonu(){
        println("test")
    }

    fun sacrnenginial():String{
        return this.sacininrengi
    }

    //access levels-erişebilirlik seviyeleri
    //private-protected-intternal-public


    /*var isim=""
    var yas=0
    var meslek=""

    //constructor
    constructor(isim:String,yas:Int,meslek:String){
        this.isim=isim
        this.yas=yas
        this.meslek=meslek
        println("constructor çağrıldı")
    }*/

}