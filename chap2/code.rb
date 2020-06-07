properties = ['object oriented', 'duck typed', 'productive', 'fun']
properties.each {|property| puts "Ruby is #{property}."}
puts "hello seongjae"
language = "ruby"
puts "hello, #{language}"
language = "my Ruby"
puts "hello, #{language}"
language = 'ruby'
puts "hello, #{language}"
4
4.class
4+4
4.methods
4.bit_length()
x = 4
x < 5
x <= 4
x < 4
x > 4
false.class
true.class
x = 4
puts 'This appears to be false.' unless x == 4 # this will be return as nil only
puts 'This appears to be true' if x == 4 # this ~~ will be return with nil
if x == 4
	puts 'This appears to be true.'
end
unless x == 4 # seems like if x!=4
	puts 'This appears to be false.'
end
x = x + 1 while x < 10
x = x - 1 until x == 1
while x < 10
	x = x + 1
	puts x
end
puts 'true' if 1
puts 'true' if 'random'
puts 'true' if 0
puts 'false' if false
puts 'true' if nil
true and false
true or false
false && false
true && this_will_case_an_error
false && this_will_not_cause_an_error
true or this_will_not_cause_an_error
true || this_will_not_cause_an_error
true | this_will_cause_an_error
true | false
4 + 'four' # error
4.class # Fixnum아니고 Integer
(4.0).class # Float
4+4.0 # 8.0
def add_them
	4 + 'four'
end # no error
add_them # error
i=0
a = ['100', 100.0]
while i < 2
  puts a[i].to_i # type을 integer로 변화
  i = i + 1
end

puts "hello world"
a = "Hello, Ruby"
a.index("Ruby")
a=0
while a < 10
  puts "Fdin"
  a = a + 1
end
a = 1
while a<=10
  puts "This is sentence number #{a}"
  a = a + 1
end

animals = ['lions', 'tigers','bears']
puts animals
animals[0]
animals[2]
animals[-1]
animals[-2]
animals[0..1]
(0..1).class # Range Type
animals[5] # returns "nil"
[1]
[1].class # [] is function of "Array" type
[1].methods.include(:[])
b = []
b[0] = 'zero'
b[1] = 1
b[2] = ['two','things']
