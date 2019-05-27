package com.netwave.indopediaid.models.catalog;

import android.graphics.Picture;
import android.location.Location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.jar.Attributes;

//ApiResponse

public class ec_Category {

    public int CategoryTemplateId;
    public String MetaKeywords;
    public String MetaDescription;
    public String MetaTitle;
    public int ParentCategoryId;
    public int PictureId;
    public int PageSize;
    public boolean AllowCustomersToSelectPageSize;
    public String PageSizeOptions;
    public String PriceRanges;
    public boolean ShowOnHomePage;
    public boolean IncludeInTopMenu;
    public boolean SubjectToAcl;
    public boolean LimitedToStores;
    public boolean Published;
    public int DisplayOrder;
    public String CategoryPictureList;
    public String BannerPictureFileName;
    public String Guid;
    public int Id;
    public String Name;
    public String Description;
    public String SiteId;
    public String StatusId;
    public String TemplateId;
    public String AttachmentId;
    public int Version;
    public String CreateUserId;
    public Date CreateDate;
    public String UpdateUserId;
    public Date UpdateDate;

    public ec_Category (int CategoryTemplateId, String MetaKeywords, String MetaDescription, String MetaTitle, int ParentCategoryId, int PictureId, int PageSize, boolean AllowCustomersToSelectPageSize,
                        String PageSizeOptions, String PriceRanges, boolean ShowOnHomePage, boolean IncludeInTopMenu, boolean SubjectToAcl, boolean LimitedToStores, boolean Published, int DisplayOrder,
                        String BannerPictureFileName, String Guid, int Id, String Name, String Description, String SiteId, String StatusId, String AttachmentId, int Version, String CreateUserId, String UpdateUserId,
                        Date UpdateDate){
        this.CategoryTemplateId = CategoryTemplateId;
        this.MetaKeywords = MetaKeywords;
        this.MetaDescription = MetaDescription;
        this.MetaTitle = MetaTitle;
        this.ParentCategoryId = ParentCategoryId;
        this.PictureId = PictureId;
        this.PageSize = PageSize;
        this.AllowCustomersToSelectPageSize = AllowCustomersToSelectPageSize;
        this.PageSizeOptions = PageSizeOptions;
        this.PriceRanges = PriceRanges;
        this.ShowOnHomePage = ShowOnHomePage;
        this.IncludeInTopMenu = IncludeInTopMenu;
        this.SubjectToAcl = SubjectToAcl;
        this.LimitedToStores = LimitedToStores;
        this.Published = Published;
        this.DisplayOrder = DisplayOrder;
        this.BannerPictureFileName = BannerPictureFileName;
        this.Guid = Guid;
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.SiteId = SiteId;
        this.StatusId = StatusId;
        this.AttachmentId = AttachmentId;
        this.Version = Version;
        this.CreateUserId = CreateUserId;
        this.UpdateUserId = UpdateUserId;
        this.UpdateDate = UpdateDate;
    }

    public int MainCategoryId;
    public int CategoryId;
    public int SubCategoryId;
    public int SubSubCategoryId;


}
