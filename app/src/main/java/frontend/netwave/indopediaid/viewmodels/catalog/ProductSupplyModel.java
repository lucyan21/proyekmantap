package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.HtmlHelpers.SelectUtility;
import frontend.netwave.indopediaid.models.catalog.BaseDocument;
import frontend.netwave.indopediaid.models.catalog.ec_ProductSupply;

import java.util.*;

public class ProductSupplyModel extends BaseDocument {


        public String ProductName;
        public int ec_ProductId;
        public int ec_WarehouseId;
        public int ec_SupplierId;
        public Date SupplyDatetime;
        public int SupplyQuantity;
        public int OldSupplyQuantity;
        int _returnPageNumber = 1;
        public int ReturnPageNumber;

        public List<SelectUtility.DocumentSelectItem> SupplierDataList;
        public List<SelectUtility.DocumentSelectItem> ProductDataList;

        public List<SelectUtility.DocumentSelectItem> WarehouseDataList;

        //public ProductSupplyService<ec_ProductSupply, IProductSupplyRepository<ec_ProductSupply>> ProductSupplyService = null;
        //public ProductService<ec_Product, IProductRepository<ec_Product>> ProductService = null;

        //public SupplierService<ec_Supplier, ISupplierRepository<ec_Supplier>> SupplierService = null;
        //public WarehouseService<ec_Warehouse, IWarehouseRepository<ec_Warehouse>> WarehouseService = null;

        public static ProductSupplyModel ModelFromProductSupplyEntity(ec_ProductSupply iMnf)
        {
        ProductSupplyModel model = new ProductSupplyModel();

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

            model.ec_ProductId = iMnf.ec_ProductId;
            model.ec_WarehouseId = iMnf.ec_WarehouseId;
            model.ec_SupplierId = iMnf.ec_SupplierId;
            model.SupplyDatetime = iMnf.SupplyDatetime;
            model.SupplyQuantity = iMnf.SupplyQuantity;
            return model;
        }

        public static ec_ProductSupply ProductSupplyFromModel(UUID guid, ProductSupplyModel model)
        {
                ec_ProductSupply iProductSupply = new ec_ProductSupply();

            iProductSupply.Name = model.Name;
            iProductSupply.Description = model.Description;
            
            iProductSupply.ec_ProductId = model.ec_ProductId;
            iProductSupply.ec_SupplierId = model.ec_SupplierId;
            iProductSupply.ec_WarehouseId = model.ec_WarehouseId;
            iProductSupply.SupplyDatetime = model.SupplyDatetime;
            iProductSupply.SupplyQuantity = model.SupplyQuantity;

            return iProductSupply;
        }

        /**public static ProductSupplyModel InitSelectList(ProductSupplyModel model)
        {
            // setup product list 
                ProductSupplyModel products = model.ProductService.GetAllDocuments();
                ProductSupplyModel productsList = new ProductList<ec_Product>(products, SELECT_ID_TYPE.INT, "Name");
            productsList.CreateSelect();
            model.ProductDataList = productsList.SelectHelperIdList;

            // setup supplier list 
            suppliers = model.SupplierService.GetAllDocuments();
            suppliersList = new SupplierList<ec_Supplier>(suppliers, SELECT_ID_TYPE.INT, "Name");
            suppliersList.CreateSelect();
            model.SupplierDataList = suppliersList.SelectHelperIdList;

            // setup warehouse list
            warehouses = model.WarehouseService.GetAllDocuments();
            warehousesList = new WarehouseList<ec_Warehouse>(warehouses, SELECT_ID_TYPE.INT, "Name");
            warehousesList.CreateSelect();
            model.WarehouseDataList = warehousesList.SelectHelperIdList;

            return model;
        }

    public class SupplierList<T> : SelectHelper<T> where T : ec_Supplier
    {SELECT_ID_TYPE
        public SupplierList(List<T> docs,  idType, String fieldName) : base(docs, idType, fieldName)
        {
        }
    }

    public class ProductList<T> : SelectHelper<T> where T : ec_Product
    {
        public ProductList(List<T> docs, SELECT_ID_TYPE idType, String fieldName) : base(docs, idType, fieldName)
        {        }
    }*/

}
