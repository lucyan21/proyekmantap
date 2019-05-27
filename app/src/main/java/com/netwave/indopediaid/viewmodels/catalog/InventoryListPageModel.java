package com.netwave.indopediaid.viewmodels.catalog;

import java.util.List;

public class InventoryListPageModel {
        private String _header = "";
        private String _footer = "";
        public String Header;
        public String Footer;

        public InventoryListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<InventoryPage> Inventories;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;

    public class InventoryPage 
    {
        public int ProductId;
        public String ProductName;
        public String SKU;
        public String GTIN;
        public int TotalQuantitySold;
        public int InventoryLevel;
    }
}
