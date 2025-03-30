package curso.aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco jubileu = new ContaBanco();
		
		jubileu.abrirConta("Jubileu", "CC", 10568899);
		jubileu.contaInfo();
		jubileu.sacar(30);
		jubileu.depositar(200);
	}

}
