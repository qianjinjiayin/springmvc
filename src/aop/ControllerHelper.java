package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author jiayin.wang
 *
 */
@Aspect
public class ControllerHelper
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerHelper.class);

	/**
	 *
	 */
	public ControllerHelper()
	{

	}

	/**
	 *
	 */

	@Pointcut("execution(* controller.LoginController.init(..))")
	public void pointcut()
	{
		System.out.println("prepare join point...");
	}

	/**
	 *
	 */
	@Before("pointcut()")
	public void before()
	{
		LOGGER.info("before ...");
	}

	/**
	 *
	 */
	@AfterReturning("pointcut()")
	public void after()
	{
		LOGGER.info("afterreturning...");
	}

}
