package com.urucas.logcatio_app;

import android.app.Application;
import android.util.Log;

import com.urucas.logcatio.LogcatIO;
import com.urucas.logcatio.exceptions.EmptyNamespaceException;
import com.urucas.logcatio.exceptions.NullContextException;

/**
 * Created by vruno on 1/15/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            LogcatIO.Initialize(getApplicationContext(), "https://logcatio-server4.herokuapp.com");
        } catch (EmptyNamespaceException e) {
            e.printStackTrace();
        } catch (NullContextException e) {
            e.printStackTrace();
        }
    }
}
