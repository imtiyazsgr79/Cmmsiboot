package com.example.cmmsiboot;

public class SearchResponse {
    private String frId;
    private String locationName;

    public SearchResponse(String frId) {
        this.frId = frId;
    }

    public SearchResponse(String frId, String locationName) {
        this.frId = frId;
        this.locationName = locationName;
    }

    public String getLocationNameName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getFrId() {
        return frId;
    }

    public void setFrId(String frId) {
        this.frId = frId;
    }

   /* private String frIdDescription;

    public String getFrIdDescription() {
        return frIdDescription;
    }

    public void setFrIdDescription(String frIdDescription) {
        this.frIdDescription = frIdDescription;
    }*/
}
