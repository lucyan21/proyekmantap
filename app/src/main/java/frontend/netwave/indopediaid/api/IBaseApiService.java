package frontend.netwave.indopediaid.api;

import frontend.netwave.indopediaid.viewmodels.catalog.*;

public interface IBaseApiService {

    HomeModel GetHomeModelFromApiUrl(String url);
    ProductModel GetProductModelFromApiUrl(String url);
}
