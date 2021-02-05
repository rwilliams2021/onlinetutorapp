package com.finalproject.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.finalproject.domain.Booking;


@Repository
public class BookingDAOImpl implements BookingDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public int add(Booking booking) {
		String sql = "insert into bookings(parentid,tutorid) values (?,?)";
		Object params[] = {booking.getParentid(),booking.getTutorid()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	@Override
	public List<Booking> findAll() {
		
		String sql = "select * from bookings";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Booking>(Booking.class));
		
	}

	@Override
	public int update(Booking booking) {
		String sql = "update bookings set subject=?, duration_in_hours=?, times_per_week=?, email=?, cell_number=? where id=?";
		Object params[] = {};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}
	
}
