package com.example.latitude.bookapp;

public class ImageModel {
    private int Id;
    private int ImageResource;

    public ImageModel(int id, int imageResource) {
        Id = id;
        ImageResource = imageResource;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImageResource() {
        return ImageResource;
    }

    public void setImageResource(int imageResource) {
        ImageResource = imageResource;
    }
}
