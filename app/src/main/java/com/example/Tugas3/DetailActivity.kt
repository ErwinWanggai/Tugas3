package com.example.Tugas3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Tugas3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gambar : ImageView = binding.dtGambat
        val nama : TextView = findViewById(R.id.dtNama)
        val asal : TextView = findViewById(R.id.dtAsal)
        val deskripsi : TextView = findViewById(R.id.dtDesk)

        val bundle: Bundle?= intent.extras
        val bNama = bundle!!.getString("idnama")
        val bGambar = bundle.getInt("idgambar")
        val bAsal = bundle.getString("idasal")
        val bDeskripsi = bundle.getString("iddeskripsi")

        gambar.setImageResource(bGambar)
        nama.text = bNama
        asal.text = bAsal
        deskripsi.text = bDeskripsi
    }
}