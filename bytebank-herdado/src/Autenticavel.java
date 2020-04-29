//contrato Autenticavel
//quem assinar esse contrato, precisa implementar
//metodo setSenha
//metodo autentica

//dentro de uma interface nao pode ter nada concreto
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
