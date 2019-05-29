package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_ProductTag;

import java.util.*;

public class ProductTagModel {
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

        //public ProductTagService<ec_ProductTag, IProductTagRepository<ec_ProductTag>> productTagService = null;
        //public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;

        public static ProductTagModel ModelFronProductTag(ec_ProductTag iProductTag)
        {
            ProductTagModel model = new ProductTagModel();

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

