
package com.nowsprinting.gradleandroidndkexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.nowsprinting.cppmodule.CppExample;

public class GradleAndroidNdkExampleActivity extends Activity {

    static {
        System.loadLibrary("cppmodule");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradle_android_ndk_example);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.gradle_android_ndk_example, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textView1 = (TextView)findViewById(R.id.textView1);

        // Message from C++
        CppExample cpp = new CppExample();
        textView1.setText(cpp.message());
    }

}
