package com.spring.learnspirngframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository // 데이터베이스와의 상호작용을 수행할 때 해당 어노테이션을 사용한다.
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
