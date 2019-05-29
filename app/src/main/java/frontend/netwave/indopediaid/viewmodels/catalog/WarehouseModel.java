package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_Warehouse;

import java.util.Date;
import java.util.UUID;

public class WarehouseModel
    {
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

        public String AdminComment;

        public int AddressId;

        int _returnPageNumber = 1;

        public int ReturnPageNumber;

        //public WarehouseService<ec_Warehouse, IWarehouseRepository<ec_Warehouse>> warehouseService = null;
        //public ProductService<ec_Product, IProductRepository<ec_Product>> productService = null;

        public static WarehouseModel ModelFromWarehouseEntity(ec_Warehouse iWarehouse)
        {
            WarehouseModel model = new WarehouseModel();

            model.Guid = iWarehouse.Guid;
            model.Id = iWarehouse.Id;
            model.Name = iWarehouse.Name;
            model.Description = iWarehouse.Description;
            model.SiteId = iWarehouse.SiteId;
            model.StatusId = iWarehouse.StatusId;
            model.TemplateId = iWarehouse.TemplateId;
            model.AttachmentId = iWarehouse.AttachmentId;
            model.Deleted = iWarehouse.Deleted;
            model.Version = iWarehouse.Version;
            model.CreateUserId = iWarehouse.CreateUserId;
            model.CreateDate = iWarehouse.CreateDate;
            model.UpdateUserId = iWarehouse.UpdateUserId;
            model.UpdateDate = iWarehouse.UpdateDate;

            return model;
        }

        public static ec_Warehouse WarehouseFromModel(UUID guid, WarehouseModel model)
        {
            ec_Warehouse iWarehouse = new ec_Warehouse();

            //if ((guid != null) && (guid != Guid.Empty))
              //  iWarehouse = model.warehouseService.GetDocumentByGuid(guid);

            iWarehouse.Name = model.Name;
            iWarehouse.Description = model.Description;
            iWarehouse.AdminComment = model.AdminComment;
            iWarehouse.AddressId = model.AddressId;
           
            return iWarehouse;
        }

    }
