package com.playground.material.feature.home

import android.os.Bundle
import androidx.core.view.isVisible
import com.playground.material.R
import com.playground.material.core.common.base.BaseFragment
import com.playground.material.core.common.extfun.navigateDestination
import com.playground.material.core.common.extfun.setUpGridRecyclerView
import com.playground.material.core.model.ComponentsEntity
import com.playground.material.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(){
    override fun viewBindingLayout(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun initializeView(savedInstanceState: Bundle?) {
        binding.toolbarIncl.apply {
            titleTV.text = getString(R.string.title_all_component)
            backBtn.isVisible = false
        }
        val adapter = HomeMenuAdapter {
            when(it){
                1 -> navigateDestination(HomeFragmentDirections.actionHomeFragmentToMaterialButtonFragment())
            }
        }

        requireActivity().setUpGridRecyclerView(binding.servicesRv, adapter, 2)
        adapter.submitList(getComponents())
    }

    private fun getComponents() : List<ComponentsEntity> = listOf(
        ComponentsEntity(
            "Button",
            icon = 1,
            id = 1
        ),
        ComponentsEntity(
            "Edittext",
            icon = 1,
            id = 2
        ),ComponentsEntity(
            "Textview",
            icon = 1,
            id = 3
        ),ComponentsEntity(
            "Switch",
            icon = 1,
            id = 4
        ),ComponentsEntity(
            "Chip",
            icon = 1,
            id = 5
        ),ComponentsEntity(
            "Checkbox",
            icon = 1,
            id = 6
        ),ComponentsEntity(
            "Menu",
            icon = 1,
            id = 7
        ),ComponentsEntity(
            "Progress",
            icon = 1,
            id = 8
        ),ComponentsEntity(
            "Slider",
            icon = 1,
            id = 9
        ),ComponentsEntity(
            "Carousel",
            icon = 1,
            id = 10
        ),ComponentsEntity(
            "Date picker",
            icon = 1,
            id = 11
        ),ComponentsEntity(
            "Time picker",
            icon = 1,
            id = 12
        ),ComponentsEntity(
            "Bottom navigation",
            icon = 1,
            id = 13
        ),ComponentsEntity(
            "Card",
            icon = 1,
            id = 15
        ),ComponentsEntity(
            "Bottom sheet",
            icon = 1,
            id = 16
        ),ComponentsEntity(
            "Dialog",
            icon = 1,
            id = 17
        ),ComponentsEntity(
            "Divider",
            icon = 1,
            id = 18
        ),ComponentsEntity(
            "Snackbar",
            icon = 1,
            id = 19
        ),ComponentsEntity(
            "Badge drawable",
            icon = 1,
            id = 20
        ),ComponentsEntity(
            "Divider",
            icon = 1,
            id = 21
        ),ComponentsEntity(
            "Tabs",
            icon = 1,
            id = 22
        ),
    )
}