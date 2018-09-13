package com.priyabratpadhy.simpledaggerdemo;

import android.app.Application;

public class App extends Application {

    private ApplicationComponent applicationComponent = null;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
