package com.netwave.indopediaid.models.catalog;

import java.util.Collection;
import java.util.HashSet;

public class ec_CategoryTemplate extends BaseDocument {
    public ec_CategoryTemplate()
            {
            ec_Category = new HashSet<>();
            }
            public String ViewPath;

            public int DisplayOrder;

            public Collection<ec_Category> ec_Category;
            }