package com.deepblue.kuaiding.system;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public static boolean isInt (String str) {
		Pattern pattern = Pattern.compile("^[0-9]*[1-9][0-9]*$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
