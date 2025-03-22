package com.example.Tugas3
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import com.example.Tugas3.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnKirim.setOnClickListener{
            val intentSendTo = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, binding.edtKirimText.text.toString())
            intent.type = "text/plain"
            startActivity(Intent(Intent.createChooser(intentSendTo,"Share to")))
        }

        // Implicit Intent untuk membuka aplikasi kamera
        binding.btnOpenCamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            // Memastikan ada aplikasi yang bisa menangani intent ini (misalnya aplikasi kamera)
            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent, REQUEST_CODE_CAMERA)
            }
        }

        // tombol keluar
        binding.btnKeluar.setOnClickListener{
            // ...
        }
    }

    companion object {
        const val REQUEST_CODE_CAMERA = 1001
    }
}