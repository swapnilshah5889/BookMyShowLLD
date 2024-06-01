package com.swapnilshah5889.BookMyShow.repositories;
import com.swapnilshah5889.BookMyShow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllById(List<Long> userIds);
}
