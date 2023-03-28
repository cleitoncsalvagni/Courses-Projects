puts "olha só que interessante, porem normal, tipo helloword"

puts "digita o nome ai"

nome=gets

puts "o seu nome e: " + nome
puts "==================="

puts "" +nome.inspect
puts "==================="

nome=gets.chomp

puts "Digite salario:"
sal=gets.chomp.to_f

puts "seu salario atualizado e: " + (sal*1.20).to_s
puts "==================="