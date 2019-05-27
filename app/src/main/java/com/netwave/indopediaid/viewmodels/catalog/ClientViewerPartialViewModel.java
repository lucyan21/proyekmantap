package com.netwave.indopediaid.viewmodels.catalog;

import java.util.UUID;

public class ClientViewerPartialViewModel
    {
        //#region Field
        private UUID siteGuid;
                private String documentType = "";
        private int documentId = 0;
        private int periodValue = 0;
        private int periodType = 0;
        //#endregion

        //#region Property
        public int DocumentId;
        //#endregion

        //#region Constructor
        /**public ClientViewerPartialViewModel(
            UUID _siteGuid,
            ClientViewerService<ec_ClientViewer, IClientViewerRepository<ec_ClientViewer>> _clientViewerService,
            int _documentId,
            String _documentType,
            int _periodType,
            int _periodValue)
        {
            siteGuid = _siteGuid;
            documentType = _documentType;
            documentId = _documentId;
            clientViewerService = _clientViewerService;
            periodType = _periodType;
            periodValue = _periodValue;
        }
        //#endregion

        //#region Method

        public int GetTotalClientViewer()
        {
            if (periodValue != 0)
            {
                return clientViewerService.CountClientViewerByDocumentTypePerPeriode(siteGuid, documentType, periodType, periodValue);
            }
            else
            {
                return clientViewerService.CountClientViewerByDocumentTypePerPeriode(siteGuid, documentType);
            }
        }

        public int GetTotalClientViewerByDocumentId(boolean usePeriod = true)
        {
            if (usePeriod)
            {
                if (periodValue != 0 && documentId != 0)
                {
                    return clientViewerService.CountClientViewerByDocumentIdPerPeriode(siteGuid, documentType, documentId, periodType, periodValue);
                }
            }
            else
            {
                return clientViewerService.CountClientViewerByDocumentId(siteGuid, documentType, documentId);
            }   
            return 0;
        }*/

        //#endregion
    }
