package com.thangnq.eco.global;

import java.util.ArrayList;
import java.util.List;

import com.thangnq.eco.entity.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}
}
