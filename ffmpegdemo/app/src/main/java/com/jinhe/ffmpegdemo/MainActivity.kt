package com.jinhe.ffmpegdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {


    val input = File(Environment.getExternalStorageDirectory(), "input.mp4").absolutePath!!
    //val output = File(Environment.getExternalStorageDirectory(), "output.yuv").absolutePath!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this,"input"+input,Toast.LENGTH_SHORT).show()
        //open(input,output)
        //VideoView
        play.setOnClickListener {  videoView.player(input) }

    }


    //external fun open(input:String,output:String)


}
