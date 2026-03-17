package dev.java10x.CadastroDeNinja.Missoes;


import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinja.Ninjas.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;


import java.util.List;

@Service
public class MissoesService {

    @Autowired
    private MissoesRepository missoesRepository;

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    public MissoesModel salvarMissoes(MissoesModel missoes) {
        return missoesRepository.save(missoes);
    }
}
