package nl.newnexus.lab.adapters;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.nl.Als;
import cucumber.api.java.nl.Dan;
import cucumber.api.java.nl.En;
import cucumber.api.java.nl.Gegeven;
import nl.newnexus.lab.framework.ParentScenario;

/**
 * Created by robertvanbuiten on 01-09-16.
 */
public class StepDefinitions extends ParentScenario{

    @Before
    public void beforeScenario() {
        startBrowser();
    }

    @After
    public void afterScenario() {
        closeBrowser();
    }


    @Gegeven("^een voorbeeld$")
    public void eenVoorbeeld() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^Testomgeving \"([^\"]*)\"$")
    public void testomgeving(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^de SUT is gestart$")
    public void deSUTIsGestart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^er een account is aangemaakt met <account> en <password>$")
    public void erEenAccountIsAangemaaktMetAccountEnPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^is het <account> en het <password> zichtbaar in de database$")
    public void isHetAccountEnHetPasswordZichtbaarInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^<account> is aanwezig in de database$")
    public void accountIsAanwezigInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^het <wachtwoord> is aangepast naar <nieuwe wachtwoord>$")
    public void hetWachtwoordIsAangepastNaarNieuweWachtwoord() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^is het <nieuwe wachtwoord> aangepast in de database$")
    public void isHetNieuweWachtwoordAangepastInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^het <account> inlogt met <wachtwoord>$")
    public void hetAccountInlogtMetWachtwoord() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^is <scherm> zichtbaar$")
    public void isSchermZichtbaar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @En("^is de gebruiker ingelogd$")
    public void isDeGebruikerIngelogd() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^de database is gestart$")
    public void deDatabaseIsGestart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^het <account> is verwijderd$")
    public void hetAccountIsVerwijderd() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^kan <account> niet meer inloggen$")
    public void kanAccountNietMeerInloggen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @En("^verschijnt er een <foutmelding>$")
    public void verschijntErEenFoutmelding() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^een film is aangemaakt met <title>, <director> en <DateReleased>$")
    public void eenFilmIsAangemaaktMetTitleDirectorEnDateReleased() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^zijn de <title>, <director> en <DateReleased> zichtbaar in het filmoverzicht$")
    public void zijnDeTitleDirectorEnDateReleasedZichtbaarInHetFilmoverzicht() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^dat de <title> zichtbaar is in het filmoverzicht$")
    public void datDeTitleZichtbaarIsInHetFilmoverzicht() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^dat de <title> aanwezig is in de database$")
    public void datDeTitleAanwezigIsInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^de <title> is aangepast naar <nieuwe title>$")
    public void deTitleIsAangepastNaarNieuweTitle() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^is de <nieuwe title> zichtbaar in het filmoverzicht$")
    public void isDeNieuweTitleZichtbaarInHetFilmoverzicht() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @En("^is de <nieuwe title> aangepast in de database$")
    public void isDeNieuweTitleAangepastInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gegeven("^<title> is aanwezig in de database$")
    public void titleIsAanwezigInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @En("^is het <nieuwe DateReleased> aangepast in de database$")
    public void isHetNieuweDateReleasedAangepastInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^is de <foutmelding> zichtbaar$")
    public void isDeFoutmeldingZichtbaar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @En("^zijn er geen aanpassingen gedaan$")
    public void zijnErGeenAanpassingenGedaan() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Als("^de film met de <title> is verwijderd uit het filmoverzicht$")
    public void deFilmMetDeTitleIsVerwijderdUitHetFilmoverzicht() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Dan("^is de <title> niet meer zichtbaar in het filmoverzicht$")
    public void isDeTitleNietMeerZichtbaarInHetFilmoverzicht() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @En("^is de <title> niet meer aanwezig in de database$")
    public void isDeTitleNietMeerAanwezigInDeDatabase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
