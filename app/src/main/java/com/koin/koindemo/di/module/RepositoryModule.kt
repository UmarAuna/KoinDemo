package com.koin.koindemo.di.module

import com.koin.koindemo.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single{
        MainRepository(get())
    }
}