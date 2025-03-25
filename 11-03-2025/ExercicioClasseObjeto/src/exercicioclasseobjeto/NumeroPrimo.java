package exercicioclasseobjeto;

/*
Escreva um programa que leia um número inteiro positivo e verifique se ele é 
um número primo. Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.
*/
public class NumeroPrimo 
{   
    private int numero;
    
    public int getPrimo() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = 1;
        if(numero > 0) this.numero = numero;
    }
    
    public String verificarPrimo(){
        /*Ignora o numero 1 e o proprio numero primo 
        * pois em todos os casos serao divisiveis por ambos
        */
        for(int i = 2 ; i < numero ; i++){
            if(numero % i == 0) return "Nao";
        }
        return "Sim";
    }
    
    /*essa classe recebe um número inteiro;
        implemente getters e setters;
        implemente o método que calcule o pedido no enunciado;
        valide no setter do atributo se ele é maior que zero
    */

}
