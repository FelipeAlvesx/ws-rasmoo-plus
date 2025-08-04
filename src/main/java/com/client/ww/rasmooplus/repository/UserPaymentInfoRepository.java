package com.client.ww.rasmooplus.repository;

import com.client.ww.rasmooplus.model.User;
import com.client.ww.rasmooplus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
