package co.com.utest.web.alexandralozanoimmigrationlaw.exceptions;

import static co.com.utest.web.alexandralozanoimmigrationlaw.utils.Constans.EXCEPTION;

public class Excepcion extends AssertionError{

    public Excepcion(String message, Throwable cause) {
        super(EXCEPTION);
    }
}
