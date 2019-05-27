package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_Category;
import com.netwave.indopediaid.models.catalog.ec_Product;

import java.util.List;

public class HomeModel {
    public List<ec_Category> Categories ;
    public List<ec_Product> Products ;
    public int pageNumber;
    public int pageSize;
}