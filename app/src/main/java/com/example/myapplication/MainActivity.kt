package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import org.w3c.dom.Text
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private lateinit var spanishPerson: SpanishPerson
//    private lateinit var englishPerson: EnglishPerson

/*    @Inject
    lateinit var englishPerson: EnglishPerson*/

/*    @Inject
    lateinit var spanishPerson: SpanishPerson*/

    @PersonModule.SpanishQualifier
    @Inject
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val textView = findViewById(R.id.textView) as TextView

        textView.setOnClickListener{
//            spanishPerson.englishPerson.speakEnglish()
            person.speakLanguage()
        }


//        englishPerson.speakEnglish()
//        englishPerson = EnglishPerson()
      /*  spanishPerson = SpanishPerson(EnglishPerson())
        spanishPerson.speakSpanish()
        spanishPerson.englishPerson.speakEnglish()
        spanishPerson.englishPerson.speakEnglish()*/

    }
}