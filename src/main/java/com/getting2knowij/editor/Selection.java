package com.getting2knowij.editor;

@SuppressWarnings("unused")
public class Selection {
  public static void printCustomerDetails() {
    Customer customer = new Customer(6365, "customer");
    System.out.println(printableDetails(customer));
  }

  private static String printableDetails(Customer customer) {
    return "{" +
        "id=" + customer.getId() +
        ", name='" + customer.getName() + '\'' +
        "}";
  }
}
