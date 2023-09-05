public class Matrizes {
	public static void main(String[] args) {

		int[][] matriz = { { -1, 2, 5 }, { 0, 1, -4 }, { 3, -2, 7 } };

		int diagonalPrincipal = 1, soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				diagonalPrincipal = diagonalPrincipal * matriz[i][j];
			}
			soma = soma + diagonalPrincipal;
		}
		System.out.println(soma);
	}
}
