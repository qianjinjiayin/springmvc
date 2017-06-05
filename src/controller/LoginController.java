package controller;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author jiayin.wang
 *
 */
@Controller
public class LoginController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	/**
	 * @param model
	 * @return login page
	 */
	@RequestMapping(value = "/login")
	public String init(final Model model)
	{
		final DateTime dateTime = new DateTime();
		model.addAttribute("currentDateTime", dateTime.toString("yyyy-MM-dd HH:mm:ss"));
		model.addAttribute("loginuser", "N/A");
		// return "forward:/person/tester";
		return "login";
	}

	/**
	 * @param username
	 * @param password
	 * @param model
	 * @return index page
	 */
	@RequestMapping(value = "/login/do", method = {RequestMethod.POST, RequestMethod.GET})
	public String login(@RequestParam("username") final String username, @RequestParam("password") final String password,
			final Model model)
	{
		LOGGER.info("username: " + username);
		LOGGER.info("password: " + password);
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "main";
	}
}
