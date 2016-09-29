#language:nl
Functionaliteit: Inloggen op de SUT

OMSCHRIJVING
============================================================================================================================================
Aanmaken, update, inloggen en verwijderen van/met een account.

Achtergrond:

@LAB
@NEWNEXUS
@ACCOUNT

Abstract Scenario: 1. maak een account aan

  Gegeven marvins movie store is opgestart
  Als er een account wordt aangemaakt met "<account>" en "<password>"
  Dan is het "<account>" zichtbaar in de database

  Voorbeelden:
  | account            | password |
  | john@hotmail.com   | 123456      |
  | kees@gmail.com     | abcdef      |



  Abstract Scenario: 2 Controleer foutief password melding

    Gegeven marvins movie store is opgestart
    Als er een account wordt aangemaakt met "<account>" en "<password>"
    Dan wordt een foutmelding "<foutmelding 1>" getoond

    Voorbeelden:
      | account            | password    | foutmelding 1         |
      | john@hotmail.com   | 123456      | Passwords must be     |
      | kees@gmail.com     | abcdef      | Passwords must be     |



  Abstract Scenario: 3 Controleer overzicht

    Gegeven marvins movie store is opgestart
    En er wordt ingelogd met "test@test.nl" en "Test01!"
    #Als een film is aangemaakt met <title>, <director> en <DateReleased> // db query
    Dan zijn de "<title>", "<director>" en zichtbaar in het filmoverzicht

    Voorbeelden:
      | title            | director  | DateReleased           |
      | Star Wars 223434 | Lucas     | 01-01-1999 12:00:00 AM |
      | Friday           | IceCube   | 01-01-1977 12:00:00 AM |
      | Pulp Fiction     | Tarentino | 01-01-1977 12:00:00 AM |


  Abstract Scenario: 4. Maak een film aan

    Gegeven marvins movie store is opgestart
    En er wordt ingelogd met "test@test.nl" en "Test01!"
    Als een film wordt aangemaakt met "<title>", "<director>" en "<DateReleased>"
    Dan zijn de "<title>", "<director>" opgenomen in de database
    En zijn de "<title>", "<director>" en zichtbaar in het filmoverzicht

    Voorbeelden:
      | title            | director  | DateReleased           |
     # | Star Wars 223434 | Lucas     | 01-01-1999 12:00:00 AM |
      | Friday part 32    | IceCube   | 01-01-1977 12:00:00 AM |
     # | Pulp Fiction     | Tarentino | 01-01-1977 12:00:00 AM |



  Abstract Scenario: 5. Wijzig een film

    Gegeven marvins movie store is opgestart
    En er wordt ingelogd met "test@test.nl" en "Test01!"
    En film met titel "<title>" wordt geselecteerd in het filmoverzicht
    #Als een film wordt aangemaakt met "<title>", "<director>" en "<DateReleased>"
    #Dan zijn de "<title>", "<director>" en zichtbaar in het filmoverzicht

    Voorbeelden:
      | title            | director  | DateReleased           |
     # | Star Wars 223434 | Lucas     | 01-01-1999 12:00:00 AM |
      | Friday part 2    | IceCube   | 01-01-1977 12:00:00 AM |
     # | Pulp Fiction     | Tarentino | 01-01-1977 12:00:00 AM |
