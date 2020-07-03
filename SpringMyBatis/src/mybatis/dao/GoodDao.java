package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.domain.Good;

//Controller, Service , Repository,Component
//bean을 자동 생성 해주는 어노테이션 - IoC(제어의 역전)
@Repository
public class GoodDao {
	//데이터베이스 연동 프레임워크의 변수
	//@Autowired
	private SqlSession sqlSession;
	
	//전체 데이터를 가져오는 메소드
	//파라미터 없이 전체 데이터를 가져오는 sql을 호출
	public List<Good> allGood(){
		
		return sqlSession.selectList("good.allgood");
	}
	//code를 입력 받아서 데이터 한개를 찾아오는 메소드
	public Good getGood(int code) {
		
		return sqlSession.selectOne("good.getgood",code);
	}
	//데이터를 삽입하는 메소드
	public int insertGood(Good good) {
		return sqlSession.insert("good.insertgood",good);
	}
	//데이터를 업데이트하는 메소드
	public int updateGood(Good good) {
		
		return sqlSession.update("good.updategood",good);
	}
	//데이터를 삭제하는 메소드
	public int deleteGood(int code) {
		
		return sqlSession.delete("good.deletegood",code);
	}
	
	//데이터를 조회하는 메소드
	public List<Good> searchgood(String name) {
		return sqlSession.selectList("good.searchgood",name);
	}
}
