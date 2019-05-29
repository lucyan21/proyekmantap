package frontend.netwave.indopediaid.models.catalog;

import java.util.UUID;

public class ProductAttributeData
    {
        public String Attribute;
        public int AttributeValueTypeId;
        public String Value;
        public String ColorSquaresRgb;
        public float PriceAdjustment;
        public float WeightAdjustment;
        public float Cost;
        public int Quantity;
        public int AssociatedProductId;

        public int ProductId;
        public int ProductAttributeId;
        public int ProductAttributeValueId;
        public UUID ProductAttributeGuid;

    }
