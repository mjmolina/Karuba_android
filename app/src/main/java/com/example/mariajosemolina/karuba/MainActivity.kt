package com.example.mariajosemolina.karuba

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var explorers = mutableListOf<String>() // empty list of strings
        var temples =  mutableListOf<String>() // empty list of strings
        var positions = mutableListOf("10º", "20º", "30º", "40º", "50º", "60º", "70º", "80º", "90º", "100º", "110º").shuffled()


        imageExplorers.setOnClickListener{
            positions = positions.shuffled()
            var i=0
            while (explorers.size != 4){
                var pos = positions[i]
                if (!explorers.contains(pos)){
                    explorers.add(pos)
                }
                i += 1
            }

            locationExplorersLila.text = explorers[0]
            locationExplorersBrown.text = explorers[1]
            locationExplorersBlue.text = explorers[2]
            locationExplorersYellow.text = explorers[3]

            explorers.clear()
        }

        imageTemples.setOnClickListener{
            println("temple")
            positions = positions.shuffled()
            var i = 0
            while (temples.size != 4){
                var pos = positions[i]
                if (!temples.contains(pos)){
                    temples.add(pos)
                }
                i += 1
            }
            println(temples)
            templeLila.text = temples[0]
            templeBrown.text = temples[1]
            templeBlue.text = temples[2]
            templeYellow.text = temples[3]

            temples.clear()
        }
    }

}

