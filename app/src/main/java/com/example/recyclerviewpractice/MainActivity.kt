package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<DataList>()
        list.add(DataList(R.drawable.dimigologo, "Dimi", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "EB", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "DC", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "WP", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "HD", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "20th", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "Dimigo", "010-xxxx-xxxx"))
        list.add(DataList(R.drawable.dimigologo, "aaaaa", "010-xxxx-xxxx"))


        val adapter = RecyclerAdapter(list)
        recycler.adapter = adapter
    }

}

