package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_ProductAttribute;

import java.util.List;

public class ProductAttributeListPageModel {
        private String _header = "";
        private String _footer = "";
        public String Header;

        public String Footer;

        public ProductAttributeListPageModel()
        {

        }

        public String Heading;

        public List<ec_ProductAttribute> ProductAttributes;

        private boolean useModals = false;

        public boolean UseModals;
}
