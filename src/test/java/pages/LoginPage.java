package pages;

import helper.Endpoint;

public class LoginPage {

    String setURL;

    public String prepareURL(String url) {
        switch (url) {
            case "Website_souce_demo":
                setURL = Endpoint.Website_souce_demo;
                break;
            default:
                System.out.println("URL ready ");
        }
        System.out.println("URL ready " + setURL);
        return setURL;


    }
}
