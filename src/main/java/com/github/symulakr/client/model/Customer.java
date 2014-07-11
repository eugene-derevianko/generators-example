package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.annotation.celltable.Column;
import com.github.symulakr.gwt.generators.annotation.celltable.TableResources;
import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.google.gwt.cell.client.SafeHtmlCell;
import com.google.gwt.safehtml.shared.SafeHtml;

@TableResources(CellTableRes.class)
public class Customer implements CellTableModel
{

   private String firstName;
   private String lastName;
   private SafeHtml email;
   private String phoneNumber;

   @Column(header = "First Name")
   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   @Column(header = "Last Name", index = 1)
   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   @Column(cellType = SafeHtmlCell.class, index = -33)
   public SafeHtml getEmail()
   {
      return email;
   }

   public void setEmail(SafeHtml email)
   {
      this.email = email;
   }

   @Column(header = "Number" , index = 0)
   public String getPhoneNumber()
   {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }
}
