import java.util.Scanner;

public class consecionaria {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	modelos car = new modelos();
	
	System.out.println("BEM VINDO AO PORTAL SDG!!!!");
	System.out.println("Qual seu nome?");
	car.nome = scan.nextLine();
	System.out.println("Ola " + car.nome + ", temos estas marcas em nossa loja, qual marca de carro voce tem interesse?" );
	System.out.println(car.marca1);
	System.out.println(car.marca2);
	System.out.println(car.marca3);
	car.marcas = scan.nextLine();
	car.marcasdecarro();
	car.modelos = scan.nextLine();
	car.models();
	
	
	
	
	

	}

}
