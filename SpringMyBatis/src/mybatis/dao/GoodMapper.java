package mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import mybatis.domain.Good;

//MyBatis Mapper로 사용할 인터페이스
public interface GoodMapper {
	//전체 데이터를 가져오는 메소드
	@Select("select code,name,regdate from goods")
	public List<Good> allgood();
	
	//code를 가지고 하나의 데이터를 찾아오는 메소드
	@Select("select * form goods where code=#{code}")
	public Good getGood(int code);
	
	//데이터 삽입
	@Insert("insert into goods(code,name,regdate) values(#{code},#{name},#{regdate})")
	public int insertGood(Good good);
	
	//데이터 업데이트
	@Update("update goods set name=#{name},regdate=#{regdate} where code = #{code}")
	public int updateGood(Good good);
	
	@Delete("delete from goods where code = #{code}")
	public int deleteGood(int code);
}
