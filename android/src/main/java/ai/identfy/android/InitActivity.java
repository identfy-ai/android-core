package ai.identfy.android;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

import ai.identfy.android.core.SDKActivity;

public class InitActivity extends SDKActivity {

    CardView initSuccessCV;
    TextView initSuccessTV;
    CardView initPANCV,initAadhaarCV,initVoterCV,initLicenseCV,initLivelinessCV;
    ProgressBar initPANPB,initAadhaarPB,initVoterPB,initLicensePB,initLivelinessPB;
    LinearLayout initPANLL,initAadhaarLL,initVoterLL,initLicenseLL,initLivelinessLL;
    AppCompatImageView initPANIV,initAadhaarIV,initVoterIV,initLicenseIV,initLivelinessIV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);

        initPANLL = findViewById(R.id.initPANLL);
        initAadhaarLL = findViewById(R.id.initAadhaarLL);
        initVoterLL = findViewById(R.id.initVoterLL);
        initLicenseLL = findViewById(R.id.initLicenseLL);
        initLivelinessLL = findViewById(R.id.initLivelinessLL);

        initPANCV = findViewById(R.id.initPANCV);
        initAadhaarCV = findViewById(R.id.initAadhaarCV);
        initVoterCV = findViewById(R.id.initVoterCV);
        initLicenseCV = findViewById(R.id.initLicenseCV);
        initLivelinessCV = findViewById(R.id.initLivelinessCV);

        initPANPB = findViewById(R.id.initPANPB);
        initAadhaarPB = findViewById(R.id.initAadhaarPB);
        initVoterPB = findViewById(R.id.initVoterPB);
        initLicensePB = findViewById(R.id.initLicensePB);
        initLivelinessPB = findViewById(R.id.initLivelinessPB);

        initPANIV = findViewById(R.id.initPANIV);
        initAadhaarIV = findViewById(R.id.initAadhaarIV);
        initVoterIV = findViewById(R.id.initVoterIV);
        initLicenseIV = findViewById(R.id.initLicenseIV);
        initLivelinessIV = findViewById(R.id.initLivelinessIV);

        initSuccessCV = findViewById(R.id.initSuccessCV);
        initSuccessTV = findViewById(R.id.initSuccessTV);

        initSuccessCV.setOnClickListener(v -> finish());

    }

    @Override
    protected void onResume() {
        super.onResume();
        processPAN();
    }

    @Override
    public void onBackPressed() {}

    private void processPAN() {
        new Handler().postDelayed(() -> {
            initPANLL.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                initPANPB.setVisibility(View.GONE);
                initPANIV.setVisibility(View.VISIBLE);
                initPANCV.setCardBackgroundColor(Color.parseColor("#55FF55"));

                processAadhaar();
            }, 1000);
        }, 500);
    }

    private void processAadhaar() {
        new Handler().postDelayed(() -> {
            initAadhaarLL.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                initAadhaarPB.setVisibility(View.GONE);
                initAadhaarIV.setVisibility(View.VISIBLE);
                initAadhaarCV.setCardBackgroundColor(Color.parseColor("#55FF55"));

                processVoter();
            }, 1000);
        }, 500);
    }

    private void processVoter() {
        new Handler().postDelayed(() -> {
            initVoterLL.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                initVoterPB.setVisibility(View.GONE);
                initVoterIV.setVisibility(View.VISIBLE);
                initVoterCV.setCardBackgroundColor(Color.parseColor("#55FF55"));

                processLicense();
            }, 1000);
        }, 500);
    }

    private void processLicense() {
        new Handler().postDelayed(() -> {
            initLicenseLL.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                initLicensePB.setVisibility(View.GONE);
                initLicenseIV.setVisibility(View.VISIBLE);
                initLicenseCV.setCardBackgroundColor(Color.parseColor("#55FF55"));

                processLiveliness();
            }, 1000);
        }, 500);
    }

    private void processLiveliness() {
        new Handler().postDelayed(() -> {
            initLivelinessLL.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                initLivelinessPB.setVisibility(View.GONE);
                initLivelinessIV.setVisibility(View.VISIBLE);
                initLivelinessCV.setCardBackgroundColor(Color.parseColor("#55FF55"));

                initSuccessTV.setVisibility(View.VISIBLE);
                initSuccessCV.setVisibility(View.VISIBLE);
            }, 1000);
        }, 500);
    }

}
