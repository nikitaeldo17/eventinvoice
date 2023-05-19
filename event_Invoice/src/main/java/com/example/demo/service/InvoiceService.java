package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepository;
@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;

	
	
	public Invoice findInvoiceById(String invoice_id) 
	{
		Optional<Invoice> result = invoiceRepository.findById(invoice_id);
		Invoice invoice=result.get();
		return invoice;
	}
	
	

	public void showInvoice(Invoice in) 
	{
		
		invoiceRepository.save(in);
	}

}
