package com.example.doggler.model

import com.example.doggler.R

class DataSource {

    fun loadWebShows():List<Webseries>{
       return listOf<Webseries>(
           Webseries(R.string.Money_Heist, R.drawable.moneyhiest),
           Webseries(R.string.Stranger_Things,R.drawable.strangerthings),
           Webseries(R.string.Dark, R.drawable.dark),
           Webseries(R.string.Jack_ryan, R.drawable.jackryan),
           Webseries(R.string.Mr_Robot , R.drawable.mrrobot),
           Webseries(R.string.Breaking_Bad , R.drawable.breakingbad),
           Webseries(R.string.looming_tower , R.drawable.loomingtower),
           Webseries(R.string.Ozark , R.drawable.ozark),
           Webseries(R.string.Squid_Game , R.drawable.squidgame),
           Webseries(R.string.Hanna , R.drawable.hanna),
           Webseries(R.string.All_of_us_are_dead , R.drawable.allofusaredead),
           Webseries(R.string.Alice_in_borderland , R.drawable.aliceinborderland)
       )


    }
}