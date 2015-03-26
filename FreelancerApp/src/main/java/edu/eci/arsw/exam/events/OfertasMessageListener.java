package edu.eci.arsw.exam.events;

import edu.eci.arsw.exam.GeneradorIdentidad;
import java.util.Random;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.activemq.command.ActiveMQObjectMessage;

public class OfertasMessageListener implements MessageListener {

    Random rand = new Random(System.currentTimeMillis());

    public OfertasMessageListener() {
        super();
        System.out.println("Cliente freelancer #"+GeneradorIdentidad.identidadActual+" esperando eventos...");
    }

    @Override
    public void onMessage(Message m) {
        ActiveMQObjectMessage om = (ActiveMQObjectMessage) m;
        try {
            String receivedObject = (String) om.getObject();
            System.out.println("Cliente freelancer #"+GeneradorIdentidad.identidadActual+" recibió:"+receivedObject);
            
            int montoOferta = Math.abs(rand.nextInt(99999999));

            //realizar oferta con el monto aleatorio generado
            
        } catch (JMSException e) {
            throw new RuntimeException("An exception occured while trying to get a JMS object:" + e.getMessage(), e);
        }

    }

}
