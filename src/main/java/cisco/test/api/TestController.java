package cisco.test.api;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	/**
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/test")
	@ResponseBody
	public String test(HttpServletRequest request) throws IOException {
		//return
		return "Test Service is up!";
	}

	/**
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/healthcheck")
	@ResponseBody
	public String healthcheck(HttpServletRequest request) throws IOException {
		//return
		return "Test service healthcheck testing";
	}
}
