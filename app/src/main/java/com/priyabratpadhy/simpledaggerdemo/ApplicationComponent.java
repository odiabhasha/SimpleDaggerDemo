package com.priyabratpadhy.simpledaggerdemo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
