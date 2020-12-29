package com.koin.koindemo.di.module

import com.koin.koindemo.ui.main.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel( get(), get())
    }
}