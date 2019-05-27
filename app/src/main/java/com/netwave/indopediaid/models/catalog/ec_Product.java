package com.netwave.indopediaid.models.catalog;

import java.util.*;
import java.util.Collection;

public class ec_Product extends BaseDocument {

        public ec_Product()
        {
            ProductPictures = new HashSet<>();
            ProductAttributeCombinations = new HashSet<>();
            ProductProductAttributes = new HashSet<>();
            ProductCategories = new HashSet<>();
            ProductManufacturers = new HashSet<>();
            ProductReviews = new HashSet<>();
            ProductWarehouseInventories = new HashSet<>();
            ProductTags = new HashSet<>();

        }

        public static Collection<ec_ProductPictureMapping> ProductPictures;
        public static Collection<ec_ProductAttributeCombination> ProductAttributeCombinations;
        public static Collection<ec_ProductProductAttributeMapping> ProductProductAttributes;
        public static Collection<ec_ProductCategoryMapping> ProductCategories;
        public static Collection<ec_ProductManufacturerMapping> ProductManufacturers;
        public static Collection<ec_ProductReview> ProductReviews;
        public static Collection<ec_ProductWarehouseInventory> ProductWarehouseInventories;
        public static Collection<ec_ProductTag> ProductTags;

        public int ProductTypeId;

        public int ParentGroupedProductId;

        public boolean VisibleIndividually;

        public String FullDescription;

        public String InfoInsurance;

        public String AdminComment;

        public int ProductTemplateId;

        public int VendorId;

        public boolean ShowOnHomePage;
        public String MetaKeywords;

        public String MetaDescription;
        public String MetaTitle;

        public boolean AllowCustomerReviews;

        public int ApprovedRatingSum;

        public int NotApprovedRatingSum;

        public int ApprovedTotalReviews;

        public int NotApprovedTotalReviews;

        public boolean SubjectToAcl;

        public boolean LimitedToStores;
        public String ManufacturerPartNumber;
        public String Gtin;
        public String Sku;

        public boolean IsGiftCard;

        public int GiftCardTypeId;

        public double OverriddenGiftCardAmount;

        public boolean RequireOtherProducts;
        public String RequiredProductIds;

        public boolean AutomaticallyAddRequiredProducts;

        public boolean IsDownload;

        public int DownloadId;

        public boolean UnlimitedDownloads;

        public int MaxNumberOfDownloads;

        public int DownloadExpirationDays;

        public int DownloadActivationTypeId;

        public boolean HasSampleDownload;

        public int SampleDownloadId;

        public boolean HasUserAgreement;

        public String UserAgreementText;

        public boolean IsRecurring;

        public int RecurringCycleLength;

        public int RecurringCyclePeriodId;

        public int RecurringTotalCycles;

        public boolean IsRental;

        public int RentalPriceLength;

        public int RentalPricePeriodId;

        public boolean IsShipEnabled;

        public boolean IsFreeShipping;

        public boolean ShipSeparately;

        public double AdditionalShippingCharge;

        public int DeliveryDateId;

        public boolean IsTaxExempt;

        public int TaxCategoryId;

        public boolean IsTelecommunicationsOrBroadcastingOrElectronicServices;

        public int ManageInventoryMethodId;

        public boolean UseMultipleWarehouses;

        public int RelatedProductIds;

        public int WarehouseId;

        public int StockQuantity;

        public boolean DisplayStockAvailability;

        public boolean DisplayStockQuantity;

        public int MinStockQuantity;

        public int LowStockActivityId;

        public int NotifyAdminForQuantityBelow;

        public int BackorderModeId;

        public boolean AllowBackInStockSubscriptions;

        public int OrderMinimumQuantity;

        public int OrderMaximumQuantity;
        public String AllowedQuantities;

        public boolean AllowAddingOnlyExistingAttributeCombinations;

        public boolean DisableBuyButton;

        public boolean DisableWishlistButton;

        public boolean AvailableForPreOrder;

        public Date PreOrderAvailabilityStartDateTimeUtc;

        public boolean CallForPrice;

        public boolean CallForShippingCost;

        public int DisplayGroupId;

        public double Price;

        public double OldPrice;

        public double ProductCost;

        public double SpecialPrice;

        public double VoucherAmount;

        public Date SpecialPriceStartDateTimeUtc;

        public Date SpecialPriceEndDateTimeUtc;

        public boolean CustomerEntersPrice;

        public double MinimumCustomerEnteredPrice;

        public double MaximumCustomerEnteredPrice;

        public boolean BasepriceEnabled;

        public double BasepriceAmount;

        public int BasepriceUnitId;

        public double BasepriceBaseAmount;

        public int BasepriceBaseUnitId;

        public boolean MarkAsNew;

        public Date MarkAsNewStartDateTimeUtc;

        public Date MarkAsNewEndDateTimeUtc;

        public boolean HasTierPrices;

        public boolean HasDiscountsApplied;

        public double Weight;

        public double Length;

        public double Width;

        public double Height;

        public Date AvailableStartDateTimeUtc;

        public Date AvailableEndDateTimeUtc;

        public int DisplayOrder;

        public boolean Published;

        public boolean IsJualCepat;
        public Date JualCepatStartDate;
        public Date JualCepatEndDate;

        public int SearchCounter;

    }
