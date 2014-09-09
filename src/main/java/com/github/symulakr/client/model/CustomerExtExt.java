package com.github.symulakr.client.model;


import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;


public class CustomerExtExt extends CustomerExt
{


   @Override
   @Column(header = "Number")
   //   @ColumnActions(position = 1)
   public int getPhoneNumber()
   {
      return 55;
   }


}
