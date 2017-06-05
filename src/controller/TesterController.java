package controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Person;

/**
 * @author jiayin.wang
 *
 */
@Controller
public class TesterController {
	private static final Logger LOGGER = LoggerFactory.getLogger(TesterController.class);

	@Resource(name = "tester")
	private Person person;

	/**
	 * @param model
	 * @return person page
	 */
	@RequestMapping(value = "/person/tester")
	public String getTester(final Model model) {

		LOGGER.info("access getTester ... ");
		person.setName("WJY2");
		person.setAge(262);
		person.setHeight(170.2);
		person.setFavorite(new String[] { "F1", "F2" });

		Set<String> address = new HashSet<String>();
		address.add("A1");
		address.add("A2");
		person.setAddress(address);

		Map<String, String> others = new HashMap<String, String>();
		others.put("O1", "V1");
		others.put("O2", "V2");
		person.setOthers(others);

		person.outputName();
		person.outputAge();
		person.outputHeight();
		person.outputAddress();
		person.outputFavorite();
		person.outputOthers();

		model.addAttribute("message", "I am a Tester");
		model.addAttribute("person", person);
		return "person";
	}
}
