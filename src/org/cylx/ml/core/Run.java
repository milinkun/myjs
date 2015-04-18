package org.cylx.ml.core;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Run {

	public static void run(Class<?> clazz) {
		try {
			Class<?> cl = clazz;
			Object obj = cl.newInstance();
			Method[] mds = cl.getDeclaredMethods();
			for (Method m : mds) {
				int id = m.getModifiers();
				if (Modifier.isAbstract(id)) {
					continue;
				}
				if (Modifier.isStatic(id)) {
					continue;
				}
				String name = m.getName();
				if (Modifier.isPublic(id) && name.contains("run")) {
					try {
						m.invoke(obj);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
