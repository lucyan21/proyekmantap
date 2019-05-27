package com.netwave.indopediaid.models.catalog;

import java.util.Date;

public class ec_OrderItemProduct extends BaseDocument{
        public ec_OrderItemProduct()
        {
        }

        public int ec_OrderId;

        public int ec_ProductId;

        public int Quantity;

        public float UnitPriceInclTax;

        public float UnitPriceExclTax;

        public float PriceInclTax;

        public float PriceExclTax;

        public float DiscountAmountInclTax;

        public float DiscountAmountExclTax;

        public float OriginalProductCost;

        public String AttributeDescription;

        public String AttributesXml;

        public int DownloadCount;

        public boolean IsDownloadActivated;

        public int LicenseDownloadId;

        public float ItemWeight;

        public Date RentalStartDateUtc;

        public Date RentalEndDateUtc;

    }
