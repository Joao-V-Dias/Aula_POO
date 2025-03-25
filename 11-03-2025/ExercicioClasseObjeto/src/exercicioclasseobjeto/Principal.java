package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        System.out.println("Conversao");
        Conversao temperatura = new Conversao();
        temperatura.setTemperatura(3);
        double celsius = temperatura.calcularTemperatura();
        System.out.printf("A temperatura %.2f Fahrenheit convertida em Celsius %.2f\n", temperatura.getTemperatura(), celsius);
        System.out.println("**********************************************\n");
        
        System.out.println("Fatorial");
        Fatorial numFat = new Fatorial();
        numFat.setNumero(5);
        int fatorial = numFat.calcularFatorial();
        System.out.println("Fatorial de " + numFat.getNumero() + ": " + fatorial);
        System.out.println("**********************************************\n");
        
        System.out.println("Primo");
        NumeroPrimo numPri = new NumeroPrimo();
        numPri.setNumero(97);
        String primo = numPri.verificarPrimo();
        System.out.println("O numero " + numPri.getPrimo() + " e primo: " + primo);
        System.out.println("**********************************************\n");

        System.out.println("Somar Digitos");
        SomaDigitos numSoma = new SomaDigitos();
        numSoma.setNumero(76);
        int soma = numSoma.somarDigitos();
        System.out.println("A soma dos algarismos de " + numSoma.getNumero()
                + ": " + soma);
        
        /*
        Teste todas as classes desse projeto
        Crie um objeto de cada classe e teste todos os métodos
        */
    }
    
}
