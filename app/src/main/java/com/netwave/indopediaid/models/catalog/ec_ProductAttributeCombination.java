package com.netwave.indopediaid.models.catalog;

public class ec_ProductAttributeCombination {
        public int Id;

        public int ProductId;

        public String AttributesXml;

        public int StockQuantity;

        public boolean AllowOutOfStockOrders;
        public String Sku;
        public String ManufacturerPartNumber;
        public String Gtin;

        public double OverriddenPrice;

        public int NotifyAdminForQuantityBelow;

        public static ec_Product ec_Product;
    }
