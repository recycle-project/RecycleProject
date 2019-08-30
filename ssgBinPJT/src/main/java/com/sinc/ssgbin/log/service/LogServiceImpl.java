package com.sinc.ssgbin.log.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.ssgbin.log.model.dao.LogDAOImpl;
import com.sinc.ssgbin.log.model.vo.LogVO;

@Service("logService")
public class LogServiceImpl implements LogService {
	@Resource(name="logDAO")
	private LogDAOImpl dao;
	
	@Override
	public List<LogVO> getLog() {
		System.out.println("LogServiceImpl getLot()");
		return dao.getLog();
	}

	@Override
	public List<LogVO> getSsgbinList(String filter) {
		System.out.println("LogServiceImpl getlog()"+filter);
		return dao.getLog(filter);
	}

	@Override
	public int writeLog(LogVO log) {
		System.out.println("LogServiceImpl writeLog()");
		return dao.writeLog(log);
	}
}
