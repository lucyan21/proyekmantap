package frontend.netwave.indopediaid.models.catalog;

public class ec_PredefinedProductAttributeValue {
        public int Id;
        public int ProductAttributeId;
        public String Name;

        public double PriceAdjustment;

        public double WeightAdjustment;

        public double Cost;

        public boolean IsPreSelected;

        public int DisplayOrder;

        public static ec_ProductAttribute ec_ProductAttribute;
    }
