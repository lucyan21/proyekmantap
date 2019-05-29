package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_ProductAttribute;

import java.util.*;

public class ProductAttributeModel {
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


        int _returnPageNumber = 1;

        public int ReturnPageNumber;

        /**public ProductAttributeService<ec_ProductAttribute, IProductAttributeRepository<ec_ProductAttribute>> productAttService = null;
        public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;*/

        public static ProductAttributeModel ModelFromProductAttributeEntity(ec_ProductAttribute iProductTag)
        {
            ProductAttributeModel model = new ProductAttributeModel();

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

        public static ec_ProductAttribute ProductAttributeFromModel(UUID guid, ProductAttributeModel model)
        {
            ec_ProductAttribute iProductAtt = new ec_ProductAttribute();

            //if ((guid != null) && (guid != Guid.Empty))
               //iProductAtt = model.productAttService.GetDocumentByGuid(guid);

            iProductAtt.Name = model.Name;
            iProductAtt.Description = model.Description;

            return iProductAtt;
        }

    }
