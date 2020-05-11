package br.com.alura.ecommerce;

import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerRecord;

// CONSUMER
// Classe responsável por detectar fraudes no sistema.
public class FraudDetectorService {

	public static void main(String[] args) {

		var fraudService = new FraudDetectorService();
		try (var service = new KafkaService<>(FraudDetectorService.class.getSimpleName(), 
				"ECOMMERCE_NEW_ORDER",
				fraudService::parse,
				Order.class,
				Map.of())){ // new HashMap<>() ou new HashMap<String, String>()
			service.run();
		}
		
	}

	private void parse(ConsumerRecord<String, Order> record) {
		System.out.println("-------------------------------------------");
		System.out.println("Processing new order, checking for fraud");
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
			Thread.sleep(5000); // millis:5000 = 5 segundos
		} catch (InterruptedException e) {
			// ignoring
			e.printStackTrace();
		}
		// Imprime caso a ordem seja processada
		System.out.println("Order processed");
	}

}
