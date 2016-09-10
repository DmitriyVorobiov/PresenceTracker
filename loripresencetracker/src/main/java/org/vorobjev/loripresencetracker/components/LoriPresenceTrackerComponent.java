package org.vorobjev.loripresencetracker.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import org.vorobjev.loripresencetracker.LoriPresenceTrackerApplication;
import org.vorobjev.loripresencetracker.adapters.NotesAdapter;
import org.vorobjev.loripresencetracker.modules.SharedPreferencesModule;

@Component(modules = {
        SharedPreferencesModule.class})

@Singleton
public interface LoriPresenceTrackerComponent {

    void inject(LoriPresenceTrackerApplication app);

    SharedPreferences provideSharedPreferences();
}