package std.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import std.config.ApiInfo;
import std.java.enumcase.ApiInfoMang;

@Component
@Slf4j
public class TestRunner implements ApplicationRunner {

	@Value("${api.getMemberInfo.url}")
	private String apiUrl;
	
	@Autowired
	private ApiInfo apiInfo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// TODO Auto-generated method stub
		log.debug(apiInfo.getRequestMember() + "====================================================================");
		log.debug(ApiInfoMang.getMemberInfo.getDescription());
		log.debug(ApiInfoMang.getPointList.getDescription());
		log.debug(ApiInfoMang.getMemberInfo.getUrl());
		log.debug("xxxxxxxxxxxxxxxxxxxx" +  ApiInfoMang.getMemberInfo);
		ApiInfoMang.getMemberInfo.setUrl(apiUrl);
		log.debug(apiUrl);
		log.debug(ApiInfoMang.getMemberInfo.getUrl());
	}


}
