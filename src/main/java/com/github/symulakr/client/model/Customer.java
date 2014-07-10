package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.annotation.celltable.Column;
import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.google.gwt.cell.client.SafeHtmlCell;
import com.google.gwt.safehtml.shared.SafeHtml;

public class Customer implements CellTableModel
{

   @Column
   private String firstName;

   @Column
   private String lastName;

   @Column (cellType = SafeHtmlCell.class)
   private SafeHtml email;

   @Column (header = "Number")
   private String phoneNumber;

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public SafeHtml getEmail()
   {
      return email;
   }

   public void setEmail(SafeHtml email)
   {
      this.email = email;
   }

   public String getPhoneNumber()
   {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }
}
