package Config;

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.boot.r2dbc.ConnectionFactoryBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.awt.*;

public class JmsConfiguration {

    public DefaultJmsListenerContainerFactoryConfigurer myfactory(ConnectionFactoryBuilder connectionFactory,
    DefaultJmsListenerContainerFactoryConfigurer configurer,jmsErrorhandler jmsErrorhandler){

        DefaultJmsListenerContainerFactoryConfigurer factoryConfigurer =  new DefaultJmsListenerContainerFactoryConfigurer();

        factoryConfigurer.setErrorHandler(jmsErrorhandler);

        configurer.configure(factory, connectionFactory);

        return factoryConfigurer;
    }

    public DefaultJmsListenerContainerFactoryConfigurer topicListenerFactory(ConnectionFactoryBuilder connectionFactory,
                                                                             DefaultJmsListenerContainerFactoryConfigurer configurer,jmsErrorhandler jmsErrorhandler){
        factory.setPubDomain(true);

        configurer.configure(factory, connectionFactory);

        return factory;
    }

    public MappingJackson2HttpMessageConverter JacksonjmsMessageConverter(){

        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

        converter.setTargetType(TrayIcon.MessageType.TEXT);

        convert.setTypeIdPropertyName("_type");

        return converter;

    }
}
