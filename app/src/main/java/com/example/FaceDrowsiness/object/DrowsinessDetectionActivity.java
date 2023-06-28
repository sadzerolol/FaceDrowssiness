package com.example.FaceDrowsiness.object;

import android.os.Bundle;

import com.example.FaceDrowsiness.helpers.VideoActivity;
import com.example.FaceDrowsiness.helpers.vision.FaceDetectorProcessor;

public class DrowsinessDetectionActivity extends VideoActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    protected void setProcessor() {
        cameraSource.setMachineLearningFrameProcessor(new FaceDetectorProcessor(this));
    }
}
