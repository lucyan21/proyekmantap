package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.*;

import java.util.Date;
import java.util.UUID;

public class IndogaransiMyProductModel extends BaseDocument {

        public String Gtin;
        public String SerialNumber;
        public Date PurchaseDate;
        public String RegistrationNo;
        public int ec_MerchantId;
        public String ProductImageUrl;
        public String ProductCategory;
        public String MerchantName;
        public String MerchantAddress;
        public int Status;
        int _returnPageNumber = 1;
        public int ReturnPageNumber;

        //public GRMyProductService<gr_MyProduct, IGRMyProductRepository<gr_MyProduct>> MyProductService = null;

        public static IndogaransiMyProductModel ModelFromMyProductEntity(gr_MyProduct iMnf) {
            IndogaransiMyProductModel model = new IndogaransiMyProductModel();

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

            model.Gtin = iMnf.Gtin;
            model.SerialNumber = iMnf.SerialNumber;
            model.PurchaseDate = iMnf.PurchaseDate;
            model.RegistrationNo = iMnf.RegistrationNo;
            model.ProductImageUrl = iMnf.ProductImageUrl;
            model.ProductCategory = iMnf.ProductCategory;
            model.MerchantName = iMnf.MerchantName;
            model.MerchantAddress = iMnf.MerchantAddress;
            return model;
        }

        public static gr_MyProduct MyProdukFromModel(UUID guid, IndogaransiMyProductModel model)
        {
            gr_MyProduct iMyProduct = new gr_MyProduct();

            //if ((guid != null) && (guid != Guid.Empty))
            //{
             //   iMyProduct = model.MyProductService.GetDocumentByGuid(guid);
            //}

            iMyProduct.Name = model.Name;
            iMyProduct.Description = model.Description;
            
            iMyProduct.Gtin = model.Gtin;
            iMyProduct.SerialNumber = model.SerialNumber;
            iMyProduct.PurchaseDate = model.PurchaseDate;
            iMyProduct.RegistrationNo = model.RegistrationNo;
            iMyProduct.ProductImageUrl = model.ProductImageUrl;
            iMyProduct.ProductCategory = model.ProductCategory;
            iMyProduct.MerchantName = model.MerchantName;
            iMyProduct.MerchantAddress = model.MerchantAddress;

            return iMyProduct;
        }
    }
