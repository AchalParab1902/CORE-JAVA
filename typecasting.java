class typecasting
{
	public static void main(String[] args) 
	{
		//widening
		char a='a';
		int b=a;
		System.out.println(b);
		
		float c=10.45f;
		long d=(long)c;
		System.out.println(d);
		
		byte e=13;
		double f=e;
		System.out.println(f);
		
		short g=2;
		int h=g;
		System.out.println(h);
		
		double i=g;
		System.out.println(i);
		
		double j=a;
		System.out.println(j);
		
		//boolean k=true;
		//double l=(boolean)k;
		//System.out.println(l);
		
		int m=278;
		long n=m;
		System.out.println(n);
		
		double o=m;
		System.out.println(o);
		
		// narrowing
		
		double p=34.6;
		int q=(int)p;
		System.out.println(q);
		
		float r=45.65f;
		byte s=(byte)r;
		System.out.println(s);
		
		int t=98;
		char u=(char)t;
		System.out.println(u);
		
		long v=89;
		int w=(int)v;
		System.out.println(w);
		
		
	}
}
