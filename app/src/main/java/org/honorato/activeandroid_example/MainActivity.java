package org.honorato.activeandroid_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.honorato.activeandroid_example.models.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUp();
    }

    protected void setUp() {
        User user = new User("Some User's Name");
        user.save();

        TextView tv = (TextView) this.findViewById(R.id.text);
        if (tv != null) {
            tv.setText(user.toString());
        }
    }
}
