package com.spring.learnspirngframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository // 데이터베이스와의 상호작용을 수행할 때 해당 어노테이션을 사용한다.
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
