instructions:

All key words are non capitalized, the arguements first letter is always capitalized.

key words: [take, help, throw, use, attack, go, quit, enter, inventory, look, open]

key words that does not take in any arguments:
1. help: will show you availble keywords
2. quit:exits game
3. look:show you what is at current direction
4. inventory: displays you current inventory

key words that take in one argument:

5. go [ Direction ] 
possible Directions are South, North, East, West.
This command will show the name of the room, direction, the story of the room at that direction and possiblly if exists items and/or monsters.

6. enter [ Entrance Object ]
Entrances will be displayed if the player is currently in room and direction with an entrance.
This command will take you to a new room.

6. open [ Container Object ]
if there is a Container at location it will open and it's item are put out of the container by the player.
And the items are not obtainable.


7. take [ Item Object ]
if the item is equipable it will be picked up and it exist at the location.

8. throw [ Item object ]
if you inventory contains the item it will be thrown at item and added to that room and direction you threw it in.

key words that take in two arguments:
9. use [ Tool Object ] on [ Obstacle Object ]
if you have the Tool in you inventory and the Tool can open the Obstacle. Then the Obstacle will be set to open.

10. attack [ Monster Object ] with [ Weapon Object ]
if you have the weapon in inventory and Monster exists at the location then the monster will be attacked. 

Items that exists in the game are:
Weapon - used to damage Monsters (equipable)
Entrance - used to take the player from room to room (not equipable)
Container - used to contain Items (somtimes equipable)
Tools - used to open Obstacels (Entrance and Containers) (equipable)
Readble - used to drive the story (strings of text, not equipable)

Player - has health
Monster - has health and damage

Combat System: 
Player can attack monsters.
The damage of a weapon is upperbounded by it's damage and lower bounded by it's damage and lowerbounde 0 (a miss)
when a monster is attacked, it will retaliate with upperbounded preset damage and 0 (a miss)
If the player hits harder than the monster the monster will flee to a random direction in the room.
and the player has to look for it. (I disabled this feature in the player class for Assertion testing)

If the monster is dead (health <= 0) , it will drop items and can not be attacked.
if the player is dead it will restore the players health back to original value and set the monster back to its original value. Also the player will be teleported one room back.
















