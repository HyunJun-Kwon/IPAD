package com.ipad.project.saleAnalysis.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ipad.project.saleAnalysis.model.UpdateDataRepositoryParameter;

@Repository
public interface IUpdateDataRepository {
	int getRecordNum();
	ArrayList<String> selectAdm();
	void insertRegionData(UpdateDataRepositoryParameter parameter);
	void updateRegionData(UpdateDataRepositoryParameter parameter);
}
