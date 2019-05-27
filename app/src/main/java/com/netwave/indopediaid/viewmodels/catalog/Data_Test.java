package com.netwave.indopediaid.viewmodels.catalog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.netwave.indopediaid.models.catalog.ec_Data;

import java.util.List;

public class Data_Test {

    @SerializedName("items")
    @Expose
    private List<ec_Data> results = null;

    public List<ec_Data> getResults() {
        return results;
    }

    public void setResults(List<ec_Data> results) {
        this.results = results;
    }

}