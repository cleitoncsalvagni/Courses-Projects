namespace :dev do
  desc "Configura o banco de dados do zero"
  task db_task: :environment do
    if Rails.env.development?
      puts %x(rails db:drop)
      puts %x(rails db:create)
      puts %x(rails db:migrate)
      puts %x(rails db:seed)
    else
      puts "Ambiente de producao!"
    end
  end
end
