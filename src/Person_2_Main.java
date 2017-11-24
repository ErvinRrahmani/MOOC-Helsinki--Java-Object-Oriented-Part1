/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ervin
 */
public class Person_2_Main {
    
    public static void main(String [] args)
    {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");
        Person juhana = new Person("Juhana");
        
        for(int i = 0; i < 30; i++)
        {
            pekka.becomeOlder();
            juhana.becomeOlder();
        }
    }
    
    public static void reportMaturity(Person person)
    {
        if(person.isAdult())
        {
            System.out.println(person.getName() + " is an adult");
        }else
        {
            System.out.println(person.getName() + " is a minor");
        }
            
    }
    
}
