package com.exact.com.exact.encryption;

import java.io.UnsupportedEncodingException;

import com.exact.com.exact.encryption.utils.Encryption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String keyString = "5852459632586596";
    	try {
			byte[] key = keyString.getBytes("UTF-8");
			String oracion = "Hola que tal como estas";
			
			String cifrado = Encryption.encrypt(oracion, key);
			
			System.out.println(cifrado);
			
			String descifrado = Encryption.decrypt(cifrado, key);
			
			System.out.println(descifrado);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
