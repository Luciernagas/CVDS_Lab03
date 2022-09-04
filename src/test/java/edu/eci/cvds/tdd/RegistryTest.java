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
    public void dada_unaPersona_que_tieneTreintaAños_Entonces_retorna_VALID(){
        //Arrange
        Person person = new Person("Edgar", 1004567889, 30,Gender.MALE,true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void dada_unaPersona_que_noEstaViva_Entonces_retorna_DEAD(){
        //Arrange
        Person person = new Person("Angela", 1234567899, 100,Gender.FEMALE,false);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void dada_unaPersona_que_tieneCeroAños_Entonces_retorna_INVALID_AGE(){
        //Arrange
        Person person = new Person("Fernando", 1234567898, 0,Gender.MALE,true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    //@Test
   // public void dada_unaPersona_que_yaSeRegristro_Entonces_retorna_DUPLICATE(){
        //Arrange
     //   Person person = new Person("Edgar", 1004567889, 30,Gender.MALE,true);
        //Action
       // RegisterResult result = registry.registerVoter(person);
        //Assertion
        //Assert.assertEquals(RegisterResult.DUPLICATED, result);
    //}

}