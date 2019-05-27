package com.netwave.indopediaid.viewmodels.catalog;
import com.netwave.indopediaid.models.catalog.ec_ProductAttributeValue;

import java.util.*;

public class ProductAttributeValueListPageModel{

        private String _header = "";

        private String _footer = "";

        public String Header;

        public String Footer;
        public ProductAttributeValueListPageModel() {        }

        public String Heading;

        public List<ec_ProductAttributeValue> ProductAttributeValues;

        public String ProductAttributeName;
        public int ProductAttributeId;

        //public PaginationSettings Paging;

        private boolean useModals = false;

        public boolean UseModals;

        /*public static ec_ProductAttribute GetProductAttribute(
            ProductAttributeService<ec_ProductAttribute, IProductAttributeRepository <ec_ProductAttribute>> productattributeService,
            UUID productAttributeGuid)
        {
            ec_ProductAttribute prodAtt = null;
            if(productattributeService!=null)
            {
                prodAtt = productattributeService.GetDocumentByGuid(productAttributeGuid);
            }

            return prodAtt;
        }*/
}
