# 🧬 Blade Runner Game 🧬 
### G38_fantasy_adventure_lab | CodeClan / CodeBase Java Project

## Commentary
A Java project focused around TDD (Test Driven Development) to create the functionality for a adventure game. I decided to put my own spin on the brief of this one by converting the Dugeon and Dragons theme to a Blade Runner style game. Exchanging Fighters, Clerics and Wizards for LAPD, Medics and Genetic Designers - all with unique sub-classes including Blade Runners, Memory Scientists and LAPD Medics. 

The project uses interfaces, enums and abstract classes so instantiating of characters, weapons, loot and rooms can be tested with junit style tests. The interfaces used included IWeapon, ISpell, IHeal and IDefend each with methods that would take in an enemy object (instantiated from it's child-class from parent abstract enemy class). These methods were then tested to see if damage could be inflicted by a declared player, weapon and methods associated with the player selecting said weapon and calling the interface method upon the enemy.

The enemies were basic classes based on the Replicants in the film and book series. Parameters included a string type name and some int values for health points (this is also true for the player classes). 

After successfully implementing combat into the program, a Room class was created. This would house a list of players, enemies, loot and also call a method to generate a random number of exits to determine where the player could journey through on their quest. 

## MVP
👁️  - Create three abstract player class types based on fighter, healer, mage  
👁️  - Create weapons, spells, first aid, familiar classes for each respective class  
👁️  - Create an interface for each of these classes to be able to call a method upon an enemy object (IDefend, IWeapon, ISpell, IHeal)  
👁️  - Create an abstract enemy class an appropriate sub-classes on enemies to be instantiated in the tests  
👁️  - Create sub-calsses for the player types based on the theme of the game and the player types (fighter, healer, mage)  
👁️  - Allow players to attack, cast spells, be defended by their familiars or heal other players 
👁️  - Allow enemies to take damage  
👁️  - Allow players to select and change weapons, abilities and items during the game  

## Extension
👁️  - Create a Room class, referencing an enum type of exits (NSEW)  
👁️  - Create a method that generates a random amount of exits and exit types for the room when instantiated  

## Setup
👁️  - Pull repository into file directory  
👁️  - Run tests in test directory test/java - right click and hit run all to run all tests regarding above brief  



