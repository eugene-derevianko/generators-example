package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;
import com.github.symulakr.gwt.generators.client.celltable.annotation.ColumnActions;
import com.google.gwt.cell.client.ClickableTextCell;

public class CustomerExtExt extends CustomerExt implements CellTableModel
{

   @Column(header = "First Name", cellType = ClickableTextCell.class)
   @ColumnActions(position = 0)
   public String getFirstName()
   {
      return super.getFirstName();
   }

   @Column(header = "Column 5")
   @ColumnActions(position = 1)
   public String get5()
   {
      return super.getFirstName();
   }

}
