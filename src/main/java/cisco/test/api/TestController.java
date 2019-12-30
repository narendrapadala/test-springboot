package cisco.test.api;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TestController {
	
	@Value( "${myenv.profile}" )
	private String myenv;
	
	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/test")
	@ResponseBody
	public String test(HttpServletRequest request) throws IOException {
		
		LOG.info("Test Service is up ..! on " + myenv);
		//return
		return "Test Service is up ..! on " + myenv;
	}

	/**
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/healthcheck")
	@ResponseBody
	public String healthcheck(HttpServletRequest request) throws IOException {
		
		LOG.info( "Test service healthcheck testing on " + myenv);
		//return
		return "Test service healthcheck testing on " + myenv;
	}
}
