package br.com.alura;

// Interface para comparar Aula com outra Aula
public class Aula  implements Comparable<Aula>{

	// Declaração de variaveis
	private String titulo;
	private int tempo;

	// Construtor
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	// Metodo toString para imprimir o valor das referencias do objeto
	// Se esse metodo nao for usado, a saida sera a seguinte:
	// br.com.alura.Aula(Nome da classe), 762efe5d(HashCode)
	// [br.com.alura.Aula@762efe5d, br.com.alura.Aula@5d22bbb7, br.com.alura.Aula@41a4555e]
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	// metodo obrigado da interface
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
