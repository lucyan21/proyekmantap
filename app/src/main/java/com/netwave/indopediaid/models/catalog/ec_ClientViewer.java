package com.netwave.indopediaid.models.catalog;

public class ec_ClientViewer extends BaseDocument {
        //#region Private field
        private String _documentType = "";
        private int _documentId = -1;
        private String _clientIp = "0.0.0.0";
        private String _pageAccessed = "";
        private String _sessionId = "";
        //#endregion
        public ec_ClientViewer()
        {
        
        }
        
        public String DocumentType;
        public int DocumentId;
        public String ClientIP;
        
        public String SessionId;
        public String PageAccessed;
        }
