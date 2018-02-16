# Game using Recursive Algorithm 

Paijo, a gardener in a rich family, found a chest buried in the backyard. Out of curiosity, Paijo decided to open the chest and found it contained of treasure maps. The treasure map shows the location of an ancient artifact inside a dungeon. Confidently, Paijo decided to take time off to hunt for treasure with his son, Paiman.

But unfortunately when examined further, not all dungeons have a way to the exit. Therefore, they need to determine WHICH DUNGEONS THEY SHOULD VISIT TO GET THE LARGEST NUMBER OF ARTIFACTS AND MOST IMPORTANTLY, THEY SHOULD BE ABLE TO GET OUT SAFELY.

Since Paijo and Paiman are normal creatures, they can only walk up, down, left and right only (not diagonal).
As a programmer, you are required to provide solutions.

Sharp (#) : Means a very thick, strong and high wall

X : Means the exit

S : Means the entrance, which is immediately closed when they enter

A : It means a very valuable ancient artifact

.  : Means the way that can be passed safely 

Input format:
The first line containing T shows the number of maps they found. For each map, the first row is N and M represents the length and width of the dungeon. The next line of N is a map as exemplified below.

Output format:
For each map, the first row the map number with the format "Dungeon Map T #" (without quotation marks, and T starts at 1). 
The next line below draws the number of artifacts they might get. The next row again, remove "There's a way out" if they can reach the exit and "There's no way out" if they can not reach the exit door. 
In the last line, the output should be "The selected dungeon is a T-dungeon number" (without the quotes) that indicate which dungeon they will visit. If there is a dungeon that has the same potential, then select the dungeon that has the lowest number.
If there is not a single dungeon accessible to the exit, the last line is replaced with the words "Paijo and Paiman should go home and work" (without the quotes).
 
Please note Paijo and his son is very adventurous. So, although no artifacts can be taken, they will still visit a dungeon.

Input example :
2

7 10

##########

.........X 

.A.#.A####

#..####...


#..#.....A

#..#######

#........S


6 9

#########

#####...X

#########

AAAAAAA..

AAASAAAAA

######### 

Output example :

Dungeon Map 1#

2

There's a way out

Dungeon Map 2#

15 

There's no way out

Dungeon which selected is dungeon number 1
