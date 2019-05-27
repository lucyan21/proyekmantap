package com.netwave.indopediaid.models.catalog;

import java.util.Date;

public class ec_ProductPriceMapping extends BaseDocument {
        public int ec_ProductId;
        public int ec_CategoryId;
        public int ec_MerchantId;

        public boolean IsPercentage;
        public double Percentage;
        public double Value;
        public Date StartDate;
        public Date EndDate;

    }
