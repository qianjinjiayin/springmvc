package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Desc:properties文件获取工具类 Created by hafiz.zhang on 2016/9/15.
 */
public class PropertyUtil {
	private static final Logger logger = LoggerFactory.getLogger(PropertyUtil.class);
	private static Properties props;
	static {
		loadProps();
	}

	synchronized static private void loadProps() {
		logger.info("start to load properties .......");
		props = new Properties();
		InputStream in = null;
		try {
			// <!--第一种，通过类加载器进行获取properties文件流-->
			in = PropertyUtil.class.getClassLoader().getResourceAsStream("log4j.properties");

			// <!--第二种，通过类进行获取properties文件流-->
			// in = PropertyUtil.class.getResourceAsStream("/jdbc.properties");
			props.load(in);
		} catch (FileNotFoundException e) {
			logger.error("cannot find properties file");
		} catch (IOException e) {
			logger.error("hit IOException");
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				logger.error("hit exception during closing file streams");
			}
		}
		logger.info("finish to load properties .......");

		logger.info("------------- start to output content -------------");
		final Set<Entry<Object, Object>> contents = props.entrySet();
		final Iterator<Entry<Object, Object>> it = contents.iterator();
		while (it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			logger.info(entry.getKey().toString() + "===>>>" + entry.getValue().toString());
		}
		logger.info("------------- end to output content -------------");
	}

	public static String getProperty(String key) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key);
	}

	public static String getProperty(String key, String defaultValue) {
		if (null == props) {
			loadProps();
		}
		return props.getProperty(key, defaultValue);
	}
}