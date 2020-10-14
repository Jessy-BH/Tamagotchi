package tamagotchi;

import java.util.Scanner;

public class MainScriptTamagotchi {

	public static void main(String[] args) {
		Tamagotchi myTamagotchi = new Tamagotchi("nom", "couleur", 1000, "type");
		Scanner myTamagotchiType = new Scanner(System.in);
		System.out.println("Choisir animal : Lapin / Chien / Dragon");
		String type = myTamagotchiType.nextLine();
		
		if (type.equals("Dragon")) {
			
			System.out.println("Vous avez choisi un Dragon");
			
		}else if (type.equals("Chien")) {
			
			System.out.println("Vous avez choisi un Chien");
			
		}else if (type.equals("Lapin")) {
			
			System.out.println("Vous avez choisi un Lapin");
		}else {
			
		}
		
			Scanner myTamagotchiColor = new Scanner(System.in);
			System.out.println("Choisir la couleur de votre " + type);
			String color = myTamagotchiColor.nextLine();
			System.out.println("La couleur de votre " + type + " est " + color);
			
			Scanner myTamagotchiActions = new Scanner(System.in);
			System.out.println("Choississez une action : \n1 : manger \n2 : "
					+ "aller aux toilettes \n3 : se teindre les cheveux \n"
					+ "4 : se reposer \n5 : se reproduire \n6 : exprimer son humeur \n"
					+ "7 : voir ses amis " + type + "\n8 : faire du sport \n9 : se laver \n10 : fumer \n11 : mourir");
			
			String action = myTamagotchiActions.nextLine();
			
			if (action.equals("1")) {
				
				System.out.println("Votre " + type + " a bien mangé, il gagne de la vie.");
				
			}else if (action.equals("2")) {
				
				System.out.println("Votre " + type + " est allé aux toilettes, il gagne de la vie.");
				
			}else if (action.equals("3")) {
				
				System.out.println("Votre " + type + " est maintenant roux.");
				
			}else if (action.equals("4")) {
				
				System.out.println("Votre " + type + " se repose, il gagne de la vie.");
				
			}else if (action.equals("5")) {
				
				System.out.println("Votre " + type + " se reproduit, il gagne de la vie (et un enfant).");
				
			}else if (action.equals("6")) {
				
				System.out.println("Votre " + type + " est content !");
				
			}else if (action.equals("7")) {
				
				System.out.println("Votre " + type + " entretient sa vie sociale.");
				
			}else if (action.equals("8")) {
				
				System.out.println("Votre " + type + " va à la salle, il gagne de la vie.");
				
			}else if (action.equals("9")) {
				
				System.out.println("Votre " + type + " se lave, il gagne de la vie.");
				
			}else if (action.equals("10")) {
				
				System.out.println("Votre " + type + " fume, il a maintenant un cancer.");
				
			}else if (action.equals("11")) {
				
				System.out.println("Votre " + type + " est mort.");
				
			}
	}
}