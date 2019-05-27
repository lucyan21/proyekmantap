package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_Category;

import java.util.List;

public class CategoryListPageModel {
        private String _header = "";
        private String _footer = "";
        public String Header;
        public String Footer;

        public CategoryListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<ec_Category> Categories;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public int Type = 1;

        public boolean UseModals;
    }
