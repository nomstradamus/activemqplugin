package omsplugin.oms;

import org.apache.activemq.broker.Broker;
import org.apache.activemq.broker.BrokerFilter;
import org.apache.activemq.broker.ConnectionContext;
import org.apache.activemq.broker.region.Destination;
import org.apache.activemq.broker.region.Subscription;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.ConnectionInfo;
import org.apache.activemq.command.ConsumerInfo;
import org.apache.activemq.command.ProducerInfo;
import org.apache.activemq.command.SessionInfo;

public class MyBroker extends BrokerFilter{

	public MyBroker(Broker next) {
		super(next);
		
	}

	@Override
	public void addConnection(ConnectionContext context, ConnectionInfo info) throws Exception {
		
		super.addConnection(context, info);
		System.out.println(" Added connection : "+ context + " \n " + info);
	}

	@Override
	public Subscription addConsumer(ConnectionContext context, ConsumerInfo info) throws Exception {
		System.out.println(" Added Consumer : "+ context + " \n " + info);
		return super.addConsumer(context, info);
		
	}

	@Override
	public void addProducer(ConnectionContext context, ProducerInfo info) throws Exception {
		
		super.addProducer(context, info);
		System.out.println(" Added Producer : "+ context + " \n " + info);
	}

	@Override
	public Destination addDestination(ConnectionContext context, ActiveMQDestination destination,
			boolean createIfTemporary) throws Exception {
		System.out.println(" Added Destination : "+ context + " \n " + destination);
		return super.addDestination(context, destination, createIfTemporary);
	}

	@Override
	public void addSession(ConnectionContext context, SessionInfo info) throws Exception {
		System.out.println(" Added Session : "+ context + " \n " + info);
		super.addSession(context, info);
	}

}
