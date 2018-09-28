package pe.gob.ep.ginnet.util;

import java.io.File;
import java.security.SecureRandom;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Util {

	public static String replaceCaracterRaro(String cadena,String caracterRaro,String valorRemplazo) {
		String replacement = Matcher.quoteReplacement(valorRemplazo);
		String searchString = Pattern.quote(caracterRaro);
		cadena = cadena.replaceAll(searchString, replacement);
		return cadena;
	}
	
	public static boolean equiv(Object e1, Object e2) {

		if(e1==null && e2==null){
			return true;
		}
		
		if (e1 != null) {
			e1 = e1.toString();
		}

		if (e2 != null) {
			e2 = e2.toString();
		}

		if(e1!=null){
			if (e1.equals(e2)) {
				return true;
			}
		}
		return false;

	}
	
	public static String listFilesForFolder(File folder) {
		String temp="";
		File f=null;
		Integer posIni=0;
		String pre="";
	    for (File fileEntry : folder.listFiles()) {
	      if (fileEntry.isDirectory()) {
	    	  f=new File(fileEntry.getAbsoluteFile()+"/");
	    	  temp+=listFilesForFolder(f);
	      } else {
	        if (fileEntry.isFile()) {
	        	posIni=folder.getAbsolutePath().indexOf("librerias");
	        	pre=folder.getAbsolutePath().substring(posIni);
	        	pre=Util.replaceCaracterRaro(pre, "\\", "/");
	        	temp += "<script src=\""+pre+"/"+fileEntry.getName()+"\"></script>\n";
	        }

	      }
	    }
	    return temp;
	  }
	
	public static String randomString(char[] characterSet, int length) {
	    Random random = new SecureRandom();
	    char[] result = new char[length];
	    for (int i = 0; i < result.length; i++) {
	        // picks a random index out of character set > random character
	        int randomCharIndex = random.nextInt(characterSet.length);
	        result[i] = characterSet[randomCharIndex];
	    }
	    return new String(result);
	}
	
	public static String generateAleatorioAlphaNumeric(int longitud){
		char[] CHARSET_AZ_09 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		return randomString(CHARSET_AZ_09, longitud);
	}
	
	public static String[] convertirCadenaArray (String cadena){
		String[] cad = cadena.split(",");
		return cad;
	}
	
	public static String[] alternativaPregunta(String cadena){
		String[] cad = cadena.split("_");
		return cad;
	}
	
	
	public static void main(String[] args) {
		Util util=new Util();
		
		//File dir=new File("C:\\apache-tomcat-7.0.50-windows-x64\\apache-tomcat-7.0.50\\webapps\\ginnet\\librerias\\components/");
		//System.out.println(util.listFilesForFolder(dir));
		String cadena= "a,b,c,d";
		String[] cad = cadena.split(",");
		System.out.println(cad.length);
		//return cad;
		
	}
	
	
	//metodo para capturar la session
	public static String getGUID(){	
        String uuid = "99BD1E8F-46C7-9BF1-0912-9CE6B4FC9B5A99BD1E8F-46C7-9BF1-0912-9CE6B4FC9B5A";
        return uuid;		
	}
	
	public static String create_token(Double amount,String des, String merchantId,String accessKey, String secretKey,String uuid){        
        String url = "https://devapice.vnforapps.com/api.ecommerce/api/v1/ecommerce/token/"+merchantId;
        
        return url;		
	}	
	
	
	
	
	
}
