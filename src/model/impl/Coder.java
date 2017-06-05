package model.impl;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Person;

/**
 * @author jiayin.wang
 *
 */
public class Coder extends Person {
	private static final Logger LOGGER = LoggerFactory.getLogger(Coder.class);

	@Override
	public void outputName() {
		LOGGER.info("Coder Name:" + getName());
	}

	@Override
	public void outputAge() {
		LOGGER.info("Coder Age:" + getAge());
	}

	@Override
	public void outputHeight() {
		LOGGER.info("Coder Height:" + getHeight());
	}

	@Override
	public void outputFavorite() {
		LOGGER.info("Coder Favorite:" + Arrays.toString(getFavorite()));
	}

	@Override
	public void outputAddress() {
		LOGGER.info("Coder Address:" + getAddress());
	}

	@Override
	public void outputOthers() {
		LOGGER.info("Coder Others:" + getOthers());
	}

	/**
	 *
	 */
	public Coder() {
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
	public Coder(final String name, final Integer age, final Double height, final String[] favorite,
			final Set<String> address, final Map<String, String> others) {
		super(name, age, height, favorite, address, others);
	}

}
