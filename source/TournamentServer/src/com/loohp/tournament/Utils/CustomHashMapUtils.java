package com.loohp.tournament.Utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class CustomHashMapUtils {
	
	public static String serialize(Serializable o) {
		try {
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    ObjectOutputStream oos = new ObjectOutputStream(baos);
		    oos.writeObject(o);
		    oos.close();
		    return Base64.getEncoder().encodeToString(baos.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object deserialize(String s) {
		try {
			byte[] data = Base64.getDecoder().decode(s);
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			Object o = ois.readObject();
			ois.close();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
