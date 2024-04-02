package com.spring.learnspirngframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service // 클래스에서 비즈니스 논리를 수행한다면 해당 어노테이션을 사용할 수 있다.
public class BusinessCalculationService {
    private DataService dataService;

    //    생성자 생성
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
