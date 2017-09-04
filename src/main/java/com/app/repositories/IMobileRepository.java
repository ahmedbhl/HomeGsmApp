package com.app.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Mobile;

public interface IMobileRepository extends JpaRepository<Mobile, Long> {

	public List<Mobile> getByimei(String imei);

	public List<Mobile> getByModel(String model);

	public List<Mobile> getByDate(Date date);

	public List<Mobile> getBynameClient(String name);

	public List<Mobile> getByPanne(String panne);

}
