package ai.identfy.core;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import ai.identfy.android.Identfy;

public class TryoutActivity extends AppCompatActivity {

    CardView initialiseCV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tryout);

        initialiseCV = findViewById(R.id.initialiseCV);

        initialiseCV.setOnClickListener(v -> Identfy.launch(TryoutActivity.this));
    }

}
