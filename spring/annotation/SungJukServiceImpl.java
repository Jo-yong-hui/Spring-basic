package yh.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yh.spring.sungjuk.SungJuk;
import yh.spring.sungjuk.SungJukDAO;

@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	@Autowired
	private SungJukDAO sdao;
	
	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("혜교",99,96,76);
		
		System.out.println("성적 생성됨!");
		
		
		sdao.insertSungjuk(sj);

	}

}
