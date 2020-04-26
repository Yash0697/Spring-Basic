package com.product.product.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.product.product.Entity.Product;

@Controller
public class ProductController {

	static ArrayList<Product> products = new ArrayList<Product>();
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView showProducts(Model m){
		/*products.add(new Product(1, "IPhoneX", 90000));
		products.add(new Product(2, "LG TV", 22000));
		products.add(new Product(3, "HP Laptop", 35000));
		products.add(new Product(4, "Fanta", 80));*/
		 ModelAndView map = new ModelAndView("Products");
		    map.addObject("lists", products);
		    return map;
	}
	@RequestMapping(value = { "/showAddProduct" }, method = RequestMethod.GET)
	public String displayFormForProduct(){
		return "ProductForm";
	}
	@RequestMapping("/addProduct")
	public String addProduct(HttpServletRequest request){
		int pId = Integer.parseInt(request.getParameter("id"));
		String pName = request.getParameter("name");
		//System.out.println("-----------------------------------------------------------------"+pId+ " "+ pName);
		double pPrice = Double.parseDouble(request.getParameter("price"));
		Product prod = new Product(pId, pName, pPrice);
		products.add(prod);
		return "redirect:/";
	}
}
