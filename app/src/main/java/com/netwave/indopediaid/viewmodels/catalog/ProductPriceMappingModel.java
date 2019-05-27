package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.HtmlHelpers.SelectUtility;
import com.netwave.indopediaid.models.catalog.BaseDocument;
import com.netwave.indopediaid.models.catalog.ec_ProductPriceMapping;

import java.util.*;

public class ProductPriceMappingModel extends BaseDocument {
        public int ec_ProductId;
        public int[] ec_CategoryIds;
        public int[] ec_MerchantIds;

        public boolean IsPercentage;
        public double Percentage;
        public double Value;
        public Date StartDate;
        public Date EndDate;

        public int ReturnPageNumber;

        public static ProductPriceMappingModel FromPriceMappingEntity(ec_ProductPriceMapping iCat)
        {
            ProductPriceMappingModel model = new ProductPriceMappingModel();

            model.Guid = iCat.Guid;
            model.Id = iCat.Id;
            model.SiteId = iCat.SiteId;
            model.StatusId = iCat.StatusId;
            model.AttachmentId = iCat.AttachmentId;
            model.TemplateId = iCat.TemplateId;
            model.Deleted = iCat.Deleted;
            model.CreateDate = iCat.CreateDate;
            model.CreateUserId = iCat.CreateUserId;
            model.UpdateDate = iCat.UpdateDate;
            model.UpdateUserId = iCat.UpdateUserId;
            model.Version = iCat.Version;
            model.Name = iCat.Name;
            model.Description = iCat.Description;
            model.Version = iCat.Version;

            model.ec_ProductId = iCat.ec_ProductId;
            model.IsPercentage = iCat.IsPercentage;
            model.Percentage = iCat.Percentage;
            model.Value = iCat.Value;
            model.StartDate = iCat.StartDate;
            model.EndDate = iCat.EndDate;

            return model;
        }

        public static ec_ProductPriceMapping PriceMappingFromModel(ProductPriceMappingModel model)
        {
            ec_ProductPriceMapping iCat = new ec_ProductPriceMapping();

            iCat.Guid = model.Guid;
            iCat.Id = model.Id;
            iCat.SiteId = model.SiteId;
            iCat.StatusId = model.StatusId;
            iCat.AttachmentId = model.AttachmentId;
            iCat.TemplateId = model.TemplateId;
            iCat.Deleted = model.Deleted;
            iCat.CreateDate = model.CreateDate;
            iCat.CreateUserId = model.CreateUserId;
            iCat.UpdateDate = model.UpdateDate;
            iCat.UpdateUserId = model.UpdateUserId;
            iCat.Version = model.Version;
            iCat.Name = model.Name;
            iCat.Description = model.Description;
            iCat.Version = model.Version;

            iCat.ec_ProductId = model.ec_ProductId;
            iCat.IsPercentage = model.IsPercentage;
            iCat.Percentage = model.Percentage;
            iCat.Value = model.Value;
            iCat.StartDate = model.StartDate;
            iCat.EndDate = model.EndDate;

            return iCat;
        }

        public List<SelectUtility.DocumentSelectItem> BasePriceByList;
        public int BasePriceById;
        public List<SelectUtility.DocumentSelectItem> MerchantDataList;
        public List<SelectUtility.DocumentSelectItem> CategoryDataList;

        //public MerchantManager<NetisWare.Ec.Merchant.Models.Merchant, IMerchantRepository<Merchant.Models.Merchant>> merchantService;
        //public CategoryService<ec_Category, ICategoryRepository<ec_Category>> categoryService = null;

        /**public async static Task<ProductPriceMappingModel> IniProductPriceSelectList(ProductPriceMappingModel model)
        {
            try
            {
                //create main category list
                //base priceby list
                Dictionary<string, string> basePrices = new Dictionary<string, string>();
                //basePrices.Add("-1", "-- select --");  //14MAR19-7
                basePrices.Add("0", "Merchant");
                basePrices.Add("1", "Category");
                BasePriceByList basePriceList = new BasePriceByList(basePrices, SELECT_ID_TYPE.INT);
                basePriceList.CreateSelect();
                model.BasePriceByList = basePriceList.SelectHelperIdList;

                //create merchant list
                List<NetisWare.Ec.Merchant.Models.Merchant> merchants = await model.merchantService.GetAllDocuments();
                var allmerchant = merchants.Where(x => x.MerchantStatus == 1).ToList();
                MerchantList<NetisWare.Ec.Merchant.Models.Merchant> merList = new MerchantList<NetisWare.Ec.Merchant.Models.Merchant>(allmerchant, SELECT_ID_TYPE.INT, "Name");
                merList.CreateSelect();
                //merList.AddItem(-1, "All Merchant")
                model.MerchantDataList = merList.SelectHelperIdList;

                //create category list
                List<ec_Category> categories_temp = await model.categoryService.GetAllDocuments();
                var categories = categories_temp.OrderBy(x => x.Name).Where(x=>x.Deleted == false).ToList<ec_Category>();
                CategoryList<ec_Category> catList = new CategoryList<ec_Category>(categories, SELECT_ID_TYPE.INT, "Name");
                catList.CreateSelect();
                //catList.AddItem(-1, "-- select --"); //14MAR19-7
                model.CategoryDataList = catList.SelectHelperIdList;


            }
            catch (Exception ex)
            {
                string err = ex.Message;
            }
            return model;
        }*/

    }
