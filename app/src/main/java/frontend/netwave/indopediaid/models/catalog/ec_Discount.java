package frontend.netwave.indopediaid.models.catalog;

import java.util.Date;

public class ec_Discount extends BaseDocument {

        public int DiscountTypeId;
        
        public boolean UsePercentage;
        
        public float DiscountPercentage;
        
        public float DiscountAmount;
        
        public float MaximumDiscountAmount;
        
        public Date StartDateUtc;
        
        public Date EndDateUtc;
        
        public boolean RequiresCouponCode;
        public String CouponCode;
        
        public int DiscountLimitationId;
        
        public int LimitationTimes;
        
        public int MaximumDiscountedQuantity;
        
        public boolean AppliedToSubCategories;

        }
