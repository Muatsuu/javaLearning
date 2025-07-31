public class Arrays {
    public static boolean buscarFrutas(String[] frutas, String fruta){
        for (String nomes : frutas) {
            if (nomes.equals(fruta)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        double soma = 0;
        double[] notas = {5.6, 7.8, 5.0, 3.0, 2.5};
        for ( double nota : notas) {
            soma = soma + nota;
        }
        double media = soma / notas.length;
        System.out.println(media);

        String[] frutas = {"Maçã","Banana", "Morango", "Uva", "Abacaxi"};
        System.out.println(buscarFrutas(frutas, "Pera"));
    }
}