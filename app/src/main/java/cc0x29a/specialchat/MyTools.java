package cc0x29a.specialchat;

import android.text.TextUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Some often used tools packed in methods below.
 * @author  Zhong Wenliang
 * @mail    CuberWenliang@163.com
 * @date    20.03
 */

public class MyTools{
	
	/**
	 * Get a random number between max and min
	 * @param max max number
	 * @param min min number
	 * @return an integer
	 */
	public static int getRandomNum(int max,int min){
		return (int)(1+Math.random()*(max-min+1));
	}
	
	/**
	 * Get current timestamp
	 * @return current timestamp (integer)
	 * **/
	static int getCurrentTime(){
		return (int)(System.currentTimeMillis()/1000);
	}
	
	/**
	 * Use md5 encrypt input String. Found By the Internet
	 * @param string to be encrypt
	 * @return String
	 * **/
	static String md5(String string){
		if(TextUtils.isEmpty(string)){
			return null;
		}
		try{
			byte[] bytes = MessageDigest.getInstance("MD5").digest(string.getBytes());
			StringBuilder result =new StringBuilder();
			for (byte b : bytes) {
				String temp = Integer.toHexString(b & 0xff);
				if (temp.length() == 1) {
					temp = "0" + temp;
				}
				result.append(temp);
			}
			return result.toString();
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		return null;
	}
	
}
