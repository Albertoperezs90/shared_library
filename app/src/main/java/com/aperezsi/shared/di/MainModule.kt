package com.aperezsi.shared.di

import dagger.Module

@Module(includes = [UseCaseModule::class, NetworkModule::class])
abstract class MainModule