package org.vorobjev.loripresencetracker;

import org.vorobjev.loripresencetracker.components.DaggerLoriPresenceTrackerComponent;
import org.vorobjev.loripresencetracker.modules.SharedPreferencesModule;

public class ClientApplication extends org.vorobjev.presencetracker.PresenceTrackerApplication {

    public void onCreate() {
        super.onCreate();
        DaggerLoriPresenceTrackerComponent.builder()
                .sharedPreferencesModule(new SharedPreferencesModule())
                .build().inject(this);
    }

}
