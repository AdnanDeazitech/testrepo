package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@InstallIn(ActivityComponent::class)
@Module
abstract class PersonModule {

    @EnglishQualifier
    @Binds
    abstract fun EnglishPersonImpl(englishPerson: EnglishPerson):Person

    @SpanishQualifier
    @Binds
    abstract fun SpanishPersonImpl(spanishPerson:SpanishPerson):Person

    @Qualifier
    annotation class EnglishQualifier

    @Qualifier
    annotation class SpanishQualifier
}