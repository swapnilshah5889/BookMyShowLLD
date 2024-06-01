package com.swapnilshah5889.BookMyShow.repositories;
import com.swapnilshah5889.BookMyShow.models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    List<ShowSeat> findAllById(List<Long> showSeatIds);

    List<ShowSeat> findAllByIdBetween(List<Long> showSeatIds);

    ShowSeat save(ShowSeat showSeat);

}
