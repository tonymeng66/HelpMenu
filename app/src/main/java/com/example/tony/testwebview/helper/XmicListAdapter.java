package com.example.tony.testwebview.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tony.testwebview.R;

import java.util.List;

public class XmicListAdapter extends ArrayAdapter<HelpList>
{
  private static int selectedPos = -1;
  private Context context;
  private List<HelpList> items;
  private int layout;

  public XmicListAdapter(Context paramContext, int paramInt, List<HelpList> paramList)
  {
    super(paramContext, paramInt, paramList);
    this.context = paramContext;
    this.items = paramList;
  }

  public int getCount()
  {
    if ((this.items != null) && (this.items.size() != 0))
      return this.items.size();
    return 0;
  }

  public HelpList getItem(int paramInt)
  {
    return (HelpList)this.items.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    viewHolder localviewHolder = null;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.context).inflate(R.layout.activity_main, null);
      localviewHolder = new viewHolder();
      //localviewHolder.item = ((TextView)paramView.findViewById(2131165281));
      paramView.setTag(localviewHolder);
    }
//    while (true)
//    {
//      localviewHolder.item.setText(((HelpList)this.items.get(paramInt)).getIndexName());
        localviewHolder.item.setText("test");
      return paramView;
//      localviewHolder = (viewHolder)paramView.getTag();
//    }
  }

  public void setItems(List<HelpList> paramList)
  {
    this.items = paramList;
  }

  public void setSelectedPosition(int paramInt)
  {
    selectedPos = paramInt;
  }

  static class viewHolder
  {
    private TextView item;
  }
}

/* Location:           D:\apk\ebony2K15_tecent5507_Help_pack_classes_dex2jar.jar
 * Qualified Name:     com.tpv.xmic.help.ebony2k15.helper.XmicListAdapter
 * JD-Core Version:    0.6.0
 */