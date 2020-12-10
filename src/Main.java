
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Main {
    
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
		
		Arvore raiz = new Arvore();
        int x=0,op,numero;
        
        
        for(int i=0;i<20;i++){
            raiz.insere(i);
        }
        do{
			System.out.println("== MENU DE OPCOES ==");
			System.out.println("1 - Buscar");
			System.out.println("2 - Imprimir em Pre Ordem");
			System.out.println("3 - Imprimir em Em Ordem");
			System.out.println("4 - Imprimir em Pos Ordem");
			System.out.println("5 - Sair");
			System.out.println("== DIGITE UMA OPCAO ==");
			
			op = entrada.nextInt();
			
			if (op < 1 || op >= 5){
				System.out.println("OPCAO INVALIDA");
			}
			if (op == 1){
				System.out.println("Digite um numero");
				numero = entrada.nextInt();
				raiz.inserir(numero);
				System.out.println("Inserido");
				
			}
        if (x==1){
        Baleia b = new Baleia();
        b.setVisible(true);
        }
        if (x==2){
        Cachorro b = new Cachorro();
        b.setVisible(true);
        }
        if (x==3){
        Cavalo b = new Cavalo();
        b.setVisible(true);
        }
        if (x==4){
        Cobra b = new Cobra();
        b.setVisible(true);
        }
        if (x==5){
        Coelho b = new Coelho();
        b.setVisible(true);
        }
        if (x==6){
        Coruja b = new Coruja();
        b.setVisible(true);
        }
        if (x==7){
        Elefante b = new Elefante();
        b.setVisible(true);
        }
        if (x==8){
        Gato b = new Gato();
        b.setVisible(true);
        }
        if (x==9){
        Leão b = new Leão();
        b.setVisible(true);
        }
        if (x==10){
        Lobo b = new Lobo();
        b.setVisible(true);
        }
        if (x==11){
        Macaco b = new Macaco();
        b.setVisible(true);
        }
        if (x==12){
        Onça b = new Onça();
        b.setVisible(true);
        }
        if (x==13){
        Passaro b = new Passaro();
        b.setVisible(true);
        }
        if (x==14){
        Peixe b = new Peixe();
        b.setVisible(true);
        }
        if (x==15){
        Porco b = new Porco();
        b.setVisible(true);
        }
        if (x==16){
        Tartaruga b = new Tartaruga();
        b.setVisible(true);
        }
        if (x==17){
        Tigre b = new Tigre();
        b.setVisible(true);
        }
        if (x==18){
        Tubarão b = new Tubarão();
        b.setVisible(true);
        }
        if (x==19){
        Urso b = new Urso();
        b.setVisible(true);
        }
        if (x==20){
        Vaca b = new Vaca();
        b.setVisible(true);
        }
    }
}
