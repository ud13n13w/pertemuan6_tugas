package com.example.pertemuan6_tugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_barang.view.*

class adapter_barang (private val ds_barang:ArrayList<barang>) : RecyclerView.Adapter<adapter_barang.holder_barang>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder_barang {
        return holder_barang(LayoutInflater.from(parent.context).inflate(R.layout.item_barang, parent, false))
    }

    override fun getItemCount(): Int = ds_barang.size

    override fun onBindViewHolder(holder: holder_barang, position: Int) {
        holder.view_barang.tv_namabarang.text = ds_barang.get(position).nama_barang
        holder.view_barang.tv_harga.text = ds_barang.get(position).harga_barang.toString()
        holder.view_barang.iv_gambarbarang.setImageBitmap(ds_barang.get(position).gambar_barang)

        //Event Klik
        holder.view_barang.setOnClickListener{
            Toast.makeText(holder.view_barang.context, "Pesan : " + ds_barang.get(position).nama_barang + " Bayar : " + ds_barang.get(position).harga_barang, Toast.LENGTH_SHORT ).show()
            //Toast.makeText(holder.view_barang.context, "Pesan : ", Toast.LENGTH_SHORT )
        }
    }

    class holder_barang (val view_barang: View) : RecyclerView.ViewHolder(view_barang)

}