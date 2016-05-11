/**
 * 
 */
package org.suye.hessian.server;

import com.caucho.hessian.server.HessianServlet;

/**
 * @author ye.su Email: suye@ehousechina.com May 9, 2016
 *
 */
public class HessianServiceImpl extends HessianServlet implements HessianService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1761052537457150473L;

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public String say(String msg) {
		return "Say:" + msg;
	}
}
