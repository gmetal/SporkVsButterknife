package gr.gmetal.sportvsbutterknife;

import android.app.Application;

import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

import io.github.sporklibrary.SporkAndroid;

public class SporkVsButterknifeApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        SporkAndroid.initialize();

        AndroidDevMetrics.initWith(this);
    }
}
