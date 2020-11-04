package com.moxi.mogublog.commons.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mogu-web", configuration = FeignConfiguration.class)
public interface WebFeignClient {
}
