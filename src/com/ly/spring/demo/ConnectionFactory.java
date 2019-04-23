package com.ly.spring.demo;

public class ConnectionFactory {
	
	private String host;
	
	private int port;
	
	private String vhost;
	
	private String username;
	
	private String passwd;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getVhost() {
		return vhost;
	}

	public void setVhost(String vhost) {
		this.vhost = vhost;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "ConnectionFactory [host=" + host + ", port=" + port + ", vhost=" + vhost + ", username=" + username
				+ ", passwd=" + passwd + "]";
	}
	
}
