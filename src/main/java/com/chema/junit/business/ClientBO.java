package com.chema.junit.business;

import java.util.List;

import com.chema.junit.business.exception.DifferentCurrenciesException;
import com.chema.junit.model.Amount;
import com.chema.junit.model.Product;

public interface ClientBO {
	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;
}
