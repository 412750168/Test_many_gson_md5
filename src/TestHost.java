import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestHost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path_read = "/Users/zzl/Desktop/copyDir/read.txt";
		String path_wirte = "/Users/zzl/Desktop/copyDir/write.txt";

		Copy copy = new Copy();
		copy.copy(path_read, path_wirte);

		TestCollection col = new TestCollection();
		col.test();

		PriorityQueue priorityQueue = new PriorityQueue(10);

		for (int i = 0; i < 10; i++)
			try {
				priorityQueue.push(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		for (int j = 0; j < 10; j++)
			try {
				System.out.println(priorityQueue.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		// ExecutorService executorService =
		// Executors.newSingleThreadExecutor();
		// ExecutorService executorService = Executors.newCachedThreadPool();
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 3; i++)
			executorService.execute(new Task(i));
		executorService.shutdown();

		String str = "爱 ";
		char a[] = str.toCharArray();
		byte b[] = str.getBytes();
		System.out.println(b.length + "" + a.length);
		
		String s = new  String( "a" );  
		  System.out.println("原始："  + s);  
		  System.out.println("MD5后："  + MD5(s));  
		  System.out.println("MD5后再加密："  + KL(MD5(s)));  
		  System.out.println("解密为MD5后的："  + JM(KL(MD5(s)))); 
		  
		  
		  People people = new People();
		  people.setAge(18);
		  people.setName("zzl");
		  String[] list = {"东莞","广州"};
		  
		  
		  people.setAdd(list);
		  
		  Gson gson = new Gson();
		  List<People> persons = new ArrayList<People>();
		  persons.add(people);
		  String str_gson = gson.toJson(persons);
		  System.out.println(str_gson);
		  List<People> tmp_person = gson.fromJson(str_gson, new TypeToken<List<People>>(){}.getType());
		  People tmp = tmp_person.get(0);
		  System.out.println(tmp.toString());
	}

	public static String MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];

		byte[] md5Bytes = md5.digest(byteArray);

		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}

		return hexValue.toString();
	}

	// 可逆的加密算法
	public static String KL(String inStr) {
		// String s = new String(inStr);
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;
	}

	// 加密后解密
	public static String JM(String inStr) {
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String k = new String(a);
		return k;
	}

	
}
