package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.BaseDocument;
import com.netwave.indopediaid.models.catalog.ec_Product;
import com.netwave.indopediaid.models.catalog.ec_ProductReview;

import java.util.*;

public class ProductReviewModel extends BaseDocument {
        public UUID Guid;
        public int Id;
        public String Name;
        public String Description;
        public UUID SiteId;
        public UUID StatusId;
        public UUID TemplateId;
        public String AttachmentId;
        public boolean Deleted;
        public int Version;
        public UUID CreateUserId;
        public Date CreateDate;
        public UUID UpdateUserId;
        public Date UpdateDate;

        public int ec_CustomerId;

        public int ec_ProductId;

        public boolean IsApproved;

        public String Title;

        public String ReviewText;

        public int Rating;

        public int HelpfulYesTotal;

        public int HelpfulNoTotal;

        public ec_Product ec_product;

        //public ProductReviewService<ec_ProductReview, IProductReviewRepository<ec_ProductReview>> productpreviewService = null;
        //public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;

        public static ProductReviewModel ModelFronProductReview(ec_ProductReview iReview)
        {
            ProductReviewModel model = new ProductReviewModel();

            model.Guid = iReview.Guid;
            model.Id = iReview.Id;
            model.Name = iReview.Name;
            model.Description = iReview.Description;
            model.SiteId = iReview.SiteId;
            model.StatusId = iReview.StatusId;
            model.TemplateId = iReview.TemplateId;
            model.AttachmentId = iReview.AttachmentId;
            model.Deleted = iReview.Deleted;
            model.Version = iReview.Version;
            model.CreateUserId = iReview.CreateUserId;
            model.CreateDate = iReview.CreateDate;
            model.UpdateUserId = iReview.UpdateUserId;
            model.UpdateDate = iReview.UpdateDate;

            return model;
        }

    }
