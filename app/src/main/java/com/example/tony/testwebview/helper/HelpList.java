package com.example.tony.testwebview.helper;

import java.util.List;

public class HelpList
{
  public String id;
  public String indexName;
  public List<ListItem> listItems;

  public String getId()
  {
    return this.id;
  }

  public String getIndexName()
  {
    return this.indexName;
  }

  public List<ListItem> getListItems()
  {
    return this.listItems;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setIndexName(String paramString)
  {
    this.indexName = paramString;
  }

  public void setListItems(List<ListItem> paramList)
  {
    if (this.listItems == null)
    {
      this.listItems = paramList;
      return;
    }
    this.listItems.addAll(paramList);
  }
}

/* Location:           D:\apk\ebony2K15_tecent5507_Help_pack_classes_dex2jar.jar
 * Qualified Name:     com.tpv.xmic.help.ebony2k15.helper.HelpList
 * JD-Core Version:    0.6.0
 */