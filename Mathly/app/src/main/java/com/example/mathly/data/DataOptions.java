package com.example.mathly.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataOptions {

    @SerializedName("include_asciimath")
    @Expose
    private Boolean includeAsciimath;
    @SerializedName("include_latex")
    @Expose
    private Boolean includeLatex;

    public DataOptions(Boolean includeAsciimath, Boolean includeLatex) {
        this.includeAsciimath = includeAsciimath;
        this.includeLatex = includeLatex;
    }

    public Boolean getIncludeAsciimath() {
        return includeAsciimath;
    }

    public void setIncludeAsciimath(Boolean includeAsciimath) {
        this.includeAsciimath = includeAsciimath;
    }

    public Boolean getIncludeLatex() {
        return includeLatex;
    }

    public void setIncludeLatex(Boolean includeLatex) {
        this.includeLatex = includeLatex;
    }

}
