module ApplicationHelper
    def br_date(us_date)
        us_date.strftime("%d %m %y")
    end

    def formata_cep (n_cep)
        n_cep = n_cep.to_s
        cep_formatado = n_cep[0..1]
        cep_formatado << "."
        cep_formatado << n_cep[2..4]
        cep_formatado << "-"
        cep_formatado << n_cep[5..7]
        cep_formatado
    end
end
