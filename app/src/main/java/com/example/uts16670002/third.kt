package com.example.uts16670002

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import kotlinx.android.synthetic.main.activity_third.*

class third : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val nama = intent.getStringExtra("Nama Panggilan")
        val npm = intent.getStringExtra("TTL")
        val kelas = intent.getStringExtra("Alamat Rumah")
        val gmail = intent.getStringExtra("Hobby")
        val foto = intent.getStringExtra("FOTO")


        Glide.with(this).load(foto).error(R.drawable.eggy).into(ivFotoku)
        tvNamaku.text = nama
        tvNpm.text = npm
        tvKelas.text = kelas
        tvGmail.text = gmail


    }
    }

private fun <TranscodeType> RequestBuilder<TranscodeType>.error(eggy: Int): RequestBuilder<TranscodeType> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

