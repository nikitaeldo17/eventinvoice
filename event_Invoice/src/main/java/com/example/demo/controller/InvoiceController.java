package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Invoice;
import com.example.demo.service.InvoiceService;
@RestController

public class InvoiceController {
	@Autowired
	 InvoiceService invoiceService;
	
	@GetMapping("/invoice/{id}")
	public Invoice getInvoice(@PathVariable String id)
	{
		Invoice in=invoiceService.findInvoiceById(id);
		return in;
	}
	
	@PostMapping("/invoice")
	public Invoice generateInvoice(@RequestBody Invoice in) 
	{
        invoiceService.showInvoice(in);
         return in;
    }
	

	

}
