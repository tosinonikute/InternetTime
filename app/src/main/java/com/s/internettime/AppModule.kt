package com.berlintours

import com.s.internettime.MainPresenter
import org.koin.dsl.module.module

/**
 * Koin module class where all dependencies are created
 */

val myModule = module {
    single { MainPresenter() }
}