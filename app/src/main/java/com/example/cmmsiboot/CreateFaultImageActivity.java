package com.example.cmmsiboot;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;

public class CreateFaultImageActivity extends AppCompatActivity {
    Button camBtn;
    private Context context;
    public static final int CAM_REQ_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_fault_image);
        camBtn = findViewById(R.id.createfaultcamBtn);
        camBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createFrCamIn = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(createFrCamIn, 22);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("dataSSSSS",String.valueOf(data));
        if (requestCode == 22 && resultCode!=RESULT_CANCELED) {

            // Bitmap image = (Bitmap) data.getExtras().get("data");
            Bitmap images = (Bitmap) data.getExtras().get("data");
            Log.d("IIIIVV",String.valueOf(images));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            images.compress(Bitmap.CompressFormat.JPEG, 70, bos);
            byte[] b = bos.toByteArray();
            String imageStringBase64i = Base64.encodeToString(b, Base64.DEFAULT);
            Log.d("CCCCCFFFNNN", imageStringBase64i);
            Intent camIn = new Intent(CreateFaultImageActivity.this,CreateFaultActivity.class);
            camIn.putExtra("createImageFa", imageStringBase64i);
            startActivity(camIn);
//            ((Activity) context).setResult(Activity.RESULT_OK,camIn);
           // ((Activity) context).finish();

            //uploadImage(imageStringBase64i);
        }


    }
}
