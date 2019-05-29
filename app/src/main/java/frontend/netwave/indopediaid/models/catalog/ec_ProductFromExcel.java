package frontend.netwave.indopediaid.models.catalog;

import java.util.Date;

public class ec_ProductFromExcel {
        public String Name;
        public String Description;
        public String FullDescription;
        public String Sku;
        public String AttachmentId;
        public String InfoInsurance;
        public boolean AllowCustomerReviews;
        public boolean IsShipEnabled;
        public boolean IsFreeShipping;
        public int StockQuantity;
        public boolean DisplayStockAvailability;
        public boolean DisplayStockQuantity;
        public int MinStockQuantity;
        public int OrderMinimumQuantity;
        public int OrderMaximumQuantity;
        public String AllowedQuantities;
        public boolean DisableBuyButton;
        public boolean DisableWishlistButton;
        public double Price;
        public double OldPrice;
        public boolean MarkAsNew;
        //public DateTime MarkAsNewStartDateTimeUtc;
        //public DateTime MarkAsNewEndDateTimeUtc;
        public String MarkAsNewStartDateTimeUtc; /*05NOV18-1*/
        public String MarkAsNewEndDateTimeUtc; /*05NOV18-1*/
        public boolean HasDiscountsApplied;
        public double Weight;
        public double Length;
        public double Width;
        public double Height;
        //public DateTime AvailableStartDateTimeUtc;
        //public DateTime AvailableEndDateTimeUtc;

        public String AvailableStartDateTimeUtc; /*18OKT18-1*/
        public String AvailableEndDateTimeUtc; /*18OKT18-1*/
        public int DisplayOrder;
        public boolean Published;
        public boolean IsJualCepat;
        public Date JualCepatStartDate;
        public Date JualCepatEndDate;
        public int MerchantId;
        public String MerchantName;
        public int CategoryId;
        public String CategoryName;
        public int ManufactureId;
        public String ManufactureName;
        public int WarehouseId;
        public String WarehouseName;
        public int SupplierId;
        public String SupplierName;

    }
