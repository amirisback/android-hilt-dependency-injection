package com.frogobox.research

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import javax.inject.Inject

// Created by KoinWorks (M. Faisal Amir) on 15/06/22.


// Constructor-injected, because Hilt needs to know how to
// provide instances of AnalyticsServiceImpl, too.
class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {

    override fun analyticsMethods() {
    }

}
