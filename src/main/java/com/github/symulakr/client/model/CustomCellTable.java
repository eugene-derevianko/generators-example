package com.github.symulakr.client.model;

import java.util.Comparator;
import java.util.List;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.view.client.ListDataProvider;

public abstract class CustomCellTable<M> extends CellTable<M>
{
   protected ListDataProvider<M> dataProvider = new ListDataProvider<M>();

   public void setDataOnTable(List<? extends M> values)
   {
      getData().clear();
      addRowData(values);
   }

   public void addRowData(List<? extends M> values)
   {
      getData().addAll(values);
      refreshVisibleRange();
   }

   public void addRowData(M values)
   {
      getData().add(values);
      refreshVisibleRange();
   }

   private void refreshVisibleRange()
   {
      int size = getData().size();
      setRowCount(size);
      setVisibleRange(0, size);
   }

   public List<M> getData()
   {
      return dataProvider.getList();
   }

   protected CustomCellTable(int pageSize, Resources resources)
   {
      super(pageSize, resources);
      dataProvider.addDataDisplay(this);
   }





   protected ListHandler<M> createColumnSortHandler(Column<M, ?> column, Comparator<M> comparator)
   {
      ListHandler<M> columnSortHandler = new ListHandler<M>(dataProvider.getList());
      columnSortHandler.setComparator(column, comparator);
      return columnSortHandler;
   }
}
