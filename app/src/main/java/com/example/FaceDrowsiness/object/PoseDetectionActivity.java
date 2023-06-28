package com.example.FaceDrowsiness.object;

import android.os.Bundle;

import com.example.FaceDrowsiness.helpers.VideoActivity;
import com.example.FaceDrowsiness.helpers.vision.posedetector.PoseDetectorProcessor;
import com.google.mlkit.vision.pose.accurate.AccuratePoseDetectorOptions;

public class PoseDetectionActivity extends VideoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void setProcessor() {
        AccuratePoseDetectorOptions options = new AccuratePoseDetectorOptions.Builder()
                .setDetectorMode(AccuratePoseDetectorOptions.STREAM_MODE)
                .build();
        cameraSource.setMachineLearningFrameProcessor(new PoseDetectorProcessor(
                this,
                options,
                true,
                false,
                false,
                false,
                true
            )
        );
    }
}
