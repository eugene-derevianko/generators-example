package com.github.symulakr.client.model;

import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.user.client.Window;

public class FieldUpdaterImpl implements FieldUpdater<Customer, String>
{
   @Override
   public void update(int index, Customer object, String value)
   {
      Window.alert(value);
   }
}
