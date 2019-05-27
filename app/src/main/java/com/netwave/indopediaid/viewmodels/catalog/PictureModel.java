package com.netwave.indopediaid.viewmodels.catalog;

import com.netwave.indopediaid.models.catalog.ec_Picture;

import java.util.Date;
import java.util.UUID;

public class PictureModel {
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

        public byte[] PictureBinary;
        public String PictureName;
        public String MimeType;
        public String SeoFilename;
        public String AltAttribute;
        public String TitleAttribute;
        public boolean IsNew;
        public boolean IsAsProductPreview;
        public boolean IsAsFirstDisplayProductPreview;

        int _returnPageNumber = 1;

        public int ReturnPageNumber;

        public static PictureModel FromPictureEntity(ec_Picture iPic)
        {
            PictureModel model = new PictureModel();

            model.Guid = iPic.Guid;
            model.Id = iPic.Id;
            model.SiteId = iPic.SiteId;
            model.StatusId = iPic.StatusId;
            model.AttachmentId = iPic.AttachmentId;
            model.TemplateId = iPic.TemplateId;
            model.Deleted = iPic.Deleted;
            model.CreateDate = iPic.CreateDate;
            model.CreateUserId = iPic.CreateUserId;
            model.UpdateDate = iPic.UpdateDate;
            model.UpdateUserId = iPic.UpdateUserId;
            model.Version = iPic.Version;
            model.Name = iPic.Name;
            model.Description = iPic.Description;
            model.MimeType = iPic.MimeType;
            model.SeoFilename = iPic.SeoFilename;
            model.AltAttribute = iPic.AltAttribute;
            model.TitleAttribute = iPic.TitleAttribute;
            model.IsNew = iPic.IsNew;
            model.PictureBinary = iPic.PictureBinary;
            model.IsAsFirstDisplayProductPreview = iPic.IsAsFirstDisplayProductPreview;

            return model;
        }

        public static ec_Picture FromPictureModel(PictureModel model)
        {
            ec_Picture iPic = new ec_Picture();

            iPic.Guid = model.Guid;
            iPic.Id = model.Id;
            iPic.SiteId = model.SiteId;
            iPic.StatusId = model.StatusId;
            iPic.AttachmentId = model.AttachmentId;
            iPic.TemplateId = model.TemplateId;
            iPic.Deleted = model.Deleted;
            iPic.CreateDate = model.CreateDate;
            iPic.CreateUserId = model.CreateUserId;
            iPic.UpdateDate = model.UpdateDate;
            iPic.UpdateUserId = model.UpdateUserId;
            iPic.Version = model.Version;
            iPic.Name = model.Name;
            iPic.Description = model.Description;
            iPic.MimeType = model.MimeType;
            iPic.SeoFilename = model.SeoFilename;
            iPic.AltAttribute = model.AltAttribute;
            iPic.TitleAttribute = model.TitleAttribute;
            iPic.IsNew = model.IsNew;
            iPic.PictureBinary = model.PictureBinary;
            iPic.IsAsFirstDisplayProductPreview = model.IsAsFirstDisplayProductPreview;

            return iPic;
        }
    }
