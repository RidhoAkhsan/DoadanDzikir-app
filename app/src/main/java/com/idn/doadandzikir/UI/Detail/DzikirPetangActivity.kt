package com.idn.doadandzikir.UI.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.doadandzikir.R
import com.idn.doadandzikir.databinding.ActivityDzikirPetangBinding

class DzikirPetangActivity : AppCompatActivity() {

    private var _binding : ActivityDzikirPetangBinding? = null
    private val binding = _binding as ActivityDzikirPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Dzikir Petang"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_dzikir_petang)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}