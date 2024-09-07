package com.maddy.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddy.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
