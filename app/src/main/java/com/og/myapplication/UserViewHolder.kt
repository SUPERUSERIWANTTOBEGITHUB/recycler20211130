package com.og.myapplication

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    private val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)

    fun bind(user: User) {
        nameTextView.text = "ГОРОД - ${user.name_cuty}"
        ageTextView.text = "ЧИСЛО ЖИТЕЛЕЙ - ${user.population_size}"

        itemView.setOnClickListener {
            Toast.makeText(itemView.context,user.name_cuty,Toast.LENGTH_LONG).show()
        }

    }

}