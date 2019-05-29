package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.gr_MyProduct;

import java.util.List;

public class IndogaransiMyProductListModel
    {
        private String _header = "";
        private String _footer = "";

        public String Header;

        public String Footer;
        public IndogaransiMyProductListModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<gr_MyProduct> MyProductList;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;
    }

