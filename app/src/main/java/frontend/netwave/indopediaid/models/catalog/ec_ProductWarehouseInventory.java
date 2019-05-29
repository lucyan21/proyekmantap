package frontend.netwave.indopediaid.models.catalog;

public class ec_ProductWarehouseInventory extends BaseDocument {
        public int ec_ProductId;

        public int ec_WarehouseId;

        public int StockQuantity;

        public int ReservedQuantity;

        public ec_Product ec_Product;

        public ec_Warehouse ec_Warehouse;
    }
