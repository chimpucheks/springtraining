package com.zensar.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.springbootdemo.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon,Integer> {

}
