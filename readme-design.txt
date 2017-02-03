The whole program starts when running ZorkRunner, which calls the startgame method in zorkgame

the zorkgame creates Libraries which will be used by many classes. the libraries is a String to object converter.

The ZorkGame then creates a new Level which will initalize the gameMapGenrator in Level which in turn initalizes the RoomGenerator.

The RoomGenerator will use the ItemFactory and MonsterFactory to create Items and Monsters, then the RoomGenerator will put Items and Monsters created into that room and as Items are created in the ItemFactory the will be put in the StringToItemLibrary.

Side note: Inheritance and why I used it.
I use inheritance on Items, because Tool, Obstacel,Weapon and Readable all share a common traits, they all have names,stories and a boolean isEquipable. However they also differ, Weapons for examples have an damage attribute. And tools can be used to open locked Obstacles.

I further created the subclass Container and Entrance. Since Container and Entrances both have common attributes and methods, they can both be locked or open. However Entrance can take you from one room to the next. And Containers contains Items.

Continue on flow:
RoomGenerator will also use a MonsterFactory which produces monsters.

The final output of the RoomGenerator is a Room, which are simply added into the GameMapGenerator which in turn produces a GameMap.

The end result is that the level contains a GameMap.Then the player is created and is put into the GameMap.

And now the ZorkGame will create a CommandParser and a Command.The CommandParser's start method is called and now the program can take in inputs from user.

if the CommandParser see the keyWords as valid. it will send the arguements to a specific function based on keyWord inside the player class. Else an error message will appear. (did not recognize keyWord.)

 And if the arguments are valid the player will perform the action.Else an Error message will appear did not find item or monster etc.




