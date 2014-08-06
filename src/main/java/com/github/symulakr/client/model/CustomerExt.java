package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;
import com.github.symulakr.gwt.generators.client.celltable.annotation.ColumnActions;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Table;
import com.github.symulakr.gwt.generators.client.celltable.annotation.TableResources;

@Table(CustomCellTable.class)
@TableResources(CellTableRes.class)
public class CustomerExt extends Customer implements CellTableModel
{

   @Column(header = "Number")
   @ColumnActions(position = 0)
   public int getPhoneNumber()
   {
      return 55;
   }

}
