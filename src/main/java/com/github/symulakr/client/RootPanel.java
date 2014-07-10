package com.github.symulakr.client;

import java.util.List;

import com.github.symulakr.client.model.Customer;
import com.github.symulakr.client.model.CustomerProvider;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class RootPanel extends Composite
{
   interface RootPanelUiBinder extends UiBinder<HTMLPanel, RootPanel>
   {
   }

   private static RootPanelUiBinder ourUiBinder = GWT.create(RootPanelUiBinder.class);
   @UiField
   SimplePanel panel;

   private CellTable<Customer> table = GWT.create(Customer.class);

   public RootPanel()
   {
      initWidget(ourUiBinder.createAndBindUi(this));
      List<Customer> customers = new CustomerProvider().getCustomers(20);
      table.setRowData(customers);
      panel.setWidget(table);
   }
}
