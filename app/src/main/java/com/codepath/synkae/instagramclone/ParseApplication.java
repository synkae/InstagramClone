package com.codepath.synkae.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cJn7pUGJlyET79mNPV9k3DzNTCzZ6k0UvFvglguL")
                .clientKey("MTTPYhaLjqhLu7HZ4J16dBunPFfuFi6dZy2D5ziP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
