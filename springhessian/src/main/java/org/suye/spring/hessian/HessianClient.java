/**
 * 
 */
package org.suye.spring.hessian;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @author ye.su
 * Email: suye@ehousechina.com
 * May 9, 2016
 *
 */
public class HessianClient {
	    public static void main(String[] args) throws Exception {
	        //TODO Actual URL
	        String url = "http://localhost:8283/springhessian/hessian/hessianService";
	        HessianProxyFactory factory = new HessianProxyFactory();
	        HelloService helloService = (HelloService) factory.create(HelloService.class, url);
	        System.out.println(helloService.sayHello("SuYe"));

	    }
}
