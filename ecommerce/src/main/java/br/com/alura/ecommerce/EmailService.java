package br.com.alura.ecommerce;

import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerRecord;

// CONSUMER
// Classe responsável por detectar fraudes no sistema.
public class EmailService {

	public static void main(String[] args) {
		// Instancia um novo objeto para ser usado na função
		var emailService = new EmailService();
		// Subject que será escutado "ECOMMERCE_SEND_EMAIL" e o "parse" será a função para cada email recebido
		try (var service = new KafkaService(EmailService.class.getSimpleName(),
				"ECOMMERCE_SEND_EMAIL",
				emailService::parse, // Method References(função) que recebe o ConsumerRecord
				String.class,
				Map.of())){ 
			service.run();
		}
		
	}
		
	// Função que vai receber um record do tipo "ConsumerRecor"
	private void parse(ConsumerRecord<String, String> record) {
		System.out.println("-------------------------------------------");
		System.out.println("Send email");
		// Imprime a CHAVE
		System.out.println(record.key());
		// Imprime o VALOR da mensagem
		System.out.println(record.value());
		// Imprime a PARTIÇÃO onde foi enviada
		System.out.println(record.partition());
		// Imprime a POSIÇÃO da mensagem
		System.out.println(record.offset());
		// try catch para simular um processamento de fraude, terá um tempo de sleep
		// entre um record e outro de 5000 millis
			try {
				Thread.sleep(1000); // millis:1000 = 1 segundo
			} catch (InterruptedException e) {
				// ignoring
				e.printStackTrace();
			}
			// Imprime caso a ordem seja processada
			System.out.println("Email sent");
	}

}
