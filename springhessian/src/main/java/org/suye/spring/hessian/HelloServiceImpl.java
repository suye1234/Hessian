/**
 * 
 */
package org.suye.spring.hessian;

/**
 * @author ye.su
 * Email: suye@ehousechina.com
 * May 9, 2016
 *
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello: " + name;
	}

}
