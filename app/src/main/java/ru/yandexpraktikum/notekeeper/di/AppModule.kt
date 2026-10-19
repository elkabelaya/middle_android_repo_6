package ru.yandexpraktikum.notekeeper.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import ru.yandexpraktikum.core.di.CoreComponent
import ru.yandexpraktikum.core.di.DaggerCoreComponent

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideCoreComponent(context: Context): CoreComponent {
        return DaggerCoreComponent.factory()
            .create(context)
    }

    @Provides
    fun provideComponentProvider(coreComponent: CoreComponent): ComponentProvider {
        return ComponentProvider(coreComponent)
    }
}
