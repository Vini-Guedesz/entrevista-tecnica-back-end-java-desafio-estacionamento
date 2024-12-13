package br.com.ada.estacionamento.carros;

import br.com.ada.estacionamento.vagas.Vaga;
import br.com.ada.estacionamento.vagas.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {


    public CarroRepository carroRepository;
    public VagaRepository vagaRepository;

    public void cadastrarCarro(Carro carro){
        carroRepository.save(carro);
    }

    public void estacionar(Carro carro, Vaga vaga){
        //Carro tem que verificar se a vaga já está sendo ocupada
        //Carro tem que
        //Verficiar se todas as vagas estão ocupadas
        if (vaga.isOcupada()) {
            throw new RuntimeException("A vaga já está ocupada.");
        }

        if () {
            throw new RuntimeException("Todas as vagas estão ocupadas.");
        }

        vaga.setOcupada(true);
        vaga.setCarro(carro);
        carro.setVaga(vaga);

        carroRepository.save(carro);
        vagaRepository.save(vaga);
    }

}
