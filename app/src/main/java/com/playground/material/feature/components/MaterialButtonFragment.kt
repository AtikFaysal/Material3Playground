package com.playground.material.feature.components

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.playground.material.R
import com.playground.material.core.common.base.BaseFragment
import com.playground.material.databinding.FragmentMaterialButtonBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MaterialButtonFragment : BaseFragment<FragmentMaterialButtonBinding>() {
    override fun viewBindingLayout(): FragmentMaterialButtonBinding =
        FragmentMaterialButtonBinding.inflate(layoutInflater)

    override fun initializeView(savedInstanceState: Bundle?) {
        binding.toolbarIncl.apply {
            titleTV.text = getString(R.string.title_button)
            backBtn.setOnClickListener { findNavController().popBackStack() }
        }
    }
}