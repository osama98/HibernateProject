package com.netmind.dao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.netmind.dao.Cliente;
import com.netmind.dao.ClienteDao;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClienteDaoTest {

	private Cliente cliente;
	private ClienteDao clienteDao;
	private static int IDCLIENTE = 0;
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void test1Add() throws Exception {
		cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNombre("Osama");
		cliente.setApellidos("Khollala");
		cliente.setDni("46589245J");
		
		clienteDao = new ClienteDao();
		Cliente expectedReturn = clienteDao.add(cliente);
		IDCLIENTE = expectedReturn.getIdCliente();
		
		assertTrue(expectedReturn != null);
	}
	
	@Test
	public void test2Modify() throws Exception{
		cliente = new Cliente();
		cliente.setIdCliente(IDCLIENTE);
		cliente.setNombre("Juan");
		cliente.setApellidos("SOTO");
		cliente.setDni("32654795J");
		
		clienteDao = new ClienteDao();
		Cliente expectedReturn = clienteDao.add(cliente);
		IDCLIENTE = expectedReturn.getIdCliente();
		
		assertTrue(expectedReturn != null);
	}

}
