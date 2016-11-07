package PhraseInversee;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String phraseSaisie;
       
		
        Scanner sc=new Scanner(System.in);
        
		System.out.println("Rentrez la phrase à inverser");

		phraseSaisie=sc.nextLine();//exemple de phrase : le chat tombe
		
		String tabPhraseSaisie[]=phraseSaisie.split(" ");// remplissage d'un tableau de type String dont la taille correspond au nombre de mot de la phrase
	
		 char[] tabcar ;//création d'un tableau de type char qui contiendra chaque lettre des mots présent dans le tableau tabPhraseSaisie
	     char tmp = ' ';
	     String phraseFinale ="";
		
		for(int j =0; j<tabPhraseSaisie.length; j++)//on parcours le tableau String tabPhraseSaisie
		{
			tabcar=tabPhraseSaisie[j].toCharArray();//création d'un tableau de type char qui contiendra chaque lettre des mots présent dans le tableau tabPhraseSaisie
													//par exemple pour j=0(première case du tableau de string qui contient "le"), la taille de tabCar sera 2 et tabCar[0]='l', tabcar[1]='e'
			
			
			for (int i =0; i<=tabcar.length-2; i++)// pour chaque lettre on permute l'indice et la valeur
			{
			tmp=tabcar[i];//pour i =0,tmp=tabcar[0] donc 'l'
			tabcar[i]=tabcar[i+1];//tabcar[0]=tabcar[1] donc 'e'
			tabcar[i+1]=tmp;//tabcar[1] prend la valeur de tmp c'est à dire 'l'
			
			}
			
			for (int i =0; i<=tabcar.length-1; i++)
			{
				
				phraseFinale=new String(tabcar);//String(char[]) est une fonction de String qui permet d'afficher une chaine de caractère à partir d'un tableau de type char
				
				
			}
			
			System.out.println(phraseFinale + " ");// on affiche les mots permutés
		}
		
		
		
		
	
		
		}
	
	
	
	
	
	
	
	
	}


