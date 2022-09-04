package edu.eci.cvds.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    // TODO Complete with more test cases
    public void dada_unaPersona_que_tieneQuinceAños_Entonces_retorna_Underage(){
        //Arrange
        Person person = new Person("Mery", 1234567890, 15,Gender.FEMALE,true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void dada_unaPersona_que_tieneVeinteAños_Entonces_retorna_VALID(){
        //Arrange
        Person person = new Person("Edgar", 1234567890, 19,Gender.MALE,true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.VALID, result);
    }



}