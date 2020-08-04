// Copyright (c) 2020, the REST Postal Code Repository project authors.  Please see
// the AUTHORS file for details. All rights reserved. Use of this source code
// is governed by a BSD-style license that can be found in the LICENSE file.

package com.example.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 * @see http://viacep.com.br
 */
@Repository
public class PostalRepository {

	/**
	 * 
	 */
	private static final Logger log = Logger.getLogger(ConsumingRestApplication.class.getName());

	/**
	 * 
	 */
	@Autowired
	RestTemplate restTemplate;

	/**
	 * 
	 * @return
	 */
	public Address findByCode(String code) {
		String serverUri = "http://viacep.com.br/ws/{code}/json/";
		Address address = restTemplate.getForObject(serverUri, Address.class, code);
		log.info(address.toString());
		return address;
	}
}
