package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.HtmlHelpers.SelectUtility;
import frontend.netwave.indopediaid.models.catalog.ec_Manufacturer;

import java.util.*;import frontend.netwave.indopediaid.HtmlHelpers.SelectUtility;

public class ProductListPageModel {

    private String _header = "";
    private String _footer = "";
    public String Header;

    public String Footer;

    public ProductListPageModel() {    }

    public ProductSearchEdit PSearchInfo; /*26OKT18-1*/
    public ProductSearchInfo ProductSearchInfo;

    public String Heading;

    public List<ProductInfo> Products;

    //public PaginationSettings Paging;

    private boolean useModals = false;

    public boolean UseModals;

    public class ProductInfo {
        // product data
        public UUID Guid;
        public int Id;
        public String Name;
        public String Description;
        public String SKU;
        public Date CreateDate;
        public double Price;
        public boolean Available;
        public String MerchantName;
        public ec_Manufacturer Manufacturer;
    }

    public enum TargetSearchStore {
        //MyStore =0,
        //OtherStore =1,
        //AllStore =2
    }

    public class ProductSearchEdit /*26OKT18-1*/
    {
        public String ProductName1;
        public String Description1;
        public String FullDescription1;
        public String Attributes1;
        public int CategoryId1;
        public int MerchantCheckId1; /*25OKT18-2*/
        public boolean SubCategory1;
    }

    public class ProductSearchInfo {
        public String ProductName;
        public String Description;
        public String FullDescription;
        public String Attributes;
        public int CategoryId;
        public int MerchantCheckId; /*25OKT18-2*/

        //public List<NetisWare.Ec.Merchant.Models.Merchant> Merchants;/*25OKT18-2*/
        public boolean SubCategory;
        public int ManufactureId;
        public TargetSearchStore TargetSearchStore;
        public int MerchantId;

        //public ManufacturerService<ec_Manufacturer, IManufacturerRepository<ec_Manufacturer>> manufacturerService;

        //public CategoryService<ec_Category, ICategoryRepository<ec_Category>> categoryService = null;

        //public MerchantManager<NetisWare.Ec.Merchant.Models.Merchant, IMerchantRepository<Merchant.Models.Merchant>> merchantService; /*25OKT18-2*/
        public List<SelectUtility.DocumentSelectItem> MerchantDataList; /*25OKT18-2*/

        public List<SelectUtility.DocumentSelectItem> CategoryDataList;

        public List<SelectUtility.DocumentSelectItem> ManufacturerDataList;

        /**public Task<List<ec_Category>>

        getSubCategoriesAsync(int categoryId) {
            List<ec_Category> categories = categoryService.GetAllDocuments();
            tempSubCategories = null;
            constructSubCategories(categoryId, categories);
            return tempSubCategories;
        }

        public Task<ProductSearchInfo> InitProductSelectList(ProductSearchInfo model) {
            //create manufacturer list
            List<ec_Manufacturer> manufacturers = model.manufacturerService.GetAllDocuments();
            ManufacturerList<ec_Manufacturer> manuList = new ManufacturerList<ec_Manufacturer>(manufacturers, SELECT_ID_TYPE.INT, "Name");
            manuList.CreateSelect();
            manuList.AddItem(0, "All");
            model.ManufacturerDataList = manuList.SelectHelperIdList;
            model.ManufacturerDataList.Sort((x1, x2) =>x1.Id.CompareTo(x2.Id));

            //create category list
            List<ec_Category> categories = model.categoryService.GetAllDocuments();
            var cate = categories.Where(x = > x.Deleted == false && x.Published == true && x.ShowOnHomePage == true).
            ToList();
            CategoryList<ec_Category> catList = new CategoryList<ec_Category>(cate, SELECT_ID_TYPE.INT, "Name");
            catList.CreateSelect();
            catList.AddItem(0, "All");
            model.CategoryDataList = catList.SelectHelperIdList;
            model.CategoryDataList.Sort((x1, x2) =>x1.Id.CompareTo(x2.Id));

            //create merchant list
            List<NetisWare.Ec.Merchant.Models.Merchant> merchants = await
            model.merchantService.GetAllDocuments();
            var test = merchants.Count();
            MerchantList<NetisWare.Ec.Merchant.Models.Merchant> merList = new MerchantList<NetisWare.Ec.Merchant.Models.Merchant>(merchants, SELECT_ID_TYPE.INT, "Name");
            merList.CreateSelect();
            merList.AddItem(0, "All");
            model.MerchantDataList = merList.SelectHelperIdList;
            model.MerchantDataList.Sort((x1, x2) =>x1.Id.CompareTo(x2.Id));

            return model;
        }

        private List<ec_Category> tempSubCategories;

        private void constructSubCategories(int categoryId, List<ec_Category> categories) {
            if (tempSubCategories == null) {
                tempSubCategories = new List<ec_Category>();
            }
            var category = categories.FirstOrDefault(x = > x.Id == categoryId);
            if (category != null) {
                tempSubCategories.Add(category);
                foreach(var cat in categories)
                {
                    if (cat.ParentCategoryId == category.Id) {
                        constructSubCategories(cat.Id, categories);
                    }
                }
            }

        }*/
    }
}
