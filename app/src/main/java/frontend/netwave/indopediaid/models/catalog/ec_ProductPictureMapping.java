package frontend.netwave.indopediaid.models.catalog;

public class ec_ProductPictureMapping extends BaseDocument {
        public int ec_ProductId;

        public int ec_PictureId;

        public int DisplayOrder;

        public ec_Picture ec_Picture;

        public ec_Product ec_Product;
    }
