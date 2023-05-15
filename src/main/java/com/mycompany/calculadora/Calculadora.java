
package com.mycompany.calculadora;
import java.util.Scanner;
public class Calculadora {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double N1;
        double N2;
        int opção;
        do{
            Imprimir("--- Calculadora ---");
            Imprimir("Digite uma das opção: ");
            Imprimir("[1]Soma\n[2]multiplicação\n[3]subtração\n[4]divisão");
            opção = input.nextInt();
        
        if(opção <1|| opção>4){
            Imprimir("Número inválido, digite um número de 1 a 4");
            continue;
        }
        
        }while(opção<1 || opção >4);          
        
        Imprimir("Digite o primeiro numero:");
            N1 = input.nextDouble();
        Imprimir("Digite o segundo numero:");
            N2 = input.nextDouble();
        
        
        
        switch(opção){
            case 1:
                System.out.println("O resultado da soma é " + soma(N1,N2));
                break;
                
            case 2:
                System.out.println("O resultado da multiplicação é " + multiplicacao(N1,N2));
                break;
                
            case 3:
                System.out.println("O resultado da subtração è " + subtracao(N1,N2));
                break;
                
            case 4:
                System.out.println("O resultado da divisão è " + divisao(N1,N2));
                break;
        }
        
    }
    static double soma(double N1, double N2){
        return N1+N2;
    }
    static double multiplicacao(double N1, double N2){
        return N1*N2;
    }
    static double subtracao(double N1, double N2){
        return N1-N2;
    }
    static double divisao(double N1, double N2){
        return N1/N2;
    }
    public static void Imprimir(String mensagem){
        System.out.println(mensagem);
    }
}
