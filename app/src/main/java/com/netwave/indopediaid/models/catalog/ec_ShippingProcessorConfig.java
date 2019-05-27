package com.netwave.indopediaid.models.catalog;

    public class ec_ShippingProcessorConfig extends BaseDocument {
        int _id = 0;
        public int Id;

        public int ShippingMethodId;

        public int ProcessorId;

        public enum ShippingMethod
        {
            //POS = 1,
            //TIKI = 2,
            //JNI = 3
        }

        public enum ShippingProcessor
        {
            //None = 0,
            //InternalAPI = 1,
            //ServiceProviderAPI = 2
        }
    }
