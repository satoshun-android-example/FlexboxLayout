package com.github.satoshun.example.main.flexboxperf

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.FlexboxPerfFragBinding

class FlexboxPerfFragment : Fragment(R.layout.flexbox_perf_frag) {
  private lateinit var binding: FlexboxPerfFragBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = FlexboxPerfFragBinding.bind(view)
  }
}
