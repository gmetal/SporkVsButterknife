package gr.gmetal.sportvsbutterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.github.sporklibrary.Spork;
import io.github.sporklibrary.annotations.BindView;

public class SporkActivity extends AppCompatActivity {

    @BindView(R.id.text_view_1)
    TextView mTextView1;
    @BindView(R.id.text_view_2)
    TextView mTextView2;
    @BindView(R.id.text_view_3)
    TextView mTextView3;

    @BindView(R.id.button_1)
    Button mButton1;
    @BindView(R.id.button_2)
    Button mButton2;
    @BindView(R.id.button_3)
    Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        Spork.bind(this);

        mButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {

                startActivity(new Intent(SporkActivity.this, ButterknifeActivity.class));
            }
        });

        mTextView1.setText("This is the Spork activity");
    }
}
