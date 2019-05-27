package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_Manufacturer;

import java.util.List;

public class ManufacturerListPageModel {
        private String _header = "";
        private String _footer = "";

        public String Header;

        public String Footer;

        public ManufacturerListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<ec_Manufacturer> Manufacturers;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;
    }
