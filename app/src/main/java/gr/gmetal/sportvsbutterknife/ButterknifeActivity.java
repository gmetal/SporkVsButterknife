package gr.gmetal.sportvsbutterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ButterknifeActivity extends AppCompatActivity {

    @Bind(R.id.text_view_1)
    TextView mTextView1;
    @Bind(R.id.text_view_2)
    TextView mTextView2;
    @Bind(R.id.text_view_3)
    TextView mTextView3;

    @Bind(R.id.button_1)
    Button mButton1;
    @Bind(R.id.button_2)
    Button mButton2;
    @Bind(R.id.button_3)
    Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        ButterKnife.bind(this);
        mButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {

                startActivity(new Intent(ButterknifeActivity.this, SporkActivity.class));
            }
        });

        mTextView1.setText("This is the butterknife activity");
    }
}
