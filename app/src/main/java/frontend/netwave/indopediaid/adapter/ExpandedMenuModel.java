package frontend.netwave.indopediaid.adapter;

public class ExpandedMenuModel {

    public String menuName, url;
    public boolean hasChildren, isGroup;

    public ExpandedMenuModel(String menuName, boolean isGroup, boolean hasChildren, String url) {

        this.menuName = menuName;
        this.url = url;
        this.isGroup = isGroup;
        this.hasChildren = hasChildren;
    }
}