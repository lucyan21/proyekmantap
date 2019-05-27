package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_Picture;

import java.util.List;

public class PictureListPageModel {
        private String _header = "";

        /// <summary>
        /// Scope id
        /// </summary>
        private String _footer = "";

        public String Header;

        public String Footer;

        public PictureListPageModel()
        {
            //Paging = new PaginationSettings();

        }

        public String Heading;

        public List<ec_Picture> Pictures;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;
    }
