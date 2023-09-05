
public class Vetores3dimensao {

	public static void main(String[] args) {
		
		 int[][] matriz = {{-1, 2, 5},{0, 1, -4},{3, -2, 7}};
		 
		 int A1, A2, A3, J1, J2, J3, somaA, somaJ, subtrai; 
		 A1 = matriz[0][1] * matriz[1][2] * matriz[2][0];
		 A2 = matriz[0][0] * matriz[1][1] * matriz[2][2];
		 A3 = matriz[1][0] * matriz[2][1] * matriz[0][2];
		 
		 J1 = matriz[1][0] * matriz[0][1] * matriz[2][2];
		 J2 = matriz[2][0] * matriz[1][1] * matriz[0][2];
		 J3 = matriz[0][0] * matriz[2][1] * matriz[1][2];
		 
		 somaA = A1 + A2 + A3;
		 somaJ = J1 + J2 + J3;
		 
		 subtrai = somaA - somaJ;
		 
		 System.out.print("Determinante da matriz A = " + subtrai);
	}
}
