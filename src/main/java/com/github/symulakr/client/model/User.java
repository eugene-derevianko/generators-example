package com.github.symulakr.client.model;

import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;

public class User implements CellTableModel
{

   private String firstName;
   private String lastName;
   private String email;

   @Column(header = "First Name")
   public String getFirstName(){



      return firstName;
   }

   @Column(header = "Last Name")
   public String getLastName(){
      return lastName;
   }

   @Column(header = "Email")
   public String getEmail(){
      return email;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }
}
