package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.*;

import java.util.Collection;

public class CategoryTemplateModel extends BaseDocument {
        public int DisplayOrder;

        public static Collection<ec_Category> ec_Category;

        public static CategoryTemplateModel ModelFronProductTag(ec_CategoryTemplate iProductTag)
        {
            CategoryTemplateModel model = new CategoryTemplateModel();

            model.Guid = iProductTag.Guid;
            model.Id = iProductTag.Id;
            model.Name = iProductTag.Name;
            model.Description = iProductTag.Description;
            model.SiteId = iProductTag.SiteId;
            model.StatusId = iProductTag.StatusId;
            model.TemplateId = iProductTag.TemplateId;
            model.AttachmentId = iProductTag.AttachmentId;
            model.Deleted = iProductTag.Deleted;
            model.Version = iProductTag.Version;
            model.CreateUserId = iProductTag.CreateUserId;
            model.CreateDate = iProductTag.CreateDate;
            model.UpdateUserId = iProductTag.UpdateUserId;
            model.UpdateDate = iProductTag.UpdateDate;

            return model;
        }
    }
