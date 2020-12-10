
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
        int x = 0,op,numero;
        
        
        for(int i=0;i<20;i++){
            raiz.insere(i);
        }
        System.out.println("Baleia - 1");
        System.out.println("Cachorro - 2");
        System.out.println("Cavalo - 3");
        System.out.println("Cobra - 4");
        System.out.println("Coelho - 5");
        System.out.println("Coruja - 6");
        System.out.println("Elefante - 7");
        System.out.println("Gato - 8");
        System.out.println("Leão - 9");
        System.out.println("Lobo - 10");
        System.out.println("Macaco - 11");
        System.out.println("Onça - 12");
        System.out.println("Passaro - 13");
        System.out.println("Peixe - 14");
        System.out.println("Porco - 15");
        System.out.println("Tartaruga - 16");
        System.out.println("Tigre - 17");
        System.out.println("Tubarão -18");
        System.out.println("Urso -19");
        System.out.println("Vaca - 20");

        
        do{
			System.out.println("== MENU DE OPCOES ==");
			System.out.println("1 - Buscar");
			System.out.println("2 - Imprimir em Em Ordem");
			System.out.println("3 - Excluir");
			System.out.println("4 - Sair");
			System.out.println("== DIGITE UMA OPCAO ==");
			
			op = entrada.nextInt();
			
			if (op < 1 || op > 4){
				System.out.println("OPCAO INVALIDA");
			}
			if (op == 1){
				System.out.println("Digite um numero");
				numero = entrada.nextInt();
				raiz.busca(numero);
                                x=numero;
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
                        if (op == 2){
                            raiz.getOrdem();
                        }
                        if (op == 3){
                            System.out.println("Digite um numero");
				numero = entrada.nextInt();
                            raiz.excluir(numero);
                        }
        
        }
        }
}
        

        
   
        
