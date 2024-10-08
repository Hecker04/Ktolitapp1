package com.example.eror
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.eror.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnKurangnumber: Button
    private lateinit var btnDeletenumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvCounter.text = "1"

        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnKurangnumber = findViewById(R.id.btnKurangnumber) // Bind tombol untuk mengurangi
        btnDeletenumber = findViewById(R.id.btnDeletenumber)

        tvCounter.text = "1"

        // Setting up the onClickListener for the buttonn
        btnAddNumber.setOnClickListener {
            addNumber()
        }
        // Listener untuk mengurangi angka
        btnKurangnumber.setOnClickListener {
            kurangNumber()
        }

        // Listener untuk mereset angka ke 0
        btnDeletenumber.setOnClickListener {
            DeleteNumber()
        }
    }
    private fun addNumber() {
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }

// Fungsi untuk mengurangi angka
private fun kurangNumber() {
    val currVal = binding.tvCounter.text.toString().toInt()
    if (currVal > 0) { // Pastikan angka tidak menjadi negatif
        val nextVal = currVal - 1
        tvCounter.text = nextVal.toString()
    }
}

// Fungsi untuk mereset angka menjadi 0
private fun DeleteNumber() {
    binding.tvCounter.text = "0"
}
}
