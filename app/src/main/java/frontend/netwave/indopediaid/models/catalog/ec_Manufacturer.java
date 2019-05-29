package frontend.netwave.indopediaid.models.catalog;

import java.util.Collection;
import java.util.HashSet;

public class ec_Manufacturer extends BaseDocument {
        public ec_Manufacturer()
        {
            ProductManufacturers = new HashSet<>();
        }

        public int ManufacturerTemplateId;
        public String MetaKeywords;
        public String MetaDescription;
        public String MetaTitle;
        public int PictureId;
        public int PageSize;
        public boolean AllowCustomersToSelectPageSize;
        public String PageSizeOptions;
        public String PriceRanges;
        public boolean SubjectToAcl;
        public boolean LimitedToStores;
        public boolean Published;
        public int DisplayOrder;
        public int UserId;
        public static Collection<ec_ProductManufacturerMapping> ProductManufacturers;
    }
