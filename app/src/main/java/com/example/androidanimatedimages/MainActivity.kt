package com.example.androidanimatedimages

import android.annotation.SuppressLint
import android.graphics.ImageDecoder
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
val drawableIDs = listOf(R.drawable.programming_gif, R.drawable.unicorn_animated)
    var pointer = 0
    fun incrementpointer(){
        pointer++
        if(pointer >= drawableIDs.size){
                pointer = 0
            }
    }
 @SuppressLint("WrongThread")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     button_next.setOnClickListener{
         incrementpointer()
         animated_image.setImageDrawable(ContextCompat.getDrawable(this, drawableIDs[pointer]))
     }

         /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
              val gifDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(resources, R.drawable.unicorn))
            animated_image.setImageDrawable(gifDrawable)
              (gifDrawable as AnimatedImageDrawable).start()*/


     /*  val frameDrawable = ContextCompat.getDrawable(this, R.drawable.unicorn_animated)
        animated_image.setImageDrawable(frameDrawable)
     (frameDrawable as AnimationDrawable).start()*/


     val animatedVectorDrawable = ContextCompat.getDrawable(this, R.drawable.avd_play_to_pause)
     animated_image.setImageDrawable(animatedVectorDrawable)
     (animatedVectorDrawable as Animatable).start()
    }}



