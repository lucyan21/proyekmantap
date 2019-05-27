package com.netwave.indopediaid.models.catalog;

import java.util.Date;

public class ec_OrderProduct extends BaseDocument {
        public ec_OrderProduct()
        {
        }

        public int ec_ShipperPackageId;

        public int ec_CustomerId;

        public int ec_MerchantId;

        public int ec_CustomerAddressBillingId;

        public int ec_PaymentMethodId;

        public int ec_CustomerAddressShippingId;

        public boolean PickUpInStore;

        public int OrderStatusId;

        public int ShippingStatusId;

        public int PaymentStatusId;

        public String PaymentMethodSystemName;

        public String CustomerCurrencyCode;

        public float CurrencyRate;

        public int CustomerTaxDisplayTypeId;

        public String VatNumber;

        public float OrderSubtotalInclTax;

        public float OrderSubtotalExclTax;

        public float OrderSubTotalDiscountInclTax;

        public float OrderSubTotalDiscountExclTax;

        public float OrderShippingInclTax;

        public float OrderShippingExclTax;

        public float PaymentMethodAdditionalFeeInclTax;

        public float PaymentMethodAdditionalFeeExclTax;

        public String TaxRates;

        public float OrderTax;

        public float OrderDiscount;

        public float OrderTotal;

        public float RefundedAmount;

        public boolean RewardPointsWereAdded;

        public String CheckoutAttributeDescription;

        public String CheckoutAttributesXml;

        public int CustomerLanguageId;

        public String ec_AffiliateId;

        public String CustomerIp;

        public boolean AllowStoringCreditCardNumber;

        public String CardType;

        public String CardName;

        public String CardNumber;

        public String MaskedCreditCardNumber;

        public String CardCvv2;

        public String CardExpirationMonth;

        public String CardExpirationYear;

        public String AuthorizationTransactionId;

        public String AuthorizationTransactionCode;

        public String AuthorizationTransactionResult;

        public String CaptureTransactionId;

        public String CaptureTransactionResult;

        public String SubscriptionTransactionId;

        public Date PaidDateUtc;

        public String ShippingMethod;

        public String ShippingRateComputationMethodSystemName;

        public String CustomValuesXml;

        //public Merchant.Models.Merchant ec_Merchant;

    }
