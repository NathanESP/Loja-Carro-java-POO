public class modelos {
    String nome;
    String modelos;
    String marcas;
    String marca1 = "FIAT";
    String marca2 = "HONDA";
    String marca3 = "VOLKS";
    String modelosFIAT1 = "PALIO";
    String modelosFIAT2 = "TORO";
    String modelosFIAT3 = "ARGO";
    String modelosHONDA1 = "CITY";
    String modelosHONDA2 = "CIVIC";
    String modelosHONDA3 = "FIT";
    String modelosVOLKS1 = "POLO";
    String modelosVOLKS2 = "JETTA";
    String modelosVOLKS3 = "GOLF";
    
    void marcasdecarro() {
    	if(marcas.equalsIgnoreCase(marca1)) {
    		System.out.println("Uma otima escolha " + nome + " temos todos estes modelos disponiveis em nosso estoque, qual voce se interessou mais?");
    		System.out.println(modelosFIAT1);
    		System.out.println(modelosFIAT2);
    		System.out.println(modelosFIAT3);
    	}
    	else if(marcas.equalsIgnoreCase(marca2)) {
    		System.out.println("Uma otima escolha " + nome + " temos todos estes modelos disponiveis em nosso estoque, qual voce se interessou mais?");
    		System.out.println(modelosHONDA1);
    		System.out.println(modelosHONDA2);
    		System.out.println(modelosHONDA3);
    	}
    	else if(marcas.equalsIgnoreCase(marca3)) {
    		System.out.println("Uma otima escolha " + nome + " temos todos estes modelos disponiveis em nosso estoque, qual voce se interessou mais?");
    		System.out.println(modelosVOLKS1);
    		System.out.println(modelosVOLKS2);
    		System.out.println(modelosVOLKS3);}
    	}
    	
    	void models() {
    		 
    		 if(modelos.equalsIgnoreCase(modelosFIAT1)) {
    			System.out.println("O palio eh uma otima escolhe, um carro com um otimo design e preparado para seu conforto e seu dia a dia e viagens, com um otimo motor economico. Custando apenas R$39.900");
    		}
    		else if(modelos.equalsIgnoreCase(modelosFIAT2)) {
    			System.out.println("A Toro eh um otimo carro para tudo, servicos pesados,\n conforto, viagens, seu motor que aguenta tudo. Seu 4x4 que sobe qualquer coisa. Seu valor custa em media R$79.990,00.");
    	   		}
    		else if(modelos.equalsIgnoreCase(modelosFIAT3)) {
    			System.out.println("O argo eh um modelo da FIAT da de lancamento muito recente com seu estilo Hat, e seu painel de ultima geracao.");	
         	}	
    		
    	    else if(modelos.equalsIgnoreCase(modelosHONDA1)) {
    			System.out.println("O Honda City com seu design inovador, um carro que foi feita para durar muito,\n seu motor potente chegando ate a 2.0 e 126 cavalos. Esta custando a partir de R$117.990,00 com varias configuracoes.");
    		}
    		else if(modelos.equalsIgnoreCase(modelosHONDA2)) {
    			System.out.println("O Honda Civic é um sedan compacto popular que oferece um equilíbrio entre desempenho,\n economia de combustível, conforto e tecnologia avançada. É um carro confiável e valorizado pelos consumidores. Esta custando apartir de R$249.990,00.");	
    		}
    		else if(modelos.equalsIgnoreCase(modelosHONDA3)) {
    			System.out.println("O Honda Fit é um carro compacto e versátil,\n que oferece uma combinação de conforto, praticidade e economia de combustível. Seu design moderno, motor potente e recursos de segurança fazem dele uma escolha popular entre os consumidores.Esta custando apartir de R$75.000,00 variando em configuracoes.");
    		}
    		else if(modelos.equalsIgnoreCase(modelosVOLKS1)) {
    			System.out.println("O Volkswagen Polo é um carro versátil e atraente, adequado tanto para uso urbano quanto para viagens mais longas. \n Com sua reputação de confiabilidade e qualidade, o Polo continua sendo uma escolha popular entre os compradores de carros compactos.Esta custando apartir de R$107.500,00 variando em muitas configuracoes.");
    		}
    		else if(modelos.equalsIgnoreCase(modelosVOLKS2)) {
    			System.out.println("o Volkswagen Jetta é um sedan compacto confiável e elegante que oferece um bom desempenho, conforto e tecnologia avançada. É uma opção popular para aqueles que procuram um carro versátil e de qualidade.Esta custando a partir R$230.000,00 \n e o valor varia dependendo das versoes");
    		}
    		else if(modelos.equalsIgnoreCase(modelosVOLKS3)) {
    			System.out.println("O Volkswagen Golf é um veículo de categoria média a alta, conhecido por seu design esportivo,\n qualidade de construção e tecnologia embarcada. Ele oferece uma lista de equipamentos de série e opcionais, dependendo da versão escolhida.Esta custando a partir de R$159.990,00. Valores variando por suas versoes");
    		}
    		 
   		    else {
    		    System.out.println("Nao temos este modelo, vamos da uma olhada em outros.");}	
    		
    	    }
    		

    		
    	
    	
    	
    		
    
    
  
	
	
}
