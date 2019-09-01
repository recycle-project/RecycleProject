package com.sinc.ssgbin.log.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sinc.ssgbin.log.model.vo.LogVO;

@Repository("logDAO")
public class LogDAOImpl implements LogDAO {
	@Resource(name="sqlSession")
	private SqlSession session;

	@Override
	public List<LogVO> getLog() {
		System.out.println("LogDAOImpl getLog()");
		return session.selectList("com.sinc.ssgbin.log.list");
	}

	@Override
	public List<LogVO> getLog(String filter) {
		System.out.println("LogDAOImpl getLog()" + filter);
		return session.selectList("com.sinc.ssgbin.log.filterlist", filter);
	}	
	
	@Override
	public int writeLog(LogVO log) {
		System.out.println("LogDAOImpl writeLog()");
		return session.insert("com.sinc.ssgbin.log.writeLog", log);
	}
	
}
