package com.example.recyclerdemo;

public class ModenClass {
    private int imgessrc;
    private String title,body;

    public ModenClass(int imgessrc,String title,String body){
        this.imgessrc=imgessrc;
        this.title=title;
        this.body=body;
    }

    public int getImgessrc(){
        return imgessrc;
    }
    public String getTitle(){
        return title;
    }
    public  String getBody(){
        return body;
    }

}
