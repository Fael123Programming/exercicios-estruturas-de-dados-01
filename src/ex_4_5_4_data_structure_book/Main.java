package ex_4_5_4_data_structure_book;

import _dynamic_deck.DynamicDeck;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        DynamicDeck people = new DynamicDeck () ;
        String name ;
        int nextToRemove , quantityOfPeople , number , counter ;
        System.out.print ( "How many people do you want to add?: " );
        quantityOfPeople = input.nextInt ();
        for ( counter = 0 ; counter < quantityOfPeople ; counter ++ ) {
            System.out.print( "Person (" + ( counter + 1 )  + ") -> Name: " );
            name = input.next ();
            System.out.print( "Person ("+ ( counter + 1 ) + ") -> Number: " );
            number = input.nextInt ();
            people.addEnd ( new Person ( name , number ) );
        }
        System.out.print("Next to remove: ");
        nextToRemove = input.nextInt ();
        System.out.print ( "List of people that are being removed: " ) ;
        Person temporary;
        while ( !people.isEmpty () ) {
            while ( nextToRemove > 1 ) {
                people.addEnd ( people.removeBeginning() );
                nextToRemove --;
            }
            temporary = (Person) people.removeBeginning();
            if ( people.size () > 0 ) System.out.print(temporary.getName() + ",");
            else System.out.print (temporary.getName());
            nextToRemove = temporary.getNumber();
        }
    }
}
