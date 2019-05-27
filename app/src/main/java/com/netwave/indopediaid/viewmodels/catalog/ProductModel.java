package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.HtmlHelpers.SelectUtility;
import com.netwave.indopediaid.models.catalog.ProductAttributeData;
import com.netwave.indopediaid.models.catalog.ec_Manufacturer;
import com.netwave.indopediaid.models.catalog.ec_Picture;
import com.netwave.indopediaid.models.catalog.ec_Product;

import java.time.Instant;
import java.util.*;

public class ProductModel  {
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

        public int ProductTypeId;

        public int ParentGroupedProductId;
        public int MainCategoryId;
        public int CategoryId;
        public int SubCategoryId;
        public int SubSubCategoryId;


        public boolean VisibleIndividually;

        public String FullDescription;

        public String AdminComment;

        public String InfoInsurance;

        public int ProductTemplateId;

        public int VendorId;

        public boolean ShowOnHomePage;

        public String MetaKeywords;

        public String MetaDescription;

        public String MetaTitle;

        public boolean AllowCustomerReviews;

        public int ApprovedRatingSum;

        public int NotApprovedRatingSum;

        public int ApprovedTotalReviews;

        public int NotApprovedTotalReviews;

        public boolean SubjectToAcl;

        public boolean LimitedToStores;

        public String Sku;

        public String ManufacturerPartNumber;

        public String Gtin;

        public boolean IsGiftCard;

        public int GiftCardTypeId;

        public double OverriddenGiftCardAmount;

        public boolean RequireOtherProducts;

        public String RequiredProductIds;

        public boolean AutomaticallyAddRequiredProducts;

        public boolean IsDownload;

        public int DownloadId;

        public boolean UnlimitedDownloads;

        public int MaxNumberOfDownloads;

        public int DownloadExpirationDays;

        public int DownloadActivationTypeId;

        public boolean HasSampleDownload;

        public int SampleDownloadId;

        public boolean HasUserAgreement;

        public String UserAgreementText;

        public boolean IsRecurring;

        public int RecurringCycleLength;

        public int RecurringCyclePeriodId;

        public int RecurringTotalCycles;

        public boolean IsRental;

        public int RentalPriceLength;

        public int RentalPricePeriodId;

        public boolean IsShipEnabled;

        public boolean IsFreeShipping;

        public boolean ShipSeparately;

        public double AdditionalShippingCharge;

        public int DeliveryDateId;

        public boolean IsTaxExempt;

        public int TaxCategoryId;

        public boolean IsTelecommunicationsOrBroadcastingOrElectronicServices;

        public int ManageInventoryMethodId;

        public boolean UseMultipleWarehouses;

        public int WarehouseId;

        public int StockQuantity;

        public boolean DisplayStockAvailability;

        public boolean DisplayStockQuantity;

        public int MinStockQuantity;

        public int LowStockActivityId;

        public int NotifyAdminForQuantityBelow;

        public int BackorderModeId;

        public boolean AllowBackInStockSubscriptions;

        public int OrderMinimumQuantity;

        public int OrderMaximumQuantity;

        public String AllowedQuantities;

        public boolean AllowAddingOnlyExistingAttributeCombinations;

        public boolean DisableBuyButton;

        public boolean DisableWishlistButton;

        public boolean AvailableForPreOrder;

        public Date PreOrderAvailabilityStartDateTimeUtc;

        public boolean CallForPrice;

        public boolean CallForShippingCost;

        public int DisplayGroupId;

        public double Price;

        public double OldPrice;

        public double ProductCost;

        public double SpecialPrice;

        public double VoucherAmount;

        public Date SpecialPriceStartDateTimeUtc;

        public Date SpecialPriceEndDateTimeUtc;

        public boolean CustomerEntersPrice;

        public double MinimumCustomerEnteredPrice;

        public double MaximumCustomerEnteredPrice;

        public boolean BasepriceEnabled;

        public double BasepriceAmount;

        public int BasepriceUnitId;

        public double BasepriceBaseAmount;

        public int BasepriceBaseUnitId;

        public boolean MarkAsNew;

        public Date MarkAsNewStartDateTimeUtc;

        public Date MarkAsNewEndDateTimeUtc;

        public boolean HasTierPrices;

        public boolean HasDiscountsApplied;
        public double DiscountPercentage;
        public Date DiscountStartDate;
        public Date DiscountEndDate;


        public double Weight ;

        public double Length ;

        public double Width ;

        public double Height ;

        public Date AvailableStartDateTimeUtc ;

        public Date AvailableEndDateTimeUtc ;

        public int DisplayOrder ;

        public boolean Published ;

        public String ProductPictureList ;

        public int RelatedProductIds ;

        public List<ec_Picture> ProductPictures ;

        //public List<NetisWare.Ec.Merchant.Models.Merchant> Merchants ;

        public List<ec_Manufacturer> Manufacturers ;

        public List<ProductAttributeData> ProductAttributeValueData ;
        public List<ProductAttributeData> ProductAttributeValueDataAll ;


        public int MerchantId ;
        public int ManufacturerId ;
        public String ProductAttributeIds ;

        public String ProductPicturePreviewIds ;

        public String ProductAttributeString ;
        public String ProductPictureString ;

        public String ProductPictureDeleteString ;

        int _returnPageNumber = 1;

        public int ReturnPageNumber;

        public boolean IsJualCepat ;
        public Date JualCepatStartDate ;
        public Date JualCepatEndDate ;

        public int SearchCounter ;
        public boolean IsPercentage ;
        public double Percentage ;
        public double Value ;
        public Date StartDate ;
        public Date EndDate ;


        public List<SelectUtility.DocumentSelectItem> CategoryDataList ;
        public List<SelectUtility.DocumentSelectItem> MainCategoryDataList ;
        public List<SelectUtility.DocumentSelectItem> SubCategoryDataList ;
        public List<SelectUtility.DocumentSelectItem> SubSubCategoryDataList ;

        public List<SelectUtility.DocumentSelectItem> MerchantDataList ;
        public List<SelectUtility.DocumentSelectItem> ManufacturerDataList ;
        public List<SelectUtility.DocumentSelectItem> WarehouseDataList ;
        public List<SelectUtility.DocumentSelectItem> ProductAttributeList ;
        public List<SelectUtility.DocumentSelectItem> ProductAttributeValueList ;
        public List<SelectUtility.DocumentSelectItem> BasePriceByList ;

        /**public ProductPriceMappingService<ec_ProductPriceMapping, IProductPriceMappingRepository<ec_ProductPriceMapping>> productPriceService;
        public CategoryService<ec_Category, ICategoryRepository<ec_Category>> categoryService = null;
        public PictureService<ec_Picture, IPictureRepository<ec_Picture>> pictureService = null;
        public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;
        public MerchantManager<NetisWare.Ec.Merchant.Models.Merchant, IMerchantRepository<Merchant.Models.Merchant>> merchantService;
        public ManufacturerService<ec_Manufacturer, IManufacturerRepository<ec_Manufacturer>> manufacturerService;
        public WarehouseService<ec_Warehouse, IWarehouseRepository<ec_Warehouse>> warehouseService;
        public ProductAttributeService<ec_ProductAttribute, IProductAttributeRepository<ec_ProductAttribute>> productAttributeService;
        public ProductAttributeValueService<ec_ProductAttributeValue, IProductAttributeValueRepository<ec_ProductAttributeValue>> productAttributeValueService;

        public DiscountService<ec_Discount, IDiscountRepository<ec_Discount>> orderDiscountService;
        public DiscountToProductService<ec_DiscountToProduct, IDiscountToProductRepository<ec_DiscountToProduct>> orderDiscountToProductService;*/

