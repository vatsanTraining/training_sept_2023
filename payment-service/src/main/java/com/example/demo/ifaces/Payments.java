package com.example.demo.ifaces;

import java.util.*;

import com.example.demo.model.Customer;
public interface Payments {

	Map<String,List<Customer>> getPayments();
}
