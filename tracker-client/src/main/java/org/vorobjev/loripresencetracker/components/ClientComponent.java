package org.vorobjev.loripresencetracker.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import org.vorobjev.loripresencetracker.ClientApplication;
import org.vorobjev.loripresencetracker.modules.SharedPreferencesModule;

@Component(modules = {
        SharedPreferencesModule.class})

@Singleton
public interface ClientComponent {

    void inject(ClientApplication app);

    SharedPreferences provideSharedPreferences();
}