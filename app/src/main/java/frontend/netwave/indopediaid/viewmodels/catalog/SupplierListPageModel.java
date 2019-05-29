package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_Supplier;

import java.util.List;

public class SupplierListPageModel {
        private String _header = "";
        private String _footer = "";

        public String Header;
        public String Footer;
        public SupplierListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<ec_Supplier> Suppliers;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;
    }