        public static ProductModel ModelFromProduct(ec_Product iProduct)
        {
            ProductModel model = new ProductModel();

            model.Guid = iProduct.Guid;
            model.Id = iProduct.Id;
            model.Name = iProduct.Name;
            model.Description = iProduct.Description;
            model.SiteId = iProduct.SiteId;
            model.StatusId = iProduct.StatusId;
            model.TemplateId = iProduct.TemplateId;
            model.AttachmentId = iProduct.AttachmentId;
            model.Deleted = iProduct.Deleted;
            model.Version = iProduct.Version;
            model.CreateUserId = iProduct.CreateUserId;
            model.CreateDate = iProduct.CreateDate;
            model.UpdateUserId = iProduct.UpdateUserId;
            model.UpdateDate = iProduct.UpdateDate;

            model.ProductTypeId = iProduct.ProductTypeId;
            model.ParentGroupedProductId = iProduct.ParentGroupedProductId;
            model.VisibleIndividually = iProduct.VisibleIndividually;
            model.FullDescription = iProduct.FullDescription;
            model.AdminComment = iProduct.AdminComment;
            model.ProductTemplateId = iProduct.ProductTemplateId;
            model.VendorId = iProduct.VendorId;
            model.ShowOnHomePage = iProduct.ShowOnHomePage;
            model.MetaKeywords = iProduct.MetaKeywords;
            model.MetaDescription = iProduct.MetaDescription;
            model.MetaTitle = iProduct.MetaTitle;
            model.AllowCustomerReviews = iProduct.AllowCustomerReviews;
            model.ApprovedRatingSum = iProduct.ApprovedRatingSum;
            model.NotApprovedRatingSum = iProduct.NotApprovedRatingSum;
            model.ApprovedTotalReviews = iProduct.ApprovedTotalReviews;
            model.NotApprovedTotalReviews = iProduct.NotApprovedTotalReviews;
            model.SubjectToAcl = iProduct.SubjectToAcl;
            model.LimitedToStores = iProduct.LimitedToStores;
            model.Sku = iProduct.Sku;
            model.ManufacturerPartNumber = iProduct.ManufacturerPartNumber;
            model.Gtin = iProduct.Gtin;
            model.IsGiftCard = iProduct.IsGiftCard;
            model.GiftCardTypeId = iProduct.GiftCardTypeId;
            model.OverriddenGiftCardAmount = iProduct.OverriddenGiftCardAmount;
            model.RequireOtherProducts = iProduct.RequireOtherProducts;
            model.RequiredProductIds = iProduct.RequiredProductIds;
            model.AutomaticallyAddRequiredProducts = iProduct.AutomaticallyAddRequiredProducts;
            model.IsDownload = iProduct.IsDownload;
            model.DownloadId = iProduct.DownloadId;
            model.UnlimitedDownloads = iProduct.UnlimitedDownloads;
            model.MaxNumberOfDownloads = iProduct.MaxNumberOfDownloads;
            model.DownloadExpirationDays = iProduct.DownloadExpirationDays;
            model.DownloadActivationTypeId = iProduct.DownloadActivationTypeId;
            model.HasSampleDownload = iProduct.HasSampleDownload;
            model.SampleDownloadId = iProduct.SampleDownloadId;
            model.HasUserAgreement = iProduct.HasUserAgreement;
            model.UserAgreementText = iProduct.UserAgreementText;
            model.IsRecurring = iProduct.IsRecurring;
            model.RecurringCycleLength = iProduct.RecurringCycleLength;
            model.RecurringCyclePeriodId = iProduct.RecurringCyclePeriodId;
            model.RecurringTotalCycles = iProduct.RecurringTotalCycles;
            model.IsRental = iProduct.IsRental;
            model.RentalPriceLength = iProduct.RentalPriceLength;
            model.RentalPricePeriodId = iProduct.RentalPricePeriodId;
            model.IsShipEnabled = iProduct.IsShipEnabled;
            model.IsFreeShipping = iProduct.IsFreeShipping;
            model.ShipSeparately = iProduct.ShipSeparately;
            model.AdditionalShippingCharge = iProduct.AdditionalShippingCharge;
            model.DeliveryDateId = iProduct.DeliveryDateId;
            model.IsTaxExempt = iProduct.IsTaxExempt;
            model.TaxCategoryId = iProduct.TaxCategoryId;
            model.IsTelecommunicationsOrBroadcastingOrElectronicServices = iProduct.IsTelecommunicationsOrBroadcastingOrElectronicServices;
            model.ManageInventoryMethodId = iProduct.ManageInventoryMethodId;
            model.UseMultipleWarehouses = iProduct.UseMultipleWarehouses;
            model.WarehouseId = iProduct.WarehouseId;
            model.StockQuantity = iProduct.StockQuantity;
            model.DisplayStockAvailability = iProduct.DisplayStockAvailability;
            model.DisplayStockQuantity = iProduct.DisplayStockQuantity;
            model.MinStockQuantity = iProduct.MinStockQuantity;
            model.LowStockActivityId = iProduct.LowStockActivityId;
            model.NotifyAdminForQuantityBelow = iProduct.NotifyAdminForQuantityBelow;
            model.BackorderModeId = iProduct.BackorderModeId;
            model.AllowBackInStockSubscriptions = iProduct.AllowBackInStockSubscriptions;
            model.OrderMinimumQuantity = iProduct.OrderMinimumQuantity;
            model.OrderMaximumQuantity = iProduct.OrderMaximumQuantity;
            model.AllowedQuantities = iProduct.AllowedQuantities;
            model.AllowAddingOnlyExistingAttributeCombinations = iProduct.AllowAddingOnlyExistingAttributeCombinations;
            model.DisableBuyButton = iProduct.DisableBuyButton;
            model.DisableWishlistButton = iProduct.DisableWishlistButton;
            model.AvailableForPreOrder = iProduct.AvailableForPreOrder;
            model.PreOrderAvailabilityStartDateTimeUtc = iProduct.PreOrderAvailabilityStartDateTimeUtc;
            model.CallForPrice = iProduct.CallForPrice;
            model.Price = iProduct.Price;
            model.OldPrice = iProduct.OldPrice;
            model.ProductCost = iProduct.ProductCost;
            model.SpecialPrice = iProduct.SpecialPrice;
            model.VoucherAmount = iProduct.VoucherAmount;
            model.SpecialPriceStartDateTimeUtc = iProduct.SpecialPriceStartDateTimeUtc;
            model.SpecialPriceEndDateTimeUtc = iProduct.SpecialPriceEndDateTimeUtc;
            model.CustomerEntersPrice = iProduct.CustomerEntersPrice;
            model.MinimumCustomerEnteredPrice = iProduct.MinimumCustomerEnteredPrice;
            model.MaximumCustomerEnteredPrice = iProduct.MaximumCustomerEnteredPrice;
            model.BasepriceEnabled = iProduct.BasepriceEnabled;
            model.BasepriceAmount = iProduct.BasepriceAmount;
            model.BasepriceUnitId = iProduct.BasepriceUnitId;
            model.BasepriceBaseAmount = iProduct.BasepriceBaseAmount;
            model.BasepriceBaseUnitId = iProduct.BasepriceBaseUnitId;
            model.MarkAsNew = iProduct.MarkAsNew;
            model.MarkAsNewStartDateTimeUtc = iProduct.MarkAsNewStartDateTimeUtc;
            model.MarkAsNewEndDateTimeUtc = iProduct.MarkAsNewEndDateTimeUtc;
            model.HasTierPrices = iProduct.HasTierPrices;
            model.Gtin = iProduct.Gtin;
            model.RelatedProductIds = iProduct.RelatedProductIds;
            model.HasDiscountsApplied = iProduct.HasDiscountsApplied;

            model.DiscountPercentage = 0;
            model.DiscountStartDate = Date.from(Instant.now());
            model.DiscountEndDate = Date.from(Instant.now());

            model.Weight = iProduct.Weight;
            model.Length = iProduct.Length;
            model.Width = iProduct.Width;
            model.Height = iProduct.Height;
            model.AvailableStartDateTimeUtc = iProduct.AvailableStartDateTimeUtc;
            model.AvailableEndDateTimeUtc = iProduct.AvailableEndDateTimeUtc;
            model.DisplayOrder = iProduct.DisplayOrder;
            model.Published = iProduct.Published;
            model.InfoInsurance = iProduct.InfoInsurance;

            model.IsJualCepat = iProduct.IsJualCepat;
            model.JualCepatStartDate = iProduct.JualCepatStartDate;
            model.JualCepatEndDate = iProduct.JualCepatEndDate;

            model.CallForShippingCost = iProduct.CallForShippingCost;
            model.DisplayGroupId = iProduct.DisplayGroupId;

            return model;
        }

