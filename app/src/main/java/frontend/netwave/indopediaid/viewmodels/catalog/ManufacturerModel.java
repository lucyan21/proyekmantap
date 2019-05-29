package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.HtmlHelpers.SelectUtility;
import frontend.netwave.indopediaid.models.catalog.ec_Manufacturer;
import frontend.netwave.indopediaid.models.catalog.ec_Picture;
import frontend.netwave.indopediaid.models.catalog.ec_Product;

import java.util.Date;
import java.util.List;
import java.util.UUID;import frontend.netwave.indopediaid.HtmlHelpers.SelectUtility;

public class ManufacturerModel
    {
        public UUID Guid;
        public int Id;

        public int UserId;
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

        public int ManufacturerTemplateId;
        public String MetaKeywords;

        public String MetaDescription;
        public String MetaTitle;

        public int PictureId;

        public int PageSize;

        public boolean AllowCustomersToSelectPageSize;
        public String PageSizeOptions;
        public String PriceRanges;

        public boolean SubjectToAcl;

        public boolean LimitedToStores;

        public boolean Published;

        public int DisplayOrder;

        int _returnPageNumber = 1;

        public int ReturnPageNumber;

        public List<ec_Picture> ManufacturePictures;

        public List<ec_Product> Products;
        public List<SelectUtility.DocumentSelectItem> UserDataList;

        /**public ManufacturerService<ec_Manufacturer, IManufacturerRepository<ec_Manufacturer>> manufacturerService = null;
        public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;*/

        public static ManufacturerModel ModelFromManufacturerEntity(ec_Manufacturer iMnf)
        {
            ManufacturerModel model = new ManufacturerModel();

            model.Guid = iMnf.Guid;
            model.Id = iMnf.Id;
            model.Name = iMnf.Name;
            model.Description = iMnf.Description;
            model.SiteId = iMnf.SiteId;
            model.StatusId = iMnf.StatusId;
            model.TemplateId = iMnf.TemplateId;
            model.AttachmentId = iMnf.AttachmentId;
            model.Deleted = iMnf.Deleted;
            model.Version = iMnf.Version;
            model.CreateUserId = iMnf.CreateUserId;
            model.CreateDate = iMnf.CreateDate;
            model.UpdateUserId = iMnf.UpdateUserId;
            model.UpdateDate = iMnf.UpdateDate;
            model.PictureId = iMnf.PictureId;
            model.UserId = iMnf.UserId;

            return model;
        }

        public static ec_Manufacturer ManufacturerFromModel(UUID guid, ManufacturerModel model)
        {
            ec_Manufacturer iManufacturer = new ec_Manufacturer();

            //if ((guid != null) && (guid != Guid.Empty))
               // iManufacturer = model.manufacturerService.GetDocumentByGuid(guid);

            iManufacturer.UserId = model.UserId;
            iManufacturer.Name = model.Name;
            iManufacturer.Description = model.Description;
            iManufacturer.MetaKeywords = model.MetaKeywords;
            iManufacturer.MetaDescription = model.MetaDescription;
            iManufacturer.MetaTitle = model.MetaTitle;
            iManufacturer.PictureId = model.PictureId;
            iManufacturer.PriceRanges = model.PriceRanges;
            iManufacturer.Published = model.Published;

            return iManufacturer;
        }

        public static List<ec_Product> GetProducts(ManufacturerModel model)
        {
            //model.Products = model.productService.GetProductByManufacturerId(model.Id, 1, 20);

            return model.Products;
        }

        public static ManufacturerModel InitManufacturerSelectList(ManufacturerModel model)
        {
            //model.ManufacturePictures = model.manufacturerService.GetPictureByPictureId(model.PictureId);

            return model;
        }

    }
