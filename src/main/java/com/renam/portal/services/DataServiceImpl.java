package com.renam.portal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.renam.portal.dao.DataDao;
import com.renam.portal.domain.Comment;

public class DataServiceImpl implements DataService {

	@Autowired
	DataDao dataDao;

	@Override
	public int insertRow(Comment comment) {
		return dataDao.insertRow(comment);
	}

	@Override
	public List<Comment> getList() {
		return dataDao.getList();
	}

	@Override
	public Comment getRowById(int id) {
		return dataDao.getRowById(id);
	}

	@Override
	public int updateRow(Comment comment) {
		return dataDao.updateRow(comment);
	}

	@Override
	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

}