        public static ec_Product ProductFromModel(UUID guid, ProductModel model)
        {
            ec_Product iProduct = new ec_Product();

            //if ((guid != null) && (guid != UUID.Empty))
             //   iProduct = await model.productService.GetDocumentByGuid(guid);

            iProduct.Name = model.Name;
            iProduct.Sku = model.Sku;
            iProduct.ParentGroupedProductId = model.ParentGroupedProductId;
            iProduct.Published = model.Published;
            iProduct.Description = model.Description;
            iProduct.FullDescription = model.FullDescription;
            iProduct.Price = model.Price;
            iProduct.OldPrice = model.OldPrice;
            iProduct.StockQuantity = model.StockQuantity;
            iProduct.DisplayStockAvailability = model.DisplayStockAvailability;
            iProduct.DisplayStockQuantity = model.DisplayStockQuantity;
            iProduct.MinStockQuantity = model.MinStockQuantity;
            iProduct.NotifyAdminForQuantityBelow = model.NotifyAdminForQuantityBelow;
            iProduct.BackorderModeId = model.BackorderModeId;
            iProduct.OrderMinimumQuantity = model.OrderMinimumQuantity;
            iProduct.OrderMaximumQuantity = model.OrderMaximumQuantity;
            iProduct.DisableBuyButton = model.DisableBuyButton;
            iProduct.DisableWishlistButton = model.DisableWishlistButton;
            iProduct.AvailableForPreOrder = model.AvailableForPreOrder;
            iProduct.PreOrderAvailabilityStartDateTimeUtc = model.PreOrderAvailabilityStartDateTimeUtc;
            iProduct.CallForPrice = model.CallForPrice;
            iProduct.ProductCost = model.ProductCost;
            iProduct.VoucherAmount = model.VoucherAmount;
            iProduct.SpecialPrice = model.SpecialPrice;
            iProduct.SpecialPriceStartDateTimeUtc = model.SpecialPriceStartDateTimeUtc;
            iProduct.SpecialPriceEndDateTimeUtc = model.SpecialPriceEndDateTimeUtc;
            iProduct.AdminComment = model.AdminComment;
            iProduct.CustomerEntersPrice = model.CustomerEntersPrice;
            iProduct.MinimumCustomerEnteredPrice = model.MinimumCustomerEnteredPrice;
            iProduct.MaximumCustomerEnteredPrice = model.MaximumCustomerEnteredPrice;
            iProduct.BasepriceEnabled = model.BasepriceEnabled;
            iProduct.BasepriceAmount = model.BasepriceAmount;
            iProduct.BasepriceAmount = model.BasepriceAmount;
            iProduct.BasepriceUnitId = model.BasepriceUnitId;
            iProduct.BasepriceBaseAmount = model.BasepriceBaseAmount;
            iProduct.BasepriceBaseUnitId = model.BasepriceBaseUnitId;
            iProduct.MarkAsNew = model.MarkAsNew;
            iProduct.MarkAsNewStartDateTimeUtc = model.MarkAsNewStartDateTimeUtc;
            iProduct.MarkAsNewEndDateTimeUtc = model.MarkAsNewEndDateTimeUtc;
            iProduct.HasDiscountsApplied = model.HasDiscountsApplied;
            iProduct.Weight = model.Weight;
            iProduct.Length = model.Length;
            iProduct.Width = model.Width;
            iProduct.Height = model.Height;
            iProduct.AvailableStartDateTimeUtc = model.AvailableStartDateTimeUtc;
            iProduct.AvailableEndDateTimeUtc = model.AvailableEndDateTimeUtc;
            iProduct.DisplayOrder = model.DisplayOrder;
            iProduct.ProductTemplateId = model.ProductTemplateId;
            iProduct.ShowOnHomePage = model.ShowOnHomePage;
            iProduct.AllowCustomerReviews = model.AllowCustomerReviews;
            iProduct.IsGiftCard = model.IsGiftCard;
            iProduct.HasSampleDownload = model.HasSampleDownload;
            iProduct.IsDownload = model.IsDownload;
            iProduct.UnlimitedDownloads = model.UnlimitedDownloads;
            iProduct.MaxNumberOfDownloads = model.MaxNumberOfDownloads;
            iProduct.DownloadExpirationDays = model.DownloadExpirationDays;
            iProduct.IsRental = model.IsRental;
            iProduct.RentalPriceLength = model.RentalPriceLength;
            iProduct.RentalPricePeriodId = model.RentalPricePeriodId;
            iProduct.IsShipEnabled = model.IsShipEnabled;
            iProduct.IsFreeShipping = model.IsFreeShipping;
            iProduct.AdditionalShippingCharge = model.AdditionalShippingCharge;
            iProduct.DeliveryDateId = model.DeliveryDateId;
            iProduct.IsTaxExempt = model.IsTaxExempt;
            iProduct.TaxCategoryId = model.TaxCategoryId;
            iProduct.IsTelecommunicationsOrBroadcastingOrElectronicServices = model.IsTelecommunicationsOrBroadcastingOrElectronicServices;
            iProduct.WarehouseId = model.WarehouseId;
            iProduct.InfoInsurance = model.InfoInsurance;
            iProduct.Gtin = model.Gtin;
            iProduct.RelatedProductIds = model.RelatedProductIds;
            iProduct.IsJualCepat = model.IsJualCepat;
            iProduct.JualCepatStartDate = model.JualCepatStartDate;
            iProduct.JualCepatEndDate = model.JualCepatEndDate;

            iProduct.CallForShippingCost = model.CallForShippingCost;
            iProduct.DisplayGroupId = model.DisplayGroupId;

            return iProduct;
        }

