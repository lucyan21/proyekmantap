package frontend.netwave.indopediaid.models.catalog;

import java.util.Date;

public class gr_MyProduct extends BaseDocument {
        int _id = 0;
        public int Id;

        public String Gtin;

        public String SerialNumber;

        public Date PurchaseDate;

        public String RegistrationNo;

        public int ec_MerchantId;

        public String ProductImageUrl;

        public String ProductCategory;

        public String MerchantName;

        public String MerchantAddress;

        public int Status;

        public int UserId;
        public String MyProdukFromModel;
    }
