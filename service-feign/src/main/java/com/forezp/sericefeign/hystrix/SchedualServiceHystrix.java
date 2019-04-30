package com.forezp.sericefeign.hystrix;

import com.forezp.sericefeign.base.SchedualFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: zengqiao@bbdservice.com
 * @Date: 2019/4/8 17:30
 * @Description:
 */
@Component
public class SchedualServiceHystrix implements SchedualFeign {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
