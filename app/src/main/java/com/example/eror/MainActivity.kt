package com.example.eror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eror.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Gunakan binding untuk meng-inflate layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set nilai awal untuk counter
        binding.tvCounter.text = "1"

        // Fungsi untuk menambah angka
        binding.btnAddNumber.setOnClickListener {
            addNumber()
        }

        // Fungsi untuk mengurangi angka
        binding.btnKurangnumber.setOnClickListener {
            kurangNumber()
        }

        // Fungsi untuk mereset angka menjadi 0
        binding.btnDeletenumber.setOnClickListener {
            deleteNumber()
        }
    }

    // Fungsi untuk menambah angka
    private fun addNumber() {
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        binding.tvCounter.text = nextVal.toString()
    }

    // Fungsi untuk mengurangi angka
    private fun kurangNumber() {
        val currVal = binding.tvCounter.text.toString().toInt()
        if (currVal > 0) { // Pastikan angka tidak menjadi negatif
            val nextVal = currVal - 1
            binding.tvCounter.text = nextVal.toString()
        }
    }

    // Fungsi untuk mereset angka menjadi 0
    private fun deleteNumber() {
        binding.tvCounter.text = "0"
    }
}
