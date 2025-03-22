package com.example.Tugas3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Tugas3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur aksi klik text link untuk berpindah ke halaman Reset Password
        binding.txtForgetPass.setOnClickListener {
            startActivity(Intent(this, ResetPassword::class.java))
        }

        // Mengatur aksi klik tombol login untuk berpindah ke halaman Home
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Mengatur aksi klik text link untuk berpindah ke halaman Register
        binding.txtRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
