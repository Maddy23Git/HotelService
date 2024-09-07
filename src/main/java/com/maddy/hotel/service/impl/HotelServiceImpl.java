package com.maddy.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maddy.hotel.entities.Hotel;
import com.maddy.hotel.exception.ResourceNotFoundException;
import com.maddy.hotel.repositories.HotelRepository;
import com.maddy.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(Integer hotelId) {
		return hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel is not found with given ID :" + hotelId));
	}

}
