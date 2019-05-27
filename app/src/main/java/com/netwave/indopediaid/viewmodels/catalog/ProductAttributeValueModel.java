package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_ProductAttributeValue;

import java.util.*;

public class ProductAttributeValueModel {
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

        public int ec_ProductAttributeId;

        public int AttributeValueTypeId;

        public int AssociatedProductId;

        public String ColorSquaresRgb;

        public double PriceAdjustment;

        public double WeightAdjustment;

        public double Cost;

        public int Quantity;

        public boolean IsPreSelected;

        public int DisplayOrder;

        public int PictureId;

        public int ProductAttributeId ;

        public int ec_ProductAttributeMappingId;

        int _returnPageNumber = 1;

        public int ReturnPageNumber;

        /**public ProductAttributeValueService<ec_ProductAttributeValue, IProductAttributeValueRepository<ec_ProductAttributeValue>> productAttValService = null;
        public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;*/

        public static ProductAttributeValueModel ModelFromProductAttributeValueEntity(ec_ProductAttributeValue iProductAttVal)
        {
            ProductAttributeValueModel model = new ProductAttributeValueModel();

            model.Guid = iProductAttVal.Guid;
            model.Id = iProductAttVal.Id;
            model.Name = iProductAttVal.Name;
            model.Description = iProductAttVal.Description;
            model.SiteId = iProductAttVal.SiteId;
            model.StatusId = iProductAttVal.StatusId;
            model.TemplateId = iProductAttVal.TemplateId;
            model.AttachmentId = iProductAttVal.AttachmentId;
            model.Deleted = iProductAttVal.Deleted;
            model.Version = iProductAttVal.Version;
            model.CreateUserId = iProductAttVal.CreateUserId;
            model.CreateDate = iProductAttVal.CreateDate;
            model.UpdateUserId = iProductAttVal.UpdateUserId;
            model.UpdateDate = iProductAttVal.UpdateDate;

            model.ec_ProductAttributeId = iProductAttVal.ec_ProductAttributeId;
            model.AttributeValueTypeId = iProductAttVal.AttributeValueTypeId;
            model.AssociatedProductId = iProductAttVal.AssociatedProductId;
            model.ColorSquaresRgb = iProductAttVal.ColorSquaresRgb;
            model.PriceAdjustment = iProductAttVal.PriceAdjustment;
            model.WeightAdjustment = iProductAttVal.WeightAdjustment;
            model.Cost = iProductAttVal.Cost;
            model.Quantity = iProductAttVal.Quantity;
            model.IsPreSelected = iProductAttVal.IsPreSelected;
            model.DisplayOrder = iProductAttVal.DisplayOrder;
            model.PictureId = iProductAttVal.PictureId;

            return model;
        }

        public static ec_ProductAttributeValue ProductAttributeFromModel(UUID guid, ProductAttributeValueModel model)
        {
            ec_ProductAttributeValue iProductAttVal = new ec_ProductAttributeValue();

            //if ((guid != null) && (guid != Guid.Empty))
            //    iProductAttVal = model.productAttValService.GetDocumentByGuid(guid);

            iProductAttVal.Name = model.Name;
            iProductAttVal.Description = model.Description;
            iProductAttVal.ec_ProductAttributeId = model.ec_ProductAttributeId;
            iProductAttVal.AttributeValueTypeId = model.AttributeValueTypeId;
            iProductAttVal.AssociatedProductId = model.AssociatedProductId;
            iProductAttVal.ColorSquaresRgb = model.ColorSquaresRgb;
            iProductAttVal.PriceAdjustment = model.PriceAdjustment;
            iProductAttVal.WeightAdjustment = model.WeightAdjustment;
            iProductAttVal.Cost = model.Cost;
            iProductAttVal.Quantity = model.Quantity;
            iProductAttVal.IsPreSelected = model.IsPreSelected;
            iProductAttVal.DisplayOrder = model.DisplayOrder;
            iProductAttVal.PictureId = model.PictureId;

            return iProductAttVal;
        }

}
