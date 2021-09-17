package com.example.myapplication

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor() : Person {
    override fun speakLanguage() {
        Log.i("EnglishPerson","Hello kind sir.")
    }
    /*   fun speakEnglish(){
           Log.i("EnglishPerson","Hello kind sir.")
       }*/
}