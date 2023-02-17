package com.example.techwinlabs

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.techwinlabs.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

  private lateinit var binding: ActivityPreviewBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityPreviewBinding.inflate(layoutInflater)
    setContentView(binding.root)


    val uri = Uri.parse( intent.getStringExtra("imageUri"))
    if (uri != null){
      binding.previewUploadImg.setImageURI(uri)
    }
  }
}