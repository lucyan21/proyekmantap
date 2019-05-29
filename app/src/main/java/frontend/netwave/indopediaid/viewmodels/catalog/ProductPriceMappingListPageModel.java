package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_ProductPriceMapping;

import java.util.*;

public class ProductPriceMappingListPageModel {
        private String _header = "";
        private String _footer = "";

        public String Header;

        public String Footer;

        public ProductPriceMappingListPageModel() {        }

        public String Heading;

        public List<ec_ProductPriceMapping> ProductPriceMappings;

        private boolean useModals = false;

        public boolean UseModals;
}
