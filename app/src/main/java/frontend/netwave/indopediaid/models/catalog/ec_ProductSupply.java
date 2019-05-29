package frontend.netwave.indopediaid.models.catalog;

import java.util.Date;

public class ec_ProductSupply extends BaseDocument {
        public int ec_ProductId;

        public int ec_SupplierId;

        public int ec_WarehouseId;

        public Date SupplyDatetime;

        public int SupplyQuantity;

        public String StockId;
    }
