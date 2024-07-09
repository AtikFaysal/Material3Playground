package com.playground.material.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import com.playground.material.core.common.adapter.DataBoundListAdapter
import com.playground.material.core.model.ComponentsEntity
import com.playground.material.databinding.ItemComponentsBinding

class HomeMenuAdapter (
    private val onItemClick : (id : Int)-> Unit
) : DataBoundListAdapter<ComponentsEntity, ItemComponentsBinding>(
    diffCallback = object : DiffUtil.ItemCallback<ComponentsEntity>(){
        override fun areItemsTheSame(oldItem: ComponentsEntity, newItem: ComponentsEntity): Boolean = oldItem == newItem

        override fun areContentsTheSame(oldItem: ComponentsEntity, newItem: ComponentsEntity): Boolean = oldItem == newItem
    }
){
    override fun createBinding(parent: ViewGroup): ItemComponentsBinding = ItemComponentsBinding.inflate(
        LayoutInflater.from(parent.context), parent, false)

    override fun bind(binding: ItemComponentsBinding, item: ComponentsEntity, position: Int) {
        binding.apply {
            nameTv.text = item.name
            root.setOnClickListener {
                onItemClick.invoke(item.id)
            }
        }
    }
}