package com.netwave.indopediaid.api;

import com.netwave.indopediaid.viewmodels.catalog.HomeModel;
import com.netwave.indopediaid.viewmodels.catalog.ProductModel;

public interface IBaseApiService {

    HomeModel GetHomeModelFromApiUrl(String url);
    ProductModel GetProductModelFromApiUrl(String url);
}
