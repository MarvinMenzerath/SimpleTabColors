# SimpleTabColors
This tiny Plugin modifies the Tab-List to show colored Player-Names. To give a Player a certain color give him the specific Permission.

## Install
Grab a current Release from [here](https://github.com/MarvinMenzerath/SimpleTabColors/releases) and copy it into your Plugins-Directory.  
Now you are able to give the Player/Group a Permission (`simpletabcolors.X`) which will result in a specific color.

### Example Configuration
```
groups:
  User:
    default: true
    build: false
    prefix: '&7[User] '
    permissions:
    - simpletabcolors.7
    - sg.arena.join.*
    - sg.lobby.join
    - sg.arena.vote
  Admin:
    default: false
    build: false
    prefix: '&c[Admin] '
    permissions:
    - simpletabcolors.c
    - -simpletabcolors.*
    - '*'
users:
  ...
```

## License
Copyright (C) 2014 [Marvin Menzerath](http://menzerath.eu)

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the [GNU General Public License](https://github.com/MarvinMenzerath/SimpleTabColors/blob/master/LICENSE) for more details.