package org.vorobjev.presencetracker;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Inject;

public class PresenceTrackerApplication extends Application {
    
    static PresenceTrackerApplication sInstance;

    @Inject
    SharedPreferences mPreferences;

    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static PresenceTrackerApplication getInstance() {
        return sInstance;
    }

    public SharedPreferences getPreferences() {
        return mPreferences;
    }

}
