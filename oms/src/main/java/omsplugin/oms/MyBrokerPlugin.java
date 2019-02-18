package omsplugin.oms;

import org.apache.activemq.broker.Broker;
import org.apache.activemq.broker.BrokerPlugin;
/**
 * 
 * @author gsingh8
 * @org.apache.xbean.XBean
 */
public class MyBrokerPlugin implements BrokerPlugin{

	public Broker installPlugin(Broker broker) throws Exception {
		MyBroker myBroker =  new MyBroker(broker);
		System.out.println(" Installing my broker ");
		return myBroker;
	}

}
