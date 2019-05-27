package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_Supplier;

import java.util.Date;
import java.util.UUID;

public class SupplierModel
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

        public int UserId;

        int _returnPageNumber = 1;

        public int ReturnPageNumber;
        //public SupplierService<ec_Supplier, ISupplierRepository<ec_Supplier>> SupplierService = null;


        public static SupplierModel ModelFromSupplierEntity(ec_Supplier iMnf)
        {
            SupplierModel model = new SupplierModel();

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

            return model;
        }

        public static ec_Supplier SupplierFromModel(UUID guid, SupplierModel model)
        {
            ec_Supplier iSupplier = new ec_Supplier();

            //if ((guid != null) && (guid != Guid.Empty))
              //  iSupplier = model.SupplierService.GetDocumentByGuid(guid);

            iSupplier.Name = model.Name;
            iSupplier.Description = model.Description;

            return iSupplier;
        }
    }
