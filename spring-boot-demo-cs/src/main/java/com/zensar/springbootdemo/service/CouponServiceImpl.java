package com.zensar.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.entity.Coupon;
import com.zensar.springbootdemo.dto.CouponDto;
import com.zensar.springbootdemo.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {	
	
	@Autowired
	private CouponRepository couponRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CouponDto getCoupon(int couponId) {
		
		Coupon coupon = couponRepository.findById(couponId).get();
		return modelMapper.map(coupon,CouponDto.class);
	}
	
	@Override
	public List<CouponDto> getAllCoupons() {
		List<Coupon> listOfCoupons =  couponRepository.findAll();
		
		List<CouponDto> listOfCouponDto= new ArrayList<CouponDto>();
		
		for(Coupon coupon:listOfCoupons) {
			listOfCouponDto.add(modelMapper.map(coupon,CouponDto.class));
		}
		return listOfCouponDto;
	}

	@Override
	public CouponDto insertCoupon(CouponDto couponDto) {
		
		Coupon coupon = modelMapper.map(couponDto,Coupon.class);
		Coupon insertCoupon = couponRepository.save(coupon);
		return modelMapper.map(insertCoupon,CouponDto.class);
		
	}

	@Override
	public void updateCoupon(int couponId, CouponDto couponDto) {
		
		Coupon coupon = modelMapper.map(couponDto,Coupon.class);
		couponRepository.save(coupon);
	}
		

	@Override
	public void deleteCoupon(int couponId) {
		
		 couponRepository.deleteById(couponId); 
	}		
}

