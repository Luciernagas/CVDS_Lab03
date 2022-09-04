package edu.eci.cvds.tdd;

import java.util.ArrayList;

public class Registry {
    RegisterResult result;
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        if (p.getAge() <= 0) {
            result = RegisterResult.INVALID_AGE;
        }
        if (p.getAge() >= 1 && p.getAge() <= 17) {
            result = RegisterResult.UNDERAGE;
        }
        if (p.getAge() >= 18 && p.getAge() <= 99) {
            result = RegisterResult.VALID;
        }
        if (!p.isAlive() || p.getAge() >= 100) {
            result = RegisterResult.DEAD;
        }
        return result;
    }
}
