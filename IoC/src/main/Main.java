package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import domain.Good;
import domain.GoodFactory;

public class Main {

	public static void main(String[] args) {
		/*
		//어노테이션을 이용해서 Bean을 생성
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(
				GoodFactory.class);
		Good good = context.getBean("build", Good.class);
		*/
		
		//XML을 이용해서 Bean을 생성
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
					"applicationContext.xml");
		Good good = context.getBean("good", Good.class);
		good.setNum(1);
		good.setName("사과");
		System.out.println(good);
		
		Good good1 = context.getBean("good", Good.class);
		good1.setNum(2);
		good1.setName("밀감");
		System.out.println(good);
		
		//해시코드 출력
		System.out.println(System.identityHashCode(good));
		System.out.println(System.identityHashCode(good1));
		
		//상수는 상수 풀에 저장하고 풀에 저장한 상수의 참조를 변수에 저장합니다.
		int a = 10;
		int b = 10;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		context.close();
	}

}
