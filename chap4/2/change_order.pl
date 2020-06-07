change(_,_,[],[]).
change(X,Y,[H|T],[H|T1]):- \+is_list(H),dif(H,X),change(X,Y,T,T1).
change(X,Y,[X|T],[Y|T1]):- change(X,Y,T,T1).
change(X,Y,[H|T],[L|T1]):- is_list(H),change(X,Y,H,L),change(X,Y,T,T1).