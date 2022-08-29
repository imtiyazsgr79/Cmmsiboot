package com.example.cmmsiboot;

public class UploadImageRequest {
    String frId;
    String image;

    public UploadImageRequest(String frId, String image) {
        this.frId = frId;
        this.image = image;
    }
}
