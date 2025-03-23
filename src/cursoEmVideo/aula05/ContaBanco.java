package cursoEmVideo.aula05;


public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String usuario;
	private double saldo;
	private boolean status;
	
	
	public ContaBanco() {
		this.status = false;
		this.saldo = 0;
	}

	public void contaInfo() {
		System.out.printf("Numero da conta: %d %nUsuário: %s %nTipo de conta: %s %nSaldo: %.2f %nStatus: %s %n", 
				this.numConta, 
				this.usuario,
				this.tipo,
				this.saldo,
				this.status ? "Ativo" : "Inativo");
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getStatus() {
		if(status) {
			return "Ativa";
		} else {
			return "Inativa";
		}
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String usuario, String tipo, int numConta) {
		this.status = true;
		this.usuario = usuario;
		this.tipo = tipo;
		this.numConta = numConta;
		if(tipo.contentEquals("CC")) {
			this.saldo = 50;
			System.out.printf("%s, sua conta CC está ativa! \n", this.usuario);
			System.out.println("Você ganhou R$50,00 pela abertura da conta CC que foram depositados na sua conta!");
		} else {
			this.saldo = 150;
			System.out.printf("%s, sua conta CP está ativa! \n", this.usuario);
			System.out.println("Você ganhou R$150,00 pela abertura da conta CP que foram depositados na sua conta!");
		}
	}

	public void fecharConta() {
		if(saldo == 0) {
			this.status = false;
			System.out.println("Sua conta foi desativada!");
		} else if (saldo > 0) {
			System.out.println("Você tem saldo, favor sacar o valor antes de fechar a conta!");
		} else {
			System.out.printf("Você tem debitos pendentes na conta no valor de R$%.2f, favor pagar antes de fechar a conta! %n", this.saldo * -1);
		}
	}

	public void depositar(double deposito) {
		if(status) {
			this.saldo += deposito;
			System.out.printf("Foi desositado o valor de R$%.2f na sua conta! \n", deposito);
			System.out.printf("Saldo em conta: R$%.2f \n", this.saldo);
		} else {
			System.out.println("ERRO! Conta inativa!!");
		}
	}

	public void sacar(double saque) {
		
		if(!this.status) {
			System.out.println("Conta inativa!");
		}else if(this.status && this.saldo >= saque) {
			this.saldo -= saque;
			System.out.printf("Foi sacado o valor de R$%.2f da sua conta! \n", saque);
			System.out.printf("Saldo restante: R$%.2f\n", this.saldo);
		} else if (saldo < saque) {
			System.out.println("Você não tem saldo suficiente!");
		} else {
			System.out.println("ERRO! Conta inativa!!");
		}
	}

	public void pagarMensal() {
		if(this.status) {
		this.saldo = tipo.contentEquals("CC") ? this.saldo - 12 : this.saldo - 20; 
		System.out.println(tipo.contentEquals("CC") ? 
				"Foi abatido R$12,00 da sua conta" :
				"Foi abatido R$20,00 da sua conta");
		} else {
			System.out.println("Conta inativa!");
		}
	}
}
