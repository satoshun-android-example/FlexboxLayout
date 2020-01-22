package com.github.satoshun.example.main.maxline

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.FlexboxMaxLineBinding
import com.github.satoshun.example.databinding.FlexboxPerfFragBinding
import com.google.android.material.chip.Chip

class MaxLineFragment : Fragment(R.layout.flexbox_max_line) {
  private lateinit var binding: FlexboxMaxLineBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = FlexboxMaxLineBinding.bind(view)

    repeat(50) {
      binding.flexbox1.addView(Chip(context).apply { text = "CHIP $it" })
    }
  }
}
