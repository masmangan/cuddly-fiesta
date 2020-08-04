// Copyright (c) 2020, the REST Postal Code Repository project authors.  Please see
// the AUTHORS file for details. All rights reserved. Use of this source code
// is governed by a BSD-style license that can be found in the LICENSE file.

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@Controller
public class AddressController {

	/**
	 * 
	 */
	@Autowired
	PostalRepository quotes;

	/**
	 * 
	 * @param code
	 * @param model
	 * @return
	 */
	@GetMapping("/address/{code}")
	public String getRandomQuote(@PathVariable String code, Model model) {
		Address a = quotes.findByCode(code);
		model.addAttribute("address", a);
		return "addressDetails";
	}
}
