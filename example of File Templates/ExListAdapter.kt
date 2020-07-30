package com.example.myapplication

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ExListAdapter :
    ListAdapter<ExListAdapter.ExampleViewObject, RecyclerView.ViewHolder>(ExampleDiffUtil()) {

    data class ExampleViewObject(val id: Int)
    class ExVH(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_test
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
        //val itemView = ....
        //return ExVH(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    private class ExampleDiffUtil : DiffUtil.ItemCallback<ExampleViewObject>() {
        override fun areItemsTheSame(
            oldItem: ExampleViewObject,
            newItem: ExampleViewObject
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ExampleViewObject,
            newItem: ExampleViewObject
        ): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

}