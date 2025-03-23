package cursoEmVideo.aula02;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public Caneta(String modelo, String cor, float ponta) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = 100;
		this.tampada = true;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETE:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		if(tampada) {
			System.out.println("A caneta está tampada");
		} else {
			System.out.println("A caneta está destampada");
		}
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public int getCarga() {
		return this.carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
//	public boolean getTampada() {
//		return this.tampada;
//	}
//	public void setTampada(boolean tampada) {
//		this.tampada = tampada;
//	}
	
	public void tampar() {
		if(tampada) {
			System.out.println("A caneta já está tampada!");
		} else {
			this.tampada = true;
			System.out.println("A caneta foi tampada!");
		}	
	}
	public void destampar() {
		if(tampada) {
			this.tampada = false;
			System.out.println("A caneta foi destampada!");
		} else {
			
			System.out.println("A caneta já está destampada!");
		}	
	}
	
	public void rabiscar() {
		if(carga <= 0) {
			System.out.println("Caneta sem carga!");
		} else if(this.tampada){
			System.out.println("Não é possível rabiscar com a caneta tampada!");
		} else {
			System.out.println("Rabiscou!");
			this.carga--;
			System.out.printf("Carga %d%%\n", this.carga);
		}
	}
	
}
