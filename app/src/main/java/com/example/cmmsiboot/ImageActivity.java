package com.example.cmmsiboot;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageActivity extends MybaseActivity{
    private Context context;
    private ImageView cameraBtn,gallery;
    List<Uri> selectedUri;
    private int indexToDelete = -1;
    private List<String> mUrls;
    private ViewPager view_pager;
    private ViewAdapter viewAdapter;
    private List<String>base64List = new ArrayList<>();
    private List<String>receivedImagesList = new ArrayList<>();
    String value, frId;
    private DotsIndicator dotsIndicator;
    private FloatingActionButton deleteImageBtn;
    private String finalValueType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*LayoutInflater layoutInflater = LayoutInflater.from(this);
        View viewLayout = layoutInflater.inflate(R.layout.activity_image, null, false);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);*/
        setContentView(R.layout.activity_image);
        cameraBtn = findViewById(R.id.cameraButton);
        gallery =findViewById(R.id.galleryButton);
        dotsIndicator = findViewById(R.id.dot);
        Intent imageIntent = getIntent();
        value = imageIntent.getStringExtra("value");
        Log.d("ImageType",value);
        value=value.toLowerCase();
        frId = imageIntent.getStringExtra("checkForFrid");
        deleteImageBtn = findViewById(R.id.fabDelete);


        def();
        retrieveAllImages();


        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,1);



            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent,13);

            }
        });



    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 ){

           // Bitmap image = (Bitmap) data.getExtras().get("data");
            Bitmap images = (Bitmap)data.getExtras().get("data");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            images.compress(Bitmap.CompressFormat.JPEG,70,bos);
            byte[] b = bos.toByteArray();
            String imageStringBase64i = Base64.encodeToString(b,Base64.DEFAULT);
            Log.d("hhhhhhhbbbb",imageStringBase64i);
            uploadImage(imageStringBase64i);
           // imagesArrayList.add(imageStringBase64i);
            //imageView.setImageBitmap(image);
          base64List.add(imageStringBase64i);
          viewAdapter.notifyDataSetChanged();

          //For CreateFault report
           /* Intent createFaultIntent = new Intent();
            createFaultIntent.putExtra("imageStringCreate",imageStringBase64i);
            ((Activity) context).setResult(Activity.RESULT_OK,createFaultIntent);
            ((Activity) context).finish();*/

        }if(requestCode == 13){
            Uri selectUri = data.getData();
           // imageView.setImageURI(selectUri);

        }
    }
   public void def() {
      view_pager = findViewById(R.id.vpMain);
        mUrls = base64List;
 /*       mVpMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                *//*if (!authListDetail.isEmpty()) {
                    authName.setText(authListDetail.get(i).getName());
                    authNo.setText(authListDetail.get(i).getContactNo());
                } else {
                    authNo.setText("");
                    authName.setText("");
                }*//*
            }

            @Override
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrollStateChanged(int i) {


                if (indexToDelete != -1 && i == ViewPager.SCROLL_STATE_IDLE) {
                    mUrls.remove(indexToDelete);
                    adp.notifyDataSetChanged();

                    if (indexToDelete == 0) {
                        mVpMain.setCurrentItem(indexToDelete, false);
                    }
                    indexToDelete = -1;
                }
            }
        });*/
    }
    private void retrieveAllImages() {
        viewAdapter = new ViewAdapter();
        base64List.clear();
       view_pager.setAdapter(viewAdapter);
       //viewAdapter.notifyDataSetChanged();


        Call<List<BeforeImageResponse>> getAllImages = ApiClient.getUserServices().getBeforeImage(value,frId,workspace,token);
        getAllImages.enqueue(new Callback<List<BeforeImageResponse>>() {
            @Override
            public void onResponse(Call<List<BeforeImageResponse>> call, Response<List<BeforeImageResponse>> response) {
                if(response.code()==200){
                    List<BeforeImageResponse>beforeImageResponseList= response.body();
                    for(int i=0;i<beforeImageResponseList.size();i++){
                        String bimages =beforeImageResponseList.get(i).getImage();
                       receivedImagesList.add(bimages);
                       Log.d("IMMMMMMMMM", String.valueOf(beforeImageResponseList.size()));
                    }
                    if(receivedImagesList.size()<1 ){
                        Bitmap noImagesbitmap = getBitmapFromVectorDrawable(ImageActivity.this,R.drawable.noimage);
                        ByteArrayOutputStream bos = new ByteArrayOutputStream();
                        noImagesbitmap.compress(Bitmap.CompressFormat.PNG,30,bos);
                        byte [] b = bos.toByteArray();
                        String noImageBase64 =Base64.encodeToString(b, Base64.DEFAULT);
                        base64List.add(noImageBase64);
                        Log.d("NOIMMMMM",noImageBase64);
                        Log.d("NOIMAGE ARRAY LIST", String.valueOf(base64List.size()));
                       viewAdapter.notifyDataSetChanged();
                        dotsIndicator.setViewPager(view_pager);
                        Toast.makeText(ImageActivity.this, "No Images Available!", Toast.LENGTH_LONG).show();

                    }else {
                        for(int i =0;i<receivedImagesList.size();i++){
                       String name = receivedImagesList.get(i).toString();
                            Log.d("name>>>>",name+"----"+name.contains(".png"));
                               /*  if(name.contains(".png")){
                                name = name+".png";
                            }else{
                                name=name+".jpg";
                            }*/
                            //name=name+".png";

                            Call<ResponseBody> callImageBase64 = ApiClient.getUserServices().getImageBase64(receivedImagesList.get(i).toString(),workspace,token);
                            Log.d("IMageNames",receivedImagesList.get(i).toString());
                            Log.d("ARRAYLISTOFIMGNAMES",receivedImagesList.toArray().toString());
                            callImageBase64.enqueue(new Callback<ResponseBody>() {
                                @Override
                                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                    if(response.code()==200){
                                        Log.d("ResponseBodyStream",response.body().byteStream().toString());
                                        Log.d("Tag","response"+response.body().byteStream());
                                        Bitmap bitmap = BitmapFactory.decodeStream(response.body().byteStream());
                                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                                        bitmap.compress(Bitmap.CompressFormat.PNG,100,baos);
                                        byte[]b = baos.toByteArray();
                                        String encodedString = Base64.encodeToString(b,Base64.DEFAULT);
                                        base64List.add(encodedString);
                                        viewAdapter.notifyDataSetChanged();
                                        dotsIndicator.setViewPager(view_pager);

                                    }
                                }

                                @Override
                                public void onFailure(Call<ResponseBody> call, Throwable t) {

                                }
                            });
                        }

                    }

                }
            }

            @Override
            public void onFailure(Call<List<BeforeImageResponse>> call, Throwable t) {

            }
        });
    }

    public static Bitmap getBitmapFromVectorDrawable(Context context, int drawableId) {
        Drawable drawable = ContextCompat.getDrawable(context, drawableId);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            drawable = (DrawableCompat.wrap(drawable)).mutate();
        }
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(),
                drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }
   class ViewAdapter extends PagerAdapter{
       /* private Context context;
        private  LayoutInflater layoutInflater;
        private VpAdapter(Context context){
            this.context= context;
        }*/

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, final int position) {
            View v = getLayoutInflater().inflate(R.layout.thumb_item, container, false);
            ////layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            //View v = layoutInflater.inflate(R.layout.thumb_item, container, false);
            ImageView sliderImage = v.findViewById(R.id.imgSlider);
            byte[] decodedByte = Base64.decode(mUrls.get(position), 0);
            Bitmap bitmap = BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
            Glide.with(container.getContext()).asBitmap().load(bitmap).into(sliderImage);

            container.addView(v);
            String valueType = "FR-AI-";

            if (value.equals("before")) {
                valueType = "FR-BI-";
            }
            finalValueType = valueType;

            deleteImageBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(ImageActivity.this);
                    alertDialog.setTitle("Delete Image")
                            .setMessage("Do you want to delete this image ?")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                           deleteImageMethod();

                                        }
                                    }
                            )
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                }
            });
            return v;




        }

        @Override
        public int getCount() {
            return mUrls.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

       @Override
       public int getItemPosition(@NonNull Object object) {

            if(mUrls.indexOf(object)==-1){
                return POSITION_NONE;
            }else
           return super.getItemPosition(object);
       }

       @Override
       public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
           container.removeView((View) object);
       }
   }

    private void deleteImageMethod() {
        ProgressDialog progressD = new ProgressDialog(ImageActivity.this);
        progressD.setCancelable(false);
        progressD.setMessage("Deleting image..");
        progressD.setIndeterminate(true);
        progressD.show();
        DeleteImageRequest deleteImageRequest = new DeleteImageRequest(receivedImagesList.get(view_pager.getCurrentItem()), frId, finalValueType);
        Call<Void> deleteCall =ApiClient.getUserServices().postDeleteImage(
                deleteImageRequest,
                workspace,
                token,
                role);
        deleteCall.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.code()==200){
                   receivedImagesList.remove(view_pager.getCurrentItem());
                    Toast.makeText(ImageActivity.this, "Deleted!", Toast.LENGTH_LONG).show();
                    retrieveAllImages();
                    progressD.dismiss();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }

    private void uploadImage(String imageStringBase64i){
        Log.d("UploadMMMMMCCC---",frId);
       UploadImageRequest uploadImageRequest = new UploadImageRequest(frId,imageStringBase64i);
        Call<Void> uploadImage = ApiClient.getUserServices().uploadImage(value,workspace,token,uploadImageRequest);
        uploadImage.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.code()==200){
                    Toast.makeText(ImageActivity.this,"image saved successfully",Toast.LENGTH_SHORT).show();
                        retrieveAllImages();
                    new AlertDialog.Builder(ImageActivity.this)

                            .setTitle("Image saved successfully")
                            .setMessage("Want to upload more images")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }

                            }).show();

                }


            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
   }


}