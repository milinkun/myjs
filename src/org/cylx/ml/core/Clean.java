package org.cylx.ml.core;

import java.nio.ByteBuffer;

public class Clean {

	public void apprun() {

		int i = -1;
		 //i = ~i;
		System.out.println(toBinStr(i));

	}

	private String toBinStr(int i) {
		char[] str = new char[32];
		for (int x = 0; x < 32; x++) {
			int t = (i >>> x) & 0x1;
			str[31 - x] = t > 0 ? '1' : '0';
		}
		return new String(str);
	}

	private String toStr(long i) {
		char[] str = new char[64];
		for (int x = 0; x < 64; x++) {
			long t = (i >>> x) & 1L;
			str[63 - x] = t > 0 ? '1' : '0';
		}
		return new String(str);
	}

	public void runttt() {

	}

	private void ff(ByteBuffer buff) {
		System.out.println("postion:" + buff.position());
		System.out.println("limit:" + buff.limit());
		System.out.println("cap:" + buff.capacity());
	}

	public void ruxngg() {
		int num = 0;
		long c = System.currentTimeMillis();
		while (Integer.MAX_VALUE != num) {
			num++;
		}
		long e = System.currentTimeMillis();
		long t = (e - c) / 1000L;
		System.out.println((e - c));
	}

	public static void main(String[] args) {
		Run.run(Clean.class);
	}
}
