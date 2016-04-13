package org.honorato.activeandroid_example;

import com.activeandroid.ActiveAndroid;

/**
 * Created by jlh on 4/13/16.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
