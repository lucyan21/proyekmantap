package com.netwave.indopediaid.viewmodels.catalog;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MerchantListPageModel {
        private String _header = "";
        private String _footer = "";
        public String Header;

        public String Footer;

        public MerchantListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<MerchantInfo> MerchantInfos;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public UUID catid;

        public boolean UseModals;

    public class MerchantInfo
    {
        // merchant data
        public UUID Guid;
        public int Id;
        public String Name;
        public Date CreateDate;
        public int Status;
        public String Email;

        // product data
        public int NumberOfProducts;
        public int TotalUnit;

        // order data
        public float AccumulatedRevenue;
        public String OrgPemda;

    }
}
