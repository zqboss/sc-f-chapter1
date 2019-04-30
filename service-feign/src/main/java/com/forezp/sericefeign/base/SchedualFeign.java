package com.forezp.sericefeign.base;

import com.forezp.sericefeign.hystrix.SchedualServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zengqiao@bbdservice.com
 * @Date: 2019/4/8 15:16
 * @Description:
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHystrix.class)
public interface SchedualFeign {
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
