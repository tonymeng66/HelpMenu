package com.example.tony.testwebview.helper;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tony.testwebview.R;

import java.util.List;

public class XmicListItemAdapter extends ArrayAdapter<ListItem>
{
  private Context mContext;
  private List<ListItem> items;

  public XmicListItemAdapter(Context paramContext, int paramInt, List<ListItem> paramList)
  {
    super(paramContext, paramInt, paramList);
    this.mContext = paramContext;
    this.items = paramList;
  }

  public int getCount()
  {
    if ((this.items != null) && (this.items.size() != 0))
      return this.items.size();
    return 0;
  }

  public ListItem getItem(int paramInt)
  {
    return (ListItem)this.items.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ViewHolder localViewHolder = null;
    if (paramView == null){
      LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
      paramView = inflater.inflate(R.layout.list_item,paramViewGroup,false);
    }
//    while (true)
//    {
      localViewHolder.item.setText((items.get(paramInt)).getName());
      return paramView;

//      localViewHolder = (ViewHolder)paramView.getTag();
//    }
  }

  public void setItems(List<ListItem> paramList)
  {
    this.items = paramList;
  }

  class ViewHolder
  {
    private TextView item;

    ViewHolder()
    {
    }
  }
}

/* Location:           D:\apk\ebony2K15_tecent5507_Help_pack_classes_dex2jar.jar
 * Qualified Name:     com.tpv.xmic.help.ebony2k15.helper.XmicListItemAdapter
 * JD-Core Version:    0.6.0
 */