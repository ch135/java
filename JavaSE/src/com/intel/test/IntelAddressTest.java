package com.intel.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @author scholarly
 * @time 2018/1/17
 * <h1>InetAddss代表一个IP地址对象,网络通信的基础类</h1>
 *
 */
public class IntelAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress  ip = InetAddress.getByName("www.baidu.com");
		String hostaddress = ip.getHostAddress();
		String canonicalhostname = ip.getCanonicalHostName();
		String hostname = ip.getHostName();
		String address = ip.getAddress().toString();
		System.out.println(hostaddress);
		System.out.println(canonicalhostname);
		System.out.println(hostname);
		System.out.println(address);
	}
}
