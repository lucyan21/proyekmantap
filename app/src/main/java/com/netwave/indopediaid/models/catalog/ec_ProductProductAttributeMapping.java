package com.netwave.indopediaid.models.catalog;

public class ec_ProductProductAttributeMapping extends BaseDocument {
        public ec_ProductProductAttributeMapping()
        {
           
        }

        public int ec_ProductId;
        public ec_Product ec_Product;

        public int ec_ProductAttributeId;

        public int ec_ProductAttributeValueId;

        public ec_ProductAttribute ec_ProductAttribute;

        public String TextPrompt;

        public boolean IsRequired;

        public int AttributeControlTypeId;

        public int DisplayOrder;

        public int ValidationMinLength;

        public int ValidationMaxLength;

        public String ValidationFileAllowedExtensions;

        public int ValidationFileMaximumSize;

        public String DefaultValue;

        public String ConditionAttributeXml;

    }
