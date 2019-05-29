package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_Warehouse;

import java.util.List;

public class WarehouseListPageModel {
        private String _header = "";
        private String _footer = "";

        public String Header;

        public String Footer;

        public WarehouseListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<ec_Warehouse> Warehouses;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;
    }
