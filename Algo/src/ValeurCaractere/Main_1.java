package ValeurCaractere;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner (System.in);
		
		
		
		String nbBinaire;
		char nbBinaireCaractere;
		int valeurNbBinaire;
		double nbDecimal ;
		char caractereDecimal;
		boolean stop=true;
		
	
	while(stop)
	{
	System.out.println("Entrez le nombre binaire cod� en 8bits que vous souhaitez convertir en d�cimal (tapez 2 pour arr�ter la saisie)");
	
	nbBinaire=sc.nextLine();
	
		if(Integer.parseInt(nbBinaire)==2)//si la valeur int de l'entr�e clavier est �gale � 2 alors on stop la saisie
		
			{
				stop=false;
				System.out.println("la saisie est arr�t�e");
			}
		else
			{
			
				if(nbBinaire.length()==8)// si la taille de la valeur entr�e est �gal � 8 alors on peut executer le programme
					{	
	
	
						int tabValeurBinaire[]=new int[nbBinaire.length()];// cr�ation d'un tableau de int de la taille de la chaine de caract�re saisie
	
						caractereDecimal=' ';
						nbDecimal = 0;
						
						// En binaire, "00000001" par exemple, le 1 est �gal � 2^0 et on remonte jusqu'� 2^7
						//En classant chaque caract�re dans un tableu, le 1 sera � l'indice 7 du tableau, or je veux me servir de l'indice comme exposant
						//pour calculer le d�cimal, je veux donc que pour le 1 mon indice soit �gal � 0
						
						for (int i =nbBinaire.length()-1; i>=0; i--)// ici on affecte l'indice 7 au lieu de 0 comme  premier indice du tableau 
							{
		
								nbBinaireCaractere=nbBinaire.charAt((i-(nbBinaire.length()-1))*-1);//ici i-(nbBinaire.length()-1)*-1, pour l'indice du tableau i=7, on rentre comme valeur le caract�re se trouvant � (7-7)*-1 )=0
								//pour l'indice du tableau i=6, on rentre comme valeur le caract�re se trouvant � (6-7)*-1 )=1
								
								
								
								valeurNbBinaire= (int)nbBinaireCaractere;
								tabValeurBinaire[i]=valeurNbBinaire;
		
								if (tabValeurBinaire[i]==49)
									{
										nbDecimal=nbDecimal+1*Math.pow(2, i);
									}
		
								caractereDecimal=(char)nbDecimal;
		
							}
	
	
	
						System.out.println(nbDecimal);
						System.out.println(caractereDecimal);
	
					}
				else//sinon il y a une erreur de saisie
					{
						System.out.println("il y a une erreur de saisie");
		
					}
	
	}
	}
	
	}

}
