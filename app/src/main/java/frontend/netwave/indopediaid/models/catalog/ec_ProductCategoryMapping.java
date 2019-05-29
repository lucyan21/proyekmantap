package frontend.netwave.indopediaid.models.catalog;

public class ec_ProductCategoryMapping extends BaseDocument {
        public int ec_ProductId;
        public ec_Product ec_Product;

        public int ec_CategoryId;
        public ec_Category ec_Category;

        public boolean IsFeaturedProduct;

        public int DisplayOrder;

    }
