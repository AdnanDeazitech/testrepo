package com.example.myapplication

import android.util.Log
import javax.inject.Inject

class SpanishPerson @Inject constructor():Person {
   /* fun speakSpanish(){
        Log.i("SpanishPerson","Despacito senor")
    }
*/
    override fun speakLanguage() {
//        TODO("Not yet implemented")
        Log.i("SpanishPerson","Despacito senor")
    }
}