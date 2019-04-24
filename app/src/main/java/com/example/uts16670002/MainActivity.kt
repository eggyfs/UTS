package com.example.uts16670002

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_move_activity.setOnClickListener {
            val intent = Intent(this, second::class.java)
            startActivity(intent)
        }
        btnbuka.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://instagram.com/_u/putri.d.yulva")
            )

            startActivity(intent)
        }
        btn_move_activity_data.setOnClickListener {
            val intent: Intent = Intent(this, third::class.java)
            intent.putExtra("NAMA", " Nama : Eggy Fernando Sembiring")
            intent.putExtra("NPM", "NPM : 16670002")
            intent.putExtra("KELAS", "Kelas : Informatika 6A")
            intent.putExtra("FOTO", R.drawable.eggy)
            intent.putExtra("IG", "IG : eggysembiring")

            startActivity(intent)
        }
    }
}