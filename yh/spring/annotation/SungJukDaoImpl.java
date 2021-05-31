package yh.spring.annotation;

import org.springframework.stereotype.Repository;

import yh.spring.sungjuk.SungJuk;
import yh.spring.sungjuk.SungJukDAO;

@Repository("sdao")
public class SungJukDaoImpl implements SungJukDAO {

	@Override
	public void insertSungjuk(SungJuk sj) {
		System.out.println("성적 추가됨");

	}

}
