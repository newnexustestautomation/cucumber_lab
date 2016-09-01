#language:nl
Functionaliteit: Inloggen op de SUT

  OMSCHRIJVING
  =======================================================================================================================================
  Aanmaken, update, verwijderen van een film.

  Achtergrond:
    Gegeven Testomgeving "LAB"

  @LAB
  @NEWNEXUS
  @ACCOUNT

  Abstract Scenario: maak een film aan

    Gegeven de SUT is gestart
    Als een film is aangemaakt met <title>, <director> en <DateReleased>
    Dan zijn de <title>, <director> en <DateReleased> zichtbaar in het filmoverzicht
  EN zijn de gegevens aanwezig in de database

    Voorbeelden:
      | title            | director  | DateReleased           |
      | Star Wars 223424 | Lucas     | 01-01-1999 12:00:00 AM |
      | Friday           | IceCube   | 01-01-1977 12:00:00 AM |
      | Pulp Fiction     | Tarentino | 01-01-1977 12:00:00 AM |


  Abstract Scenario: wijzig de gegevens van de film

    Gegeven de SUT is gestart
    Gegeven dat de <title> zichtbaar is in het filmoverzicht
    Gegeven dat de <title> aanwezig is in de database
    Als de <title> is aangepast naar <nieuwe title>
    Dan is de <nieuwe title> zichtbaar in het filmoverzicht
    En is de <nieuwe title> aangepast in de database

    Voorbeelden:
      | title            | nieuwe title                   |
      | Star Wars 223424 | Star Wars - The Phantom Menace |


  Abstract Scenario: wijzig de release datum

    Gegeven de SUT is gestart
    Gegeven dat de <title> zichtbaar is in het filmoverzicht
    Gegeven <title> is aanwezig in de database
    Als de <DateReleased> is aangepast naar <nieuwe DateReleased>
    Dan is de <nieuwe DateReleased> zichtbaar in het filmoverzicht
    En is het <nieuwe DateReleased> aangepast in de database


    Voorbeelden:
      | DateReleased                   | nieuwe DateReleased     |
      | Star Wars - The Phantom Menace | 25-12-1999  12:00:00 AM |


  Abstract Scenario: controleer de foutafhandeling op de DateReleased

    Gegeven de SUT is gestart
    Gegeven dat de <title> zichtbaar is in het filmoverzicht
    Gegeven <title> is aanwezig in de database
    Als de <DateReleased> is aangepast naar <nieuwe DateReleased>
    Dan is de <foutmelding> zichtbaar
    En zijn er geen aanpassingen gedaan

    Voorbeelden:
      | DateReleased                   | nieuwe DateReleased | foutmelding                            |
      | Star Wars - The Phantom Menace | abc                 | The field DateReleased must be a date  |
      | Star Wars - The Phantom Menace | 2016-01-01          | ~The field DateReleased must be a date |
      | Star Wars - The Phantom Menace |                     | ~The field DateReleased must be a date |



  Abstract Scenario: verwijder de film

    Gegeven de SUT is gestart
    Gegeven dat de <title> zichtbaar is in het filmoverzicht
    Gegeven <title> is aanwezig in de database
    Als de film met de <title> is verwijderd uit het filmoverzicht
    Dan is de <title> niet meer zichtbaar in het filmoverzicht
    En is de <title> niet meer aanwezig in de database

    Voorbeelden:
      | title                          |
      | Star Wars - The Phantom Menace |