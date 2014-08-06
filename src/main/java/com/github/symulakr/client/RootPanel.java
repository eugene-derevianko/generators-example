package com.github.symulakr.client;

import com.github.symulakr.client.model.Customer;
import com.github.symulakr.client.model.CustomerExt;
import com.github.symulakr.client.model.CustomerExtExt;
import com.github.symulakr.client.model.CustomerProvider;
import com.github.symulakr.client.model.User;
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
   SimplePanel panel1;
   @UiField
   SimplePanel panel2;
   @UiField
   SimplePanel panel3;

   private CellTable<Customer> table1 = GWT.create(Customer.class);
   private CellTable<CustomerExt> table2 = GWT.create(CustomerExt.class);
   private CellTable<CustomerExt> table3 = GWT.create(CustomerExtExt.class);
   CellTable<User> userCellTable = GWT.create(User.class);


   public RootPanel()
   {
      initWidget(ourUiBinder.createAndBindUi(this));
      CustomerProvider customerProvider = new CustomerProvider();
//      userCellTable.setRowData(customerProvider.getUserss(5));
      table1.setRowData(customerProvider.getCustomers(5));
      panel1.setWidget(table1);

      table2.setRowData(customerProvider.getCustomersExt(5));
      panel2.setWidget(table2);

      panel3.setWidget(table3);
   }
}
