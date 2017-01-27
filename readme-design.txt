The flow: everythings starts in Main(ZorkRunner) then the player will have to pick which level to go. After that the level in CreateLevel, will generate the map.From itemFactory all items are generated, from monster factory all monsters are generated. The is initialized by itself.
From there the game starts and the player can use the command line to perform actions. Which will be considered wether or not is valid by the commandLineParser. Every commandline input can be either valid or not valid. if valid the action will be performed. If interacting with items and an action on the item is changed the attribute of the item might change in it's respective class.


The inheritances that exist are in items which are separated into three groups obstacles,weapons and tools.
Because they are all three items, but they have different purposes. Like a weapon for example does damage, and can be wielded, but a door can not be used as a weapon. Furthermore there are more specifc subclasses of the obstacles,Weapons and tools. These are the items that actually will be initialised, like keys and long bow. Inheritance is usedd because they share similar traits.

Level is a superclass of level 1, because they will have similar methods and attributes.

Stage will be a super class of stage 1, again because there a similar methods and attributes for each stage.

