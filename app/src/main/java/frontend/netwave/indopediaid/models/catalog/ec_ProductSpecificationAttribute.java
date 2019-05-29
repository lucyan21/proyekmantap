package frontend.netwave.indopediaid.models.catalog;

public class ec_ProductSpecificationAttribute {
        public int Id;

        public int ProductId;

        public int AttributeTypeId;

        public int SpecificationAttributeOptionId;
        public String CustomValue;

        public boolean AllowFiltering;

        public boolean ShowOnProductPage;

        public int DisplayOrder;

        public static ec_Product ec_Product;
    }
