package pe.gob.ep.ginnet.util;

import java.lang.reflect.Field;
import org.apache.commons.lang.StringUtils;

public class Constante {
	private enum PRIVADOS {
		CONTENT_TYPE_ADMINITIDOS,CONSTANTE_JAVASCRIPT
	};

	public static final String[] CONTENT_TYPE_ADMINITIDOS= {
		"application/pdf",
		"application/vnd.openxmlformats-officedocument.wordprocessingml.document",
		"application/msword", "application/rtf", "image/jpeg",
		"image/x-png", "image/pjpeg", "image/png,image/gif", "image/tiff",
		"image/bmp" };
	
	public static int ESTADO_ACTIVO=1;
	public static int ESTADO_INACTIVO=2;
	public static int ROOT_MENU=0;
	public static String DES_ROOT_MENU="Root";
	public static String MODE_CHANGE_PASS_PERFIL="perfil";
	public static String MODE_CHANGE_PASS_ADMIN="admin";
	public static String BG_APP_DEFAULT="librerias/imagenes/background2.jpg";
	
	public static String CONSTANTE_JAVASCRIPT = "";
	
	public Constante() {
		String strConstante = "";
		boolean isForAdding;
		try {
			for (Field f : this.getClass().getFields()) {
				isForAdding = true;
				for (PRIVADOS privado : PRIVADOS.values()) {
					if (privado.toString().equals(f.getName())) {
						isForAdding = false;
						break;
					}
				}

				if (isForAdding) {
					if (f.getGenericType().toString().equals("int")) {
						strConstante += "var " + f.getName() + " = "+ f.get(this) + ";\n";
					} else if (f.getGenericType().toString().equals("class java.lang.String")) {
						strConstante += "var " + f.getName() + " = '"+ f.get(this) + "';" + "\n";
					} else if (f.getName().equals("FEC_TODAY")) {
						strConstante += "var " + f.getName()+ " = new Date(parseInt(" + f.get(this)+ ",10));" + "\n";
					} else if (f.getGenericType().toString().equals("class [Ljava.lang.String;")) {
						Object[] row = (Object[]) f.get(this);
						strConstante += "var " + f.getName() + " = ['"+ StringUtils.join(row, "','") + "'];\n";
					}else if (f.getGenericType().toString().equals("class [Ljava.lang.int;")) {
						Object[] row = (Object[]) f.get(this);
						strConstante += "var " + f.getName() + " = ["+ StringUtils.join(row, ",") + "];\n";
					}

				}
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		CONSTANTE_JAVASCRIPT = strConstante+"\n";
	}
	
}
