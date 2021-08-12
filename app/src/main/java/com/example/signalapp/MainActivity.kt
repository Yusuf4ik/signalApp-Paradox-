package com.example.signalapp
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private var NotPlaying = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Creating Mediaplayer to play the sirens.
        val police = MediaPlayer.create(this, R.raw.police)

        findViewById<ImageView>(R.id.playBtn).setOnClickListener {
            //Playing the sirens if it's not playing
            if(NotPlaying){
                police.start()
                Toast.makeText(applicationContext, "Play", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.playBtn).setImageResource(R.drawable.ic_baseline_pause_24)
                NotPlaying = false
            }else if(!NotPlaying){
                //Stop playing the sirens

                Toast.makeText(applicationContext, "Stop", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.playBtn).setImageResource(R.drawable.ic_baseline_play_arrow_24)
                police.pause()
                NotPlaying = true

            }
        }
    }

}