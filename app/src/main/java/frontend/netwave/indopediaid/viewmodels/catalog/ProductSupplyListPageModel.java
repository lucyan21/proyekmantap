package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_ProductSupply;

import java.util.*;

public class ProductSupplyListPageModel {
        private String _header = "";
        private String _footer = "";
        public String Header;
        public String Footer;
        public ProductSupplyListPageModel() {        }
        public String Heading;
        public List<ec_ProductSupply> ProductSupplies;
        public int ProductId;
        public String ProductName;
        public String SKU;
        public String GTIN;
        public int TotalQuantitySold;
        public int InventoryLevel;
        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;
    }

