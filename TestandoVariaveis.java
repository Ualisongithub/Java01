package variaveis;

public class TestandoVariaveis {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 18;
		int quantidadePessoa = 3;
		if (idade >= 18) {
			System.out.println("Ok, Você tem mais que 18 anos. ");
			System.out.println("Você pode comprar bebida. ");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Você é menor porem está acompanhado, pode comprar bebida.");

			} else {
				System.out.println("você tem menos de 18 anos.");
				System.out.println("E não esta acpmpanhado!");
			}
		}
	}
}