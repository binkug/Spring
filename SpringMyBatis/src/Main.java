import java.sql.Connection;
import java.util.Date;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.dao.GoodDao;
import mybatis.dao.GoodMapper;
import mybatis.domain.Good;

public class Main {

	public static void main(String[] args) {
//		try {
			//GenericXmlApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
//			DataSource dataSource = 
//				context.getBean(DataSource.class);
//			//내용이 정상적으로 출력되면 데이터베이스 접속 성공
//			Connection con = dataSource.getConnection();
//			System.out.println(con);
			
			//sqlSession 주입 받아보기
			//출력이 되면 MyBatis 설정에는 문제가 없음
//			SqlSession sqlSession = context.getBean(SqlSession.class);
//			System.out.println(sqlSession);
			
			//GoodDao goodDao = context.getBean(GoodDao.class);
			//전체 데이터 가져오기
			//System.out.println(goodDao.allGood());
			
			//코드를 이용해서 선택한 데이터 가져오기
			//System.out.println(goodDao.getGood(1));
			
			//데이터 삽입
//			Good good = new Good();
//			good.setCode(10);
//			good.setName("자두");
//			good.setRegdate(new Date());
//			System.out.println(goodDao.insertGood(good));
			
			//데이터 업데이트
//			Good good = new Good();
//			good.setCode(9);
//			good.setName("포도");
//			good.setRegdate(new Date());
//			System.out.println(goodDao.updateGood(good));
			
			//데이터 삭제 
			//System.out.println(goodDao.deleteGood(9));
			
			//이름으로 데이터 조회
			//System.out.println(goodDao.searchgood("감"));
		try {
			//스프링 설정 파일의 경로를 설정
			GenericXmlApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
			//데이터베이스 접속정보 가져와서 접속이 되는지 테스트
//			DataSource ds = context.getBean(DataSource.class);
//			Connection con = ds.getConnection();
//			System.out.println(con);
			GoodMapper goodMapper = context.getBean(GoodMapper.class);
			System.out.println(goodMapper.allgood());
			
			
			
			context.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
