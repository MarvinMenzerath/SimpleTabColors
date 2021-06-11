# SimpleTabColors
This tiny Plugin modifies the Tab-List to show colored Player-Names. To give a Player a certain color give him the specific Permission.

## Install
Grab a current Release from [here](https://github.com/menzerath/spigot-simple-tab-colors/releases) and copy it into your Plugins-Directory.  
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
