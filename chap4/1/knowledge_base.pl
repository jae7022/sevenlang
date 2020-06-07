book(dennis, the_c).
book(kim, mugunghwa).
book(kim, kky_earth).
book(lee, siwon_school).
book(lee, eng_grammer).
book(ahn, steve_jobs).
book(jiwon, html5).

find_book(X, Y) :- book(X, Y).
#find_book(kim, What).
#a