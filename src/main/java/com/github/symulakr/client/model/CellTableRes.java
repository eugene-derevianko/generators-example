package com.github.symulakr.client.model;

import com.google.gwt.user.cellview.client.CellTable;

public interface CellTableRes extends CellTable.Resources
{

   public interface CellTableCss extends CellTable.Style
   {

   }

   @Source({CellTable.Style.DEFAULT_CSS, "com/github/symulakr/css/cell-table.css"})
   CellTableCss cellTableStyle();

}
