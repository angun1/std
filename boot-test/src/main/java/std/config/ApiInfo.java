package std.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "mem")
@Component //이걸 붙여야 bean으로 등록되고 Autowired 에서 사용 할수 있게 됨 
@Data
public class ApiInfo {

	private String requestMember;
	private String requestPointList;
	
}
