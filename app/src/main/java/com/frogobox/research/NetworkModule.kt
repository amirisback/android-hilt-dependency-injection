package com.frogobox.research

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient

// Created by KoinWorks (M. Faisal Amir) on 15/06/22.


@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @AuthInterceptorOkHttpClient
    @Provides
    fun provideAuthInterceptorOkHttpClient(
        authInterceptor: AuthInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .build()
    }

    @OtherInterceptorOkHttpClient
    @Provides
    fun provideOtherInterceptorOkHttpClient(
        otherInterceptor: OtherInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(otherInterceptor)
            .build()
    }
}