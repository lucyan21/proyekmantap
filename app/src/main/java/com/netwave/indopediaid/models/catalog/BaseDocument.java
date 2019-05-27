package com.netwave.indopediaid.models.catalog;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.UUID;

    // This project can output the Class library as a NuGet Package.
    // To enable this option, right-click on the project and select the Properties menu item. In the Build tab select "Produce outputs on build".
public abstract class BaseDocument {
        int _id = -1;
        public UUID Guid;
        public static int Id;
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
        public String ViewPath;
    }
