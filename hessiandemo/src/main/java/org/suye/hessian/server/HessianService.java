/**
 * 
 */
package org.suye.hessian.server;

/**
 * @author win
 *
 */
public interface HessianService {
	String hello(String name);
	
	String say(String msg);
	
	int sum(int a, int b);
}
