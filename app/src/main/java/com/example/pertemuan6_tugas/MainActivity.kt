package com.example.pertemuan6_tugas

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list_barang = ArrayList<barang>()

    val list_namabarang = arrayOf("GoodDay Freeze", "Torabika Susu", "Ultramilk Coklat", "Popice Coki", "Popice Coklat", "Popice Anggur", "Popice Stroberi", "Milo")
    val list_hargabarang = intArrayOf(5000, 4000, 6000, 4000, 4000, 4000, 4000, 6000)
    val list_gambarbarang = intArrayOf(R.drawable.goodayfreeze, R.drawable.torabikasusu, R.drawable.ultramilkcoklat, R.drawable.popice_coki, R.drawable.popice_coklat, R.drawable.popice_anggur, R.drawable.popice_stroberi, R.drawable.milo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview_barang = findViewById<RecyclerView>(R.id.recycleview_barang)
        recycleview_barang.setHasFixedSize(true)
        recycleview_barang.layoutManager = LinearLayoutManager(this)

        //Data
        for(i in 0 until list_namabarang.size){

            list_barang.add(barang(list_namabarang[i], list_hargabarang[i], BitmapFactory.decodeResource(resources, list_gambarbarang[i])))

            if(list_namabarang.size - 1 == i){
                val adapter_barang = adapter_barang(list_barang)
                adapter_barang.notifyDataSetChanged()
                recycleview_barang.adapter = adapter_barang
            }

        }

    }

}