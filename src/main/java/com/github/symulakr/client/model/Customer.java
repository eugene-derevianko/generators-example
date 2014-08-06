package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;
import com.google.gwt.cell.client.ClickableTextCell;
import com.google.gwt.cell.client.SafeHtmlCell;
import com.google.gwt.safehtml.shared.SafeHtml;

public class Customer implements CellTableModel
{

   private String firstName;
   private String lastName;
   private SafeHtml email;
   private String phoneNumber;

   @Column(header = "First Name", cellType = ClickableTextCell.class)
//   @ColumnActions(position = 0, fieldUpdater = FieldUpdaterImpl.class)
   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   @Column(header = "Last Name", cellType = ClickableTextCell.class)
//   @ColumnActions(position = 1)
   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   @Column(header = "Number")
//   @ColumnActions(position = 3)
   public int getPhoneNumber()
   {
      return 55;
   }


   @Column(cellType = SafeHtmlCell.class)
//   @ColumnActions(position = 2)
   public SafeHtml getEmail()
   {
      return email;
   }

   public void setEmail(SafeHtml email)
   {
      this.email = email;
   }



   public void setPhoneNumber(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }
}
