package com.github.monkey.analyzer.model;

/**
 * this class define an enumeration of abnormality type.<br/>
 * If a new kind of abnormality is registered, one should add a new type
 * 
 * @author DC Melo (melo.da.chor@gmail.com)
 * 
 */
public enum AbnormalityType {
	/**
	 * Unknown abnormality type
	 */
	UNKNOWN,
	/**
	 * Monkey Crash
	 */
	CRASH,
	/**
	 * Monkey ANR
	 */
	ANR,
	/**
	 * Native Crash
	 */
	NATIVE,

}
