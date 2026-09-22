public class q11 {
    public static void main(String[] args) {
        double[] V = {2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0, u=10.0, 10.0}; // Exemplo
        double soma = 0;
        int n = V.length;
        
        for (double val : V) soma += val;
        double m = soma / n;
        
        double somaDiferencas = 0;
        for (double val : V) {
            somaDiferencas += Math.pow(val - m, 2);
        }
        
        double desvioPadrao = Math.sqrt(somaDiferencas / (n - 1));
        System.out.println("Média: " + m);
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }
}