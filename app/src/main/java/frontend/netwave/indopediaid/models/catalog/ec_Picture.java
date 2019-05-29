package frontend.netwave.indopediaid.models.catalog;

import java.util.Collection;
import java.util.HashSet;

public class ec_Picture extends BaseDocument {
        public ec_Picture()
        {
            ProductPictures = new HashSet<>();
        }

        public byte[] PictureBinary;
        public String MimeType;
        public String SeoFilename;

        public String AltAttribute;

        public String TitleAttribute;

        public boolean IsNew;

        public boolean IsAsProductPreview;
        public boolean IsAsProductThumbnail;
        public boolean IsAsFirstDisplayProductPreview;

        public Collection<ec_ProductPictureMapping> ProductPictures;
    }
