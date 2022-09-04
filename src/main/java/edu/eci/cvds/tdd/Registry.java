package edu.eci.cvds.tdd;

import java.util.ArrayList;
import java.util.HashMap;

public class Registry {
    private HashMap<Integer, Person> idRegistred;

    public  Registry(){
        idRegistred = new HashMap<Integer, Person>();
    }
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = RegisterResult.VALID;

        if (idRegistred.containsKey(p.getId())) {
            result = RegisterResult.DUPLICATED;
        }
        if (!p.isAlive() || p.getAge() >= 100) {
            result = RegisterResult.DEAD;
        }
        if (p.getAge() <= 0) {
            result = RegisterResult.INVALID_AGE;
        }
        if (p.getAge() >= 1 && p.getAge() <= 17) {
            result = RegisterResult.UNDERAGE;
        }
        else {
            idRegistred.put(p.getId(), p);
        }
        // TODO Validate person and return real result.
        return result;
    }
}
