package com.sinc.ssgbin.log.service;

import java.util.List;

import com.sinc.ssgbin.log.model.vo.LogVO;

public interface LogService {
	public List<LogVO> getLog();
	public List<LogVO> getSsgbinList(String filter);
}
