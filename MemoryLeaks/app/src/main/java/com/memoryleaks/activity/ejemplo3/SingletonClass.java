package com.memoryleaks.activity.ejemplo3;

import android.content.Context;

class SingletonClass {

    private static SingletonClass instance;
    private Context context;

    private SingletonClass(Context context) {
        this.context = context;
    }

    static synchronized SingletonClass getInstance(Context context) {
        if (instance == null) {
            instance = new SingletonClass(context);
        }
        return instance;
    }

    void unregister(Context context) {
        if (this.context == context) {
            this.context = null;
        }
    }
}
