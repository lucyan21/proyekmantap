package frontend.netwave.indopediaid.viewmodels.catalog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import frontend.netwave.indopediaid.models.catalog.ec_Category;

import java.util.*;

//Result

public class CategoryModel {

    @SerializedName("items")
    @Expose
    private ArrayList<ec_Category> results = null;

    public ArrayList<ec_Category> getResults() {
        return results;
    }

    public void setResults(ArrayList<ec_Category> results) {
        this.results = results;
    }


    /**@SerializedName("CategoryTemplateId")
    @Expose
    public int categorytemplateid;

    @SerializedName("MetaKeywords")
    @Expose
    public String metakeywords;

    @SerializedName("MetaDescription")
    @Expose
    public String metadescription;

    @SerializedName("MetaTitle")
    @Expose
    public String metatitle;

    @SerializedName("ParentCategoryId")
    @Expose
    public int parentcategoryid;

    @SerializedName("PictureId")
    @Expose
    public int pictureid;

    @SerializedName("PageSize")
    @Expose
    public int pagesize;

    @SerializedName("AllowCustomersToSelectPageSize")
    @Expose
    public boolean allowcustomerstoselectpagesize;

    @SerializedName("PageSizeOptions")
    @Expose
    public String pagesizeoptions;

    @SerializedName("PriceRanges")
    @Expose
    public String priceranges;

    @SerializedName("ShowOnHomePage")
    @Expose
    public boolean showonhomepage;

    @SerializedName("IncludeInTopMenu")
    @Expose
    public boolean includeintopmenu;

    @SerializedName("SubjectToAcl")
    @Expose
    public boolean subjecttoacl;

    @SerializedName("LimitedToStores")
    @Expose
    public boolean limittostores;

    @SerializedName("Published")
    @Expose
    public boolean published;

    @SerializedName("DisplayOrder")
    @Expose
    public int display_order;

    @SerializedName("CategoryPictureList")
    @Expose
    public String categorypicturelist;

    @SerializedName("BannerPictureFileName")
    @Expose
    public String bannerpicturefilename;

    @SerializedName("Guid")
    @Expose
    public String guID;

    @SerializedName("Id")
    @Expose
    public int iD;

    @SerializedName("Name")
    @Expose
    public String nama;

    @SerializedName("Description")
    @Expose
    public String deskripsi;

    @SerializedName("SiteId")
    @Expose
    public String siteID;

    @SerializedName("StatusId")
    @Expose
    public String statusID;

    @SerializedName("TemplateId")
    @Expose
    public String templateID;

    @SerializedName("AttachmentId")
    @Expose
    public String attachmentID;

    @SerializedName("CreateUserId")
    @Expose
    public String createuserID;

    @SerializedName("CreateDate")
    @Expose
    public Date create_Date;

    @SerializedName("UpdateUserId")
    @Expose
    public String updateuserID;

    @SerializedName("UpdateDate")
    @Expose
    public Date updateDate;

    public int getCategoryTemplateId() {
        return categorytemplateid;
    }

    public void setCategoryTemplateId(int categoryTemplateId) {
        categoryTemplateId = categoryTemplateId;
    }

    public String getMetaKeywords() {
        return metakeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        metakeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metadescription;
    }

    public void setMetaDescription(String metaDescription) {
        metaDescription = metaDescription;
    }

    public String getMetaTitle() {
        return metatitle;
    }

    public void setMetaTitle(String metaTitle) {
        metatitle = metaTitle;
    }

    public int getParentCategoryId() {
        return parentcategoryid;
    }

    public void setParentCategoryId(int parentCategoryId) {
        parentCategoryId = parentCategoryId;
    }

    public int getPictureId() {
        return pictureid;
    }

    public void setPictureId(int pictureId) {
        pictureid = pictureId;
    }

    public int getPageSize() {
        return pagesize;
    }

    public void setPageSize(int pageSize) {
        pagesize = pageSize;
    }

    public void setAllowCustomersToSelectPageSize(boolean allowCustomersToSelectPageSize) {
        allowCustomersToSelectPageSize = allowCustomersToSelectPageSize;
    }

    public String getPageSizeOptions() {
        return pagesizeoptions;
    }

    public void setPageSizeOptions(String pageSizeOptions) {
        pagesizeoptions = pageSizeOptions;
    }

    public String getPriceRanges() {
        return priceranges;
    }

    public void setPriceRanges(String priceRanges) {
        priceranges = priceRanges;
    }

    public int getDisplayOrder() {
        return display_order;
    }

    public void setDisplayOrder(int displayOrder) {
        display_order = displayOrder;
    }

    public String getBannerPictureFileName() {
        return bannerpicturefilename;
    }

    public void setBannerPictureFileName(String bannerPictureFileName) {
        bannerpicturefilename = bannerPictureFileName;
    }

    public String getGuid() {
        return guID;
    }

    public void setGuid(String guid) {
        guID = guid;
    }

    public int getId() {
        return iD;
    }

    public void setId(int id) {
        iD = id;
    }

    public String getName() {
        return nama;
    }

    public void setName(String name) {
        nama = name;
    }

    public String getDescription() {
        return deskripsi;
    }

    public void setDescription(String description) {
        deskripsi = description;
    }

    public String getSiteId() {
        return siteID;
    }

    public void setSiteId(String siteId) {
        siteID = siteId;
    }

    public String getStatusId() {
        return statusID;
    }

    public void setStatusId(String statusId) {
        statusID = statusId;
    }

    public String getTemplateId() {
        return templateID;
    }

    public void setTemplateId(String templateId) {
        templateID = templateId;
    }

    public String getAttachmentId() {
        return attachmentID;
    }

    public void setAttachmentId(String attachmentId) {
        attachmentID = attachmentId;
    }

    public Date getCreateDate() {
        return create_Date;
    }

    public void setCreateDate(Date createDate) {
        create_Date = createDate;
    }

    public String getCreateUserId() {
        return createuserID;
    }

    public void setCreateUserId(String createUserId) {
        createuserID = createUserId;
    }

    public String getUpdateUserId() {
        return updateuserID;
    }

    public void setUpdateUserId(String updateUserId) {
        updateuserID = updateUserId;
    }



    public CategoryModel (int CategoryTemplateId, String MetaKeywords, String MetaDescription, String MetaTitle, int ParentCategoryId, int PictureId, int PageSize, boolean AllowCustomersToSelectPageSize,
                          String PageSizeOptions, String PriceRanges, boolean ShowOnHomePage, boolean IncludeInTopMenu, boolean SubjectToAcl, boolean LimitedToStores, boolean Published, int DisplayOrder,
                          String BannerPictureFileName, String Guid, int Id, String Name, String Description, String SiteId, String StatusId, String AttachmentId, int Version, String CreateUserId, String UpdateUserId,
                          Date UpdateDate){
        this.categorytemplateid = CategoryTemplateId;
        this.metakeywords = MetaKeywords;
        this.metadescription = MetaDescription;
        this.metatitle = MetaTitle;
        this.parentcategoryid = ParentCategoryId;
        this.pictureid = PictureId;
        this.pagesize = PageSize;
        this.allowcustomerstoselectpagesize = AllowCustomersToSelectPageSize;
        this.pagesizeoptions = PageSizeOptions;
        this.priceranges = PriceRanges;
        this.showonhomepage = ShowOnHomePage;
        this.includeintopmenu = IncludeInTopMenu;
        this.subjecttoacl = SubjectToAcl;
        this.limittostores = LimitedToStores;
        this.published = Published;
        this.display_order = DisplayOrder;
        this.bannerpicturefilename = BannerPictureFileName;
        this.guID = Guid;
        this.iD = Id;
        this.nama = Name;
        this.deskripsi = Description;
        this.siteID = SiteId;
        this.statusID = StatusId;
        this.attachmentID = AttachmentId;
        //this.Version = Version;
        this.createuserID = CreateUserId;
        this.updateuserID = UpdateUserId;
        this.updateDate = UpdateDate;
    }

    public int MainCategoryId;
    public int CategoryId;
    public int SubCategoryId;
    public int SubSubCategoryId;*/


}