package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_ProductReview;

import java.util.*;

public class ProductReviewListPageModel {
        private String _header = "";
        private String _footer = "";
        public String Header;
        public String Footer;
        public ProductReviewListPageModel(){        }
        public String Heading;
        public List<ec_ProductReview> ProductReviews;
        private boolean useModals = false;
        public boolean UseModals;
        public int CustomerId;
        public Date CustomerLastLoginDate;
        public String CustomerName;
        public Date CustomerLastCommentDate;
        public String CustomerInterest;

        public int Rating;
        public int Point;
    }
