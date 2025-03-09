package com.example.UTS

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.UTS.databinding.ActivityResetPasswordBinding

class ResetPassword : AppCompatActivity() {

    private lateinit var binding: ActivityResetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}