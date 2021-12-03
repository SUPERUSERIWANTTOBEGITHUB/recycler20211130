package com.og.myapplication
// recycler
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList: List<User> = listOf(
            User("МОСКВА", 12655050),
            User("САНКТ-ПЕТЕРБУРГ", 5384342),
            User("КАЗАНЬ", 1257341 ),
            User("АЛЬМЕТЬЕВСК", 146310),
            User("СВИЯЖСК", 243)
        )

        userRecyclerView = findViewById(R.id.user_recycler_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(userList)
        userRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }

}


// RecyclerView <- Adapter <- ViewHolder <- layout
// 1. LayoutManager
// 2. Adapter

//RecyclerView DONE
//Adapter DONE
//ViewHolder DONE
//layout DONE