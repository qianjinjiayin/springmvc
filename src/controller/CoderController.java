package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model.Person;

/**
 * @author jiayin.wang
 *
 */
public class CoderController implements Controller {
	private static final Logger LOGGER = LoggerFactory.getLogger(CoderController.class);
	private Person person;

	@Override
	public ModelAndView handleRequest(final HttpServletRequest req, final HttpServletResponse resp) throws Exception {

		LOGGER.info("access PersonController.handleRequest... ");
		
		final ModelAndView mv = new ModelAndView();
		
		getPerson().outputName();
		getPerson().outputAge();
		getPerson().outputHeight();
		getPerson().outputAddress();
		getPerson().outputFavorite();
		getPerson().outputOthers();

		mv.addObject("message", "I am a Coder");
		mv.addObject("person", getPerson());
		mv.setViewName("person");
		return mv;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(final Person person) {
		this.person = person;
	}
}
