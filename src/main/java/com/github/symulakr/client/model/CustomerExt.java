package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.annotation.celltable.Column;
import com.github.symulakr.gwt.generators.annotation.celltable.Table;

@Table(parameterisingType = Customer.class)
public class CustomerExt extends Customer
{


   @Override
   @Column(header = "First Nameeee")
   public String getFirstName()
   {
      return super.getFirstName();
   }

   @Override
   public String getPhoneNumber()
   {
      return super.getPhoneNumber();
   }

}
