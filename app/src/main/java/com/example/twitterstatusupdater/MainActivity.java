package com.example.twitterstatusupdater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int current = R.id.post; // The current selected option for the type of tweet to send

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button updateBtn = (Button) findViewById(R.id.btn_update);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.tweetGroup);

        updateBtn.setOnClickListener(v -> {
            String contents = ((EditText) findViewById(R.id.txt_contents)).getText().toString();
            String source = ((EditText) findViewById(R.id.txt_source)).getText().toString();
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                current = checkedId;
                switch (checkedId) {
                    case R.id.post:
                        ((TextView) findViewById(R.id.lbl_contents)).setText(R.string.tweet_contents);
                        updateBtn.setText(R.string.post_tweet);
                        break;
                    case R.id.reply:
                        ((TextView) findViewById(R.id.reply)).setText(R.string.original_link);
                        updateBtn.setText(R.string.reply_to_tweet);
                        break;
                }
            }
        });
    }
}