package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_ProductTemplate;

import java.util.*;

public class ProductTemplateModel {
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
        public String ViewPath;
        public int DisplayOrder;

        //public ProductTemplateService<ec_ProductTemplate, IProductTemplateRepository<ec_ProductTemplate>> productTemplateService = null;
        //public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;

        public static ProductTemplateModel ModelFronProductTag(ec_ProductTemplate iProductTag)
        {
            ProductTemplateModel model = new ProductTemplateModel();

            model.Guid = iProductTag.Guid;
            model.Id = iProductTag.Id;
            model.Name = iProductTag.Name;
            model.Description = iProductTag.Description;
            model.SiteId = iProductTag.SiteId;
            model.StatusId = iProductTag.StatusId;
            model.TemplateId = iProductTag.TemplateId;
            model.AttachmentId = iProductTag.AttachmentId;
            model.Deleted = iProductTag.Deleted;
            model.Version = iProductTag.Version;
            model.CreateUserId = iProductTag.CreateUserId;
            model.CreateDate = iProductTag.CreateDate;
            model.UpdateUserId = iProductTag.UpdateUserId;
            model.UpdateDate = iProductTag.UpdateDate;

            return model;
        }

    }
