package com.github.symulakr.client.model;


import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Table;
import com.github.symulakr.gwt.generators.client.celltable.annotation.TableResources;

@Table(CustomCellTable.class)
@TableResources(CellTableRes.class)
public class CustomerExt extends Customer
{


   @Override
   @Column(header = "First Name", position = 3)
   public String getFirstName()
   {
      return super.getFirstName();
   }

   @Column(header = "Number" , position = 0)
   public int getPhoneNumber()
   {
      return super.getPhoneNumber();
   }

}
