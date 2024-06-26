package com.github.lucitacastello.notificacao.listener;

import com.github.lucitacastello.notificacao.constante.MensagemConstante;
import com.github.lucitacastello.notificacao.domain.Proposta;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PropostaPendenteListener {

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta){
        //msg que quer mandar via SMS
        String mensagem = String.format(MensagemConstante.PROPOSTA_EM_ANALISE, proposta.getUsuario().getNome());

    }

}
