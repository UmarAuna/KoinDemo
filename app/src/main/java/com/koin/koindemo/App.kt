package com.koin.koindemo

import android.app.Application
import com.koin.koindemo.di.module.appModule
import com.koin.koindemo.di.module.repoModule
import com.koin.koindemo.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    appModule,
                    repoModule,
                    viewModelModule
                ))
        }
    }
}