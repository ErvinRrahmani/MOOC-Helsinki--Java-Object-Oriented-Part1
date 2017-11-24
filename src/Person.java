/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ervin
 */
public class Person {
    
    private String name;
    private int age;
    
    public Person(String name)
    {
        this.age = 0;
        this.name = name;
    }
    
    public boolean isAdult()
    {
        if( this.age < 18)
        {
            return false;
        }
        return true;
    }
    
    public void becomeOlder()
    {
        this.age++;
    }
    
    public String getName()
    {
        return this.name;
    }
    
   
    
}
