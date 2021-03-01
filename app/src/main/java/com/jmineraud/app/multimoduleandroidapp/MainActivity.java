package com.jmineraud.app.multimoduleandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jmineraud.lib.core.PublicSingletonA;
import com.jmineraud.lib.core.PublicSingletonB;
import com.jmineraud.lib.core.internal.PrivateSingletonA;
import com.jmineraud.lib.extra.CoreDependentUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PrivateSingletonA.getInstance().getValue()
        Log.d(TAG, "Public A value: " + PublicSingletonA.getInstance().getValue());
        Log.d(TAG, "Public B value: " + PublicSingletonB.getInstance().getValue().getValue());
        Log.d(TAG, "Extra A value: " + CoreDependentUtils.getCoreValueA());
        Log.d(TAG, "Extra B value: " + CoreDependentUtils.getCoreValueB());

    }
}