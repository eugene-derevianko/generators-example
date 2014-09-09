package com.github.symulakr.client.model;


import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Table;
import com.github.symulakr.gwt.generators.client.celltable.annotation.TableResources;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;

@Table(CustomCellTable.class)
@TableResources(CellTableRes.class)
public class CustomerExt extends Customer implements CellTableModel
{


   @Override
   @Column(header = "First Name", footer = "Footer")
//   @ColumnActions(position = 1)
   public String getFirstName()
   {
      return super.getFirstName();
   }

   @Column(header = "Long")
   public Long oneMoreColumn()
   {
      return null;
   }

   @Column(header = "byte")
   public byte oneMoreColen()
   {
      return 8;
   }

   @Column(header = "SafeHtml", cellType = CustomSafeHtmlCell.class)
   public SafeHtml html()
   {
      return SafeHtmlUtils.EMPTY_SAFE_HTML;
   }

}
