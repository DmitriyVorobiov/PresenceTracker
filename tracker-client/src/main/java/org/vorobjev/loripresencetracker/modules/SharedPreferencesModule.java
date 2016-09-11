package org.vorobjev.loripresencetracker.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import org.vorobjev.loripresencetracker.ClientApplication;

@Module
public class SharedPreferencesModule {

    SharedPreferences mPreferences;

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences() {
        mPreferences = PreferenceManager.getDefaultSharedPreferences(ClientApplication.getInstance());
        return initDefaultSettings(mPreferences);
    }

    protected SharedPreferences initDefaultSettings(SharedPreferences preferences) {
//        preferences.edit()
//                .apply();
        return preferences;
    }
}
