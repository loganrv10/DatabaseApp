package com.example.techwinlabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.techwinlabs.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity(), OnClickListener {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    onclickListener()
     }

  private fun onclickListener() {
    binding.btnCamera.setOnClickListener() {
      val intent = Intent(this, CameraActivity::class.java)
      startActivity(intent)
    }
  }

  override fun onClick(p0: View?) {
    TODO("Not yet implemented")
  }
}