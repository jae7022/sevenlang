genre(classic, guitar).
genre(classic, piano).
genre(dance, edm).
genre(hiphop, drum).
genre(hiphop, violin).
genre(ballad, piano).
genre(ballad, guitar).

player(kim, dance).
player(hwang, classic).
player(lee, classic).
player(lim, classic).
player(song, edm).
player(ahn, hiphop).
player(yang, ballad).


find_player(X, Y, Z) :- player(X, Z), genre(Z, Y).
#find_player(What, guitar, _).