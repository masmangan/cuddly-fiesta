// Copyright (c) 2020, the REST Postal Code Repository project authors.  Please see
// the AUTHORS file for details. All rights reserved. Use of this source code
// is governed by a BSD-style license that can be found in the LICENSE file.

package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	/**
	 * 
	 */
	private String cep;
	
	/**
	 * 
	 */
	private String logradouro;
	
	/**
	 * 
	 */
	private String complemento;
	
	/**
	 * 
	 */
	private String bairro;
	
	/**
	 * 
	 */
	private String localidade;
	
	/**
	 * 
	 */
	private String uf;
	
	/**
	 * 
	 */
	private String unidade;
	
	/**
	 * 
	 */
	private String ibge;
	
	/**
	 * 
	 */
	private String gia;

	/**
	 * 
	 * @return
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * 
	 * @param cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * 
	 * @return
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * 
	 * @param logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * 
	 * @return
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * 
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * 
	 * @return
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * 
	 * @return
	 */
	public String getLocalidade() {
		return localidade;
	}

	/**
	 * 
	 * @param localidade
	 */
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	/**
	 * 
	 * @return
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * 
	 * @param uf
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * 
	 * @return
	 */
	public String getUnidade() {
		return unidade;
	}

	/**
	 * 
	 * @param unidade
	 */
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	/**
	 * 
	 * @return
	 */
	public String getIbge() {
		return ibge;
	}

	/**
	 * 
	 * @param ibge
	 */
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	/**
	 * 
	 * @return
	 */
	public String getGia() {
		return gia;
	}

	/**
	 * 
	 * @param gia
	 */
	public void setGia(String gia) {
		this.gia = gia;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return String.format(
				"Address [cep=%s, logradouro=%s, complemento=%s, bairro=%s, localidade=%s, uf=%s, unidade=%s, ibge=%s, gia=%s]",
				cep, logradouro, complemento, bairro, localidade, uf, unidade, ibge, gia);
	}

}