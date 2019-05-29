package frontend.netwave.indopediaid.models.catalog;

public class ec_ProductReview extends BaseDocument {

        public int ec_CustomerId;

        public int ec_ProductId;

        public boolean IsApproved;

        public String Title;

        public String ReviewText;

        public int Rating;

        public int HelpfulYesTotal;

        public int HelpfulNoTotal;

        public ec_Product ec_Product;

     }
