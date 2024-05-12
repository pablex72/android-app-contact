package com.pablodev.projectrestapp.di

import com.pablodev.projectrestapp.datasource.RestDataSource
import com.pablodev.projectrestapp.model.User
import com.pablodev.projectrestapp.repository.UserRepository
import com.pablodev.projectrestapp.repository.UserRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun userRepository(repo: UserRepositoryImp): UserRepository

}

