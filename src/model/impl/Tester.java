package model.impl;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import model.Person;

/**
 * @author jiayin.wang
 *
 */
@Repository("tester")
public class Tester extends Person {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tester.class);

	@Override
	public void outputName() {
		LOGGER.info("Tester Name:" + getName());
	}

	@Override
	public void outputAge() {
		LOGGER.info("Tester Age:" + getAge());
	}

	@Override
	public void outputHeight() {
		LOGGER.info("Tester Height:" + getHeight());
	}

	@Override
	public void outputFavorite() {
		LOGGER.info("Tester Favorite:" + Arrays.toString(getFavorite()));
	}

	@Override
	public void outputAddress() {
		LOGGER.info("Tester Address:" + getAddress());
	}

	@Override
	public void outputOthers() {
		LOGGER.info("Tester Others:" + getOthers());
	}

	/**
	 *
	 */
	public Tester() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param favorite
	 * @param address
	 * @param others
	 */
	public Tester(final String name, final Integer age, final Double height, final String[] favorite,
			final Set<String> address, final Map<String, String> others) {
		super(name, age, height, favorite, address, others);
	}

}
