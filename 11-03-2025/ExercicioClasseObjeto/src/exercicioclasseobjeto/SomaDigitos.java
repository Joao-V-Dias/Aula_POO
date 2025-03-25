package exercicioclasseobjeto;

/**
 *
 * @author Ligia
 */
public class SomaDigitos {
    
    private int numero;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = 10;
        if(numero > 10) this.numero = numero;
    }

    public int somarDigitos(){
        int soma = 0;
        int num = numero;

        while(num > 0){
            soma += num % 10;
            num = num / 10;
        }

        return soma;
    }
    
    
    
    //Receba um numero inteiro maior ou igual a dez e soma o seus digitos

}
