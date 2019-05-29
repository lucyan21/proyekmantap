package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_Category;
import frontend.netwave.indopediaid.models.catalog.ec_Product;

import java.util.List;


public class PoductSearchModel {
    public List<ec_Category> Categories;
    public String MainCategoryName;
    public String CategoryName;
    public int CountOfProducts;
    public List<ec_Product> Products;
    public List<ec_Product> AllProducts;

    public String _ProductSearchPartialTitle;

    public String _ProductSearchProductCountPerCategory;
    public float _ProductSearchPriceMax;
    public float _ProductSearchPriceMin;
    public String _ProductSearchManufacturer;


    public int catid;
    public String key;
    public float hrgMin;
    public float hrgMax;
    public int mnf;
    public int pageIndex;
    public int pageSize;

    public String katid;
    public String kunci;
    public String harga;
    public String merk;


    public PoductSearchModel() { }

        public class ec_PoductSearch {
        public List<ec_Product> SearchProducts;
        public List<ec_Product> SearchAllProducts;
        public int SearchProductsCount;
    }
}