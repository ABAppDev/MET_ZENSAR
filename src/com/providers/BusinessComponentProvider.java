package com.providers;

import com.services.AccountServices;
import com.services_impl.AccountServicesImplementation;

/**
 * Creates BusinessComponent And Provide
 */
public class BusinessComponentProvider {
    /**
     *
     * @return AccountServices
     */
    public static AccountServices provideObject(){
        return new AccountServicesImplementation();
    }

}
