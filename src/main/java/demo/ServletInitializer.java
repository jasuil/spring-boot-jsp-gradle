package demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	
	/*public ServletInitializer() {
	    super();
	    setRegisterErrorPageFilter(false); // <- this one
	}
*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BoardBootApplication.class);
	}

}
