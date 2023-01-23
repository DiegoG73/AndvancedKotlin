package com.diegog.advancedkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private fun String.noSpaces(): String{
        return this.replace(" ", "")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuario = "    soy   yo    "
        println("${usuario} (${usuario.length}) - ${usuario.noSpaces()} (${usuario.noSpaces().length})")

    }
}