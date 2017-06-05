package run_main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.PropertyUtil;

public class TestReadProperties {
	private static final Logger logger = LoggerFactory.getLogger(PropertyUtil.class);

	public static void main(String[] args) {
		logger.info(PropertyUtil.getProperty("log4j.appender.CONSOLE"));
	}

}
