package com.example.mathly.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Post {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("base64data")
    @Expose
    private String base64data;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("size")
    @Expose
    private Integer size;

    public Post(String name,String base64data, String type, Integer size){
        this.name = name;
        this.base64data = base64data;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase64data() {
        return base64data;
    }

    public void setBase64data(String base64data) {
        this.base64data = base64data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", base64data='" + base64data + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}









//public class Post {
//
//
//    @SerializedName("src")
//    @Expose
//    private String src;
//    @SerializedName("formats")
//    @Expose
//    private List<String> formats = null;
//    @SerializedName("data_options")
//    @Expose
//    private DataOptions dataOptions;
//
//    public Post(String src, List<String> formats, DataOptions dataOptions) {
//        this.src = src;
//        this.formats = formats;
//        this.dataOptions = dataOptions;
//    }
//
//    public String getSrc() {
//        return src;
//    }
//
//    public void setSrc(String src) {
//        this.src = src;
//    }
//
//    public List<String> getFormats() {
//        return formats;
//    }
//
//    public void setFormats(List<String> formats) {
//        this.formats = formats;
//    }
//
//    public DataOptions getDataOptions() {
//        return dataOptions;
//    }
//
//    public void setDataOptions(DataOptions dataOptions) {
//        this.dataOptions = dataOptions;
//    }
//}
