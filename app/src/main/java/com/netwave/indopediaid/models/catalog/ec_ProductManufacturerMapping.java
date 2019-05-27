package com.netwave.indopediaid.models.catalog;

public class ec_ProductManufacturerMapping extends BaseDocument {
        public int ec_ProductId;

        public int ec_ManufacturerId;

        public boolean IsFeaturedProduct;

        public int DisplayOrder;

        //public ec_Manufacturer ec_Manufacturer;

        public ec_Product ec_Product;
    }
