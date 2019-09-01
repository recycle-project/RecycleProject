package com.sinc.ssgbin.log.model.dao;

import java.util.List;

import com.sinc.ssgbin.log.model.vo.LogVO;

public interface LogDAO {
	public List<LogVO> getLog();
	public List<LogVO> getLog(String filter);
	public int writeLog(LogVO log);
}
