package gr.gmetal.sportvsbutterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        ((Button) findViewById(R.id.launcher_button)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                startActivity(new Intent(LauncherActivity.this, ButterknifeActivity.class));
            }
        });
    }
}
