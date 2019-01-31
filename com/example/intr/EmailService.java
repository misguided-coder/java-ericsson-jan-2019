package com.example.intr;

public interface EmailService {
	public abstract boolean configure();
	public abstract boolean send();
	void receive();
}
