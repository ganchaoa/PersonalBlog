package com.ganchaoa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.util.Base64Utils;

public class Tools {

	public static final Random random = new Random();

	/**
	 * @param source  来源
	 * @param dest	      目的地
	 * 复制文件	
	 */
	@SuppressWarnings("resource")
	public static void copyFileUsingFileChannels(File source, File dest) {

		FileChannel inputChannel = null;
		FileChannel outputChannel = null;

		try {
			inputChannel = new FileInputStream(source).getChannel();
			outputChannel = new FileOutputStream(dest).getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputChannel != null)
					inputChannel.close();

				if (outputChannel != null)
					outputChannel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @param max   最大值
	 * @param min	最小值	
	 * @return  获取一段范围内的一个数值
	 */
	public static int rand(int max, int min) {
		return random.nextInt(max) % (max - min + 1) + min;
	}

	/**
	 * @param value  数值
	 * @return	展示文件大小级别（GB,MB,KB）
	 */
	public static String flowAutoShow(int value) {
		int kb = 1024;
		int mb = 1048576;
		int gb = 1073741824;
		if (Math.abs(value) >= gb) {
			return Math.round(value / gb) + "GB";
		} else if (Math.abs(value) >= mb) {
			return Math.round(value / mb) + "MB";
		} else if (Math.abs(value) >= kb) {
			return Math.round(value / kb) + "KB";
		}
		return Math.round(value) + "";
	}

	/**
	 * @param data	需要加密的数据
	 * @param key	密钥
	 * @return	密钥加密后的数据
	 */
	public static String enAES(String data, String key) {
		try {
			Cipher cipher = Cipher.getInstance("AES");
			SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes("utf-8"), "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
			byte[] encryptData = cipher.doFinal(data.getBytes());
			return Base64Utils.encodeToString(encryptData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param data	需要解密的数据
	 * @param key	密钥
	 * @return	密钥解密后的数据
	 */
	public static String deAES(String data, String key) {
		try {
			Cipher cipher = Cipher.getInstance("AES");
			SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes("utf-8"), "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
			byte[] cipherTextBytes = Base64Utils.decodeFromString(data);
			byte[] desData = cipher.doFinal(cipherTextBytes);
			return new String(desData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param str	一段字符
	 * @return	是否为一串数字（true or false）
	 */
	public static boolean isNumber(String str) {
		if (null != str && str.trim().length() > 0 && str.matches("\\d*")) {
			return true;
		}
		return false;
	}

}
