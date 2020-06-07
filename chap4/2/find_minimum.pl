find_minimum([Min], Min).
find_minimum([Head,Value|Tail], Min) :- Head =< Value, find_minimum([Head|Tail], Min).
find_minimum([Head,Value|Tail], Min) :- Head > Value, find_minimum([Value|Tail], Min).

#find_minimum([Head,Value|Tail], Min)