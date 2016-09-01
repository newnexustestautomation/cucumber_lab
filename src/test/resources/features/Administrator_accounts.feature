#language:nl
Functionaliteit: Inloggen op de SUT

OMSCHRIJVING
============================================================================================================================================
Aanmaken, update, inloggen en verwijderen van/met een account.

Achtergrond:
Gegeven Testomgeving "LAB"

@LAB
@NEWNEXUS
@ACCOUNT

Abstract Scenario: maak een account aan

  Gegeven de SUT is gestart
  Als er een account is aangemaakt met <account> en <password>
  Dan is het <account> en het <password> zichtbaar in de database

  Voorbeelden:
  | account | password |
  | john    | 123      |
  | kees    | abc      |



Abstract Scenario: wijzig het wachtwoord het account

  Gegeven de SUT is gestart
  Gegeven <account> is aanwezig in de database
  Als het <wachtwoord> is aangepast naar <nieuwe wachtwoord>
  Dan is het <nieuwe wachtwoord> aangepast in de database

  Voorbeelden:
  | account | wachtwoord | nieuwe wachtwoord |
  | john    | 123        | 1234              |



Abstract Scenario: wijzig het account

  Gegeven de SUT is gestart
  Gegeven <account> is aanwezig in de database
  Als het <account> is aangepast naar <nieuwe account>
  Dan is het <nieuwe account> aangepast in de database

  Voorbeelden:
  | account | nieuwe account |
  | john    | johndoe        |




Abstract Scenario: log in met het account

  Gegeven de SUT is gestart
  Gegeven <account> is aanwezig in de database
  Als het <account> inlogt met <wachtwoord>
  Dan is <scherm> zichtbaar
  En is de gebruiker ingelogd

  Voorbeelden:
  | account | scherm  |
  | johndoe | checkit |



Abstract Scenario: verwijder een account

  Gegeven de database is gestart
  Gegeven <account> is aanwezig in de database
  Als het <account> is verwijderd
  Dan kan <account> niet meer inloggen
  En verschijnt er een <foutmelding>

  Voorbeelden:
  | account | foutmelding|
  | johndoe | account niet bekend |