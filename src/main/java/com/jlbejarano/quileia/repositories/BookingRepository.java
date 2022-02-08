package com.jlbejarano.quileia.repositories;

import java.util.List;
import com.jlbejarano.quileia.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends  JpaRepository<Booking, Long> {
    
    List<Booking> findByIdTourist(Long idTourist);

    List<Booking> findByIdCity(Long idCity);

    @Query("SELECT count(*) FROM Booking b WHERE b.idCity = :idCity AND b.date = :date AND b.id != :id")
    int count(@Param("idCity")Long idCity, @Param("date")String date, @Param("id")Long id);
    
}
