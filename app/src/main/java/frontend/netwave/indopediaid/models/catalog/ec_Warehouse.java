package frontend.netwave.indopediaid.models.catalog;

import java.util.Collection;
import java.util.HashSet;

public class ec_Warehouse extends BaseDocument {
        public ec_Warehouse()
        {
            ProductWarehouseInventories = new HashSet<>();
        }

        public String AdminComment;

        public int AddressId;

        public static Collection<ec_ProductWarehouseInventory> ProductWarehouseInventories;
    }
