package com.example.recycle_view;

public class Mems {
    private String title;

    private  String description;

    private int memResource;

    public Mems(String title, String description, int memResource) {
        this.title = title;
        this.description = description;
        this.memResource = memResource;
    }

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public int getMemResource() {
        return memResource;
    }

    public void setMemResource(int memResource) {
        this.memResource = memResource;
    }
}