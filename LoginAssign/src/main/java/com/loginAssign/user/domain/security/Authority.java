package com.loginAssign.user.domain.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String authority;
	

	public Authority(String authority) {
		super();
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}

	@Override
	public String toString() {
		return "Authority [authority=" + authority + "]";
	}

	
	
}
