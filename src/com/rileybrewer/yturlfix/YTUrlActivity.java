package com.rileybrewer.yturlfix;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class YTUrlActivity extends Activity {
    private static final String YOUTUBE = "http://www.youtube.com/watch?v=%s";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String uriString = String.format(YOUTUBE, getIntent().getData().getLastPathSegment());
        Intent intent = new Intent();
        intent.setData(Uri.parse(uriString));
        startActivity(intent);
        finish();
    }

}
