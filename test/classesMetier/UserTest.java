/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

import junit.framework.TestCase;

/**
 *
 * @author Nenette
 */
public class UserTest extends TestCase {
    
    public UserTest(String testName) {
        super(testName);
    }

    public void testUser() {
        
        User unUser = new User("Anna", "Anna77");
        
        //test avec un User
        assertEquals("Anna", unUser.getLogin());
        assertEquals("Anna77", unUser.getPwd());

    }
}
