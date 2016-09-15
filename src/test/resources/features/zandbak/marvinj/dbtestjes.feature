#language:nl
Functionaliteit: Inloggen op de SUT

OMSCHRIJVING
============================================================================================================================================
Aanmaken, update, inloggen en verwijderen van/met een account.

Achtergrond:

@LAB
@NEWNEXUS
@ACCOUNT

Abstract Scenario: maak een account aan

  Gegeven marvins movie store is opgestart
  Als er een account wordt aangemaakt met "<account>" en "<password>"
  Dan is het "<account>" en het "<password>" zichtbaar in de database

  Voorbeelden:
  | account | password |
  | john@hotmail.com   | 123456      |
  | kees@gmail.com     | abcdef      |

