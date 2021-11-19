package com.yazbyz.calculatorcli;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class) // mockito가 제공하는 Junit 확장 클래스 MockitoJunitRunner를 이용해 테스트 클래스를 실행
public class MyServiceTest {
    
	@InjectMocks // 목 객체를 사용하는 MyService 객체를 생성하여 초기화하라는 의미
	// 초기화하지 않아도 자동으로 MyService 객체가 생성되어 초기화됨.
    MyService myService;

    @Mock //@Mock 어노테이션은 calculatorService가 목 객체를 참조하도록 합니다.
    // 객체를 생성하지 않아도 자동으로 객체가 생성되고 해당 필드가 초기화 된다는 것을 의미합니다.
    CalculatorService calculatorService;

    @Test
    public void execute() throws Exception{
        // given
        int value1 = 5;
        int value2 = 10;
        given(calculatorService.plus(5, 10)).willReturn(15); // given()은 static메소드. calculatorService.plus(5,10)을 호출하면 plus메소드가 15를 반환하도록 하라

        // when
        int result = myService.execute(value1, value2); // value1, value2는 위에서 설정한대로만 동작

        // then
        verify(calculatorService).plus(anyInt(), anyInt()); // verify(), anyInt()메소드는 org.mockito.Mockito의 static한 메소드
        // 어떤 정수든지 2개를 파라미터로 넣어서 plus()메소드를 호출했는지를 검증하라는 의미 
        Assert.assertEquals(30, result);
    }
}