package com.maddy.hotel.service;

import java.util.List;

import com.maddy.hotel.entities.Hotel;

public interface HotelService {

	Hotel saveHotel(Hotel hotel);

	List<Hotel> getAllHotels();

	Hotel getHotel(Integer hotelId);
}
