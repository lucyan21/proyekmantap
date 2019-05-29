package frontend.netwave.indopediaid.viewmodels.catalog;

import frontend.netwave.indopediaid.models.catalog.ec_ShippingProcessorConfig;

import java.util.List;

public class ShippingProcessorModel {
    public ec_ShippingProcessorConfig.ShippingMethod ShippingMethod;

    public ec_ShippingProcessorConfig.ShippingProcessor ShippingProcessor;


    public class ShippingProcessorConfigModel {
        public List<ShippingProcessorModel> ShippingProcessors;

        //public List<KeyValuePair<ec_ShippingProcessorConfig.ShippingProcessor, String>> ShippingProcessorList;
    }
}