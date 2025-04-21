package curso.class14;

public class Class14 {

	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("OOP class 01");
		v[1] = new Video("PHP class 12");
		v[2] = new Video("HTML5 class 10");
		
//		System.out.println(v[0].toString());
//		System.out.println(v[1].toString());
//		System.out.println(v[2].toString());
		
		Locust[] l = new Locust[2];
		
		l[0] = new Locust("Jubileu", 22, "M", "juba");
		l[1] = new Locust("Creuza", 12, "F", "creuzita");
		
//		System.out.println(l[0].toString());
//		System.out.println(l[1].toString());
//		
//		l[0].watchedOneMore();
//		System.out.println(l[0].toString());
		
		Visualization[] vis = new Visualization[2];
		vis[0] = new Visualization(l[0],v[1]);
		vis[0].rate();
		System.out.println(vis[0].toString());
		vis[1] = new Visualization(l[0],v[2]);
		vis[1].rate(85.0f);
		System.out.println(vis[1].toString());
	}

}
