# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rails db:seed command (or created alongside the database with db:setup).
#
# Examples:
#
#   movies = Movie.create([{ name: 'Star Wars' }, { name: 'Lord of the Rings' }])
#   Character.create(name: 'Luke', movie: movies.first)

puts "Cadastrando Estados..."

State.create!(id: 1, description:'Santa Catarina', acronym:'SC')
State.create!(id: 2, description: 'Paraná', acronym: 'PR')
State.create!(id: 3, description: 'Rio Grande do Sul', acronym: 'RS')
State.find_or_create_by!(id: 4, description: 'Mato Grosso do Sul', acronym: 'MS')

puts "Finalizando Estados..."