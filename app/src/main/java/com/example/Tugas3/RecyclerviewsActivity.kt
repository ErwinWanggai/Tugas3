package com.example.Tugas3

import Adapter
import ItemData
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Tugas3.databinding.ActivityRecyclerviewsBinding

class RecyclerviewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerviewsBinding

    private lateinit var exampleRecyclerView: RecyclerView
    private lateinit var listExample: ArrayList<ItemData>
    private lateinit var exampleAdapter: Adapter

    private lateinit var gambar: Array<Int>
    private lateinit var nama: Array<String>
    private lateinit var asal: Array<String>
    private lateinit var deskripsi: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerviewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gambar = arrayOf(
            R.drawable.pinang,
            R.drawable.papeda,
            R.drawable.sabeta
        )

        nama = arrayOf(
            "pinang" , "papeda" , "sabeta"
        )

        asal = arrayOf(
            "Papua" , "Papua" , "papua"
        )

        deskripsi = arrayOf(
            getString(R.string.PINANG),
            getString(R.string.PAPEDA),
            getString(R.string.SABETA)
        )

        exampleRecyclerView = findViewById(R.id.rv)
        exampleRecyclerView.layoutManager = LinearLayoutManager(this)
        exampleRecyclerView.setHasFixedSize(true)

        listExample = arrayListOf<ItemData>()
        getDataUser()

    }

    private fun getDataUser() {
        val list_example = ArrayList<ItemData>()
        for ( i in gambar.indices) {
            val data_item = ItemData(gambar[i],nama[i],asal[i])
            list_example.add(data_item)
        }

        val adapter = Adapter(list_example)
        exampleRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object: Adapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@RecyclerviewsActivity, DetailActivity::class.java)
                intent.putExtra("idgambar", list_example[position].gambar)
                intent.putExtra("idnama", list_example[position].nama)
                intent.putExtra("idasal", list_example[position].asal)
                intent.putExtra("iddeskripsi", deskripsi[position])

                startActivity(intent)
            }
        })
    }
}