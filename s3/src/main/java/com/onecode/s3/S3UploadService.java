package com.onecode.s3;

import android.app.IntentService;
import android.content.Intent;

public class S3UploadService extends IntentService {

    public static final String TAG = "S3UploadService";

    public S3UploadService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
    }
}
