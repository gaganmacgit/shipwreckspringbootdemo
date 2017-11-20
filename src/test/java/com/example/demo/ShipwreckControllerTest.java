package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.controller.ShipwreckController;
import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	ShipwreckController shipWreckController;

	@Mock
	ShipwreckRepository shipWreckRepo;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testShipwreckGet() {

		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(1L);

		when(shipWreckRepo.findOne(1L)).thenReturn(shipwreck);
		Shipwreck sw = shipWreckController.get((long) 1);
        
		verify(shipWreckRepo).findOne(1L);
		assertEquals(1l, sw.getId().longValue());
	}
}