        /**public static Task<ProductModel> InitProductSelectList(ProductModel model, int CategoryId, int SubCategoryId)
        {
            model.ProductPictures = await model.productService.GetPictureByProductId(model.Id);

            try
            {
                //create main category list
                Dictionary<String, String> status = new Dictionary<String, String>();
                status.Add("0", "Root");
                CategoryListExt maincatList = new CategoryListExt(status, SELECT_ID_TYPE.INT);
                maincatList.CreateSelect();
                model.MainCategoryDataList = maincatList.SelectHelperIdList;

                //create category list
                List<ec_Category> categories_temp = await model.categoryService.GetCategoriesByParentCategoryId(0);
                var categories = categories_temp.OrderBy(x => x.Name).ToList<ec_Category>();
                CategoryList<ec_Category> catList = new CategoryList<ec_Category>(categories, SELECT_ID_TYPE.INT, "Name");
                catList.CreateSelect();
                catList.AddItem(-1, "-- Not Set --");
                model.CategoryDataList = catList.SelectHelperIdList;

                //create subcategory list
                List<ec_Category> subcategories_temp = await model.categoryService.GetCategoriesByParentCategoryId(CategoryId);
                var subcategories = subcategories_temp.OrderBy(x => x.Name).ToList<ec_Category>();
                CategoryList<ec_Category> subcatList = new CategoryList<ec_Category>(subcategories, SELECT_ID_TYPE.INT, "Name");
                subcatList.CreateSelect();
                subcatList.AddItem(-1, "-- Not Set --");
                model.SubCategoryDataList = subcatList.SelectHelperIdList;

                //create subsubcategory list
                List<ec_Category> subsubcategories_temp = await model.categoryService.GetCategoriesByParentCategoryId(SubCategoryId);
                var subsubcategories = subsubcategories_temp.OrderBy(x => x.Name).ToList<ec_Category>();
                CategoryList<ec_Category> subsubcatList = new CategoryList<ec_Category>(subsubcategories, SELECT_ID_TYPE.INT, "Name");
                subsubcatList.CreateSelect();
                subsubcatList.AddItem(-1, "-- Not Set --");
                model.SubSubCategoryDataList = subsubcatList.SelectHelperIdList;

                //create merchant list
                List<NetisWare.Ec.Merchant.Models.Merchant> merchants = await model.merchantService.GetAllDocuments();
                MerchantList<NetisWare.Ec.Merchant.Models.Merchant>merList = new MerchantList<NetisWare.Ec.Merchant.Models.Merchant>(merchants, SELECT_ID_TYPE.INT, "Name");
                merList.CreateSelect();
                model.MerchantDataList = merList.SelectHelperIdList;

                //create manufacturer list
                List<ec_Manufacturer> manufacturers = await model.manufacturerService.GetAllDocuments();
                var manu = manufacturers.Where(p => p.Id == 27).ToList<ec_Manufacturer>(); //17OKT18-7
                ManufacturerList<ec_Manufacturer> manuList = new ManufacturerList<ec_Manufacturer>(manu, SELECT_ID_TYPE.INT, "Name");
                manuList.CreateSelect();
                model.ManufacturerDataList = manuList.SelectHelperIdList;

                //create warehouse list
                List<ec_Warehouse> warehouses = await model.warehouseService.GetAllDocuments();
                WarehouseList<ec_Warehouse> wareList = new WarehouseList<ec_Warehouse>(warehouses, SELECT_ID_TYPE.INT, "Name");
                wareList.CreateSelect();
                model.WarehouseDataList = wareList.SelectHelperIdList;

                //create product attr list
                List<ec_ProductAttribute> productAtt = await model.productAttributeService.GetAllDocuments();
                ProductAttributeList<ec_ProductAttribute> productAttList = new ProductAttributeList<ec_ProductAttribute>(productAtt, SELECT_ID_TYPE.INT, "Name");
                productAttList.CreateSelect();
                model.ProductAttributeList = productAttList.SelectHelperIdList;

                //create product attr val list
                model.ProductAttributeValueData = await model.productService.GetProductAttributesValueByProductId(model.Id);
                model.ProductAttributeValueDataAll = await model.productService.GetProductAttributesValueAll();
                Dictionary<String, String> attVals = new Dictionary<String, String>();
                foreach (var val in model.ProductAttributeValueDataAll)
                {
                    attVals.Add(val.ProductAttributeValueId.ToString(),val.Value);
                }

                ProductAttributeValueList prodAttValList = new ProductAttributeValueList(attVals, SELECT_ID_TYPE.INT);
                prodAttValList.CreateSelect();
                model.ProductAttributeValueList = prodAttValList.SelectHelperIdList;

                //base priceby list
                Dictionary<String, String> basePrices = new Dictionary<String, String>();
                basePrices.Add("-1", "-- select --");
                basePrices.Add("0","Merchant");
                basePrices.Add("1", "Category");
                BasePriceByList basePriceList = new BasePriceByList(basePrices, SELECT_ID_TYPE.INT);
                basePriceList.CreateSelect();
                model.BasePriceByList = basePriceList.SelectHelperIdList;

                var productPriceMapping = await model.productPriceService.GetProductPriceMappingProductId(model.Id, DateTime.Now);
                model.IsPercentage = productPriceMapping.FirstOrDefault().IsPercentage == null ? false : productPriceMapping.FirstOrDefault().IsPercentage.Value;
                model.Percentage = productPriceMapping.FirstOrDefault().Percentage == null ? 0 : productPriceMapping.FirstOrDefault().Percentage.Value;
                model.Value = productPriceMapping.FirstOrDefault().Value == null ? 0 : productPriceMapping.FirstOrDefault().Value.Value;
                model.StartDate = productPriceMapping.FirstOrDefault().StartDate;
                model.EndDate = productPriceMapping.FirstOrDefault().EndDate;

            }
            catch (Exception ex)
            {
                String err = ex.Message;
            }
            return model;
        }*/
}

