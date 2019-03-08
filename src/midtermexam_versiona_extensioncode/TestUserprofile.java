/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author seanw
 */
import java.util.Scanner;
public class TestUserprofile {
    
    public static void main(String args[])
    {
        //Create construture method
        UserProfile s1 = new UserProfile(); //created method with no paarminters so we are able to display the genres

        //get scanner to get user input
        Scanner in = new Scanner(System.in);
        
        //get user input name
        System.out.println("Enter your name");
        String givenID = in.nextLine();
        s1.setUserID(givenID);
        
        //UserProfile s1 = new UserProfile(givenID, givenGenre); 
        s1.displayArray();
        System.out.println("pick your favorite genre");
        
        String givenGenre = in.nextLine();
        s1.setGenre(givenGenre);
        
        //Check if the right genre was selected
        System.out.println(s1.checkGenre());
        
        System.out.println("Profile created");
        
        
        
        
    }
}
