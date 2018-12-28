package com.fobcode.bp.config;

import java.util.List;

public class Settings extends SimpleConfig{
	private Settings(String fileName) {
		super(fileName);
	}
	public static List<String> TIMED_MESSAGES;
	public static String MOTD;
	private void onLoad() {
		TIMED_MESSAGES = getStringList("messages");
		MOTD = getString("motd");
	}
	public static void init() {
		new Settings("settings.yml").onLoad();
	}
}
