package backtype.storm.multilang;

import java.util.List;

/**
 * Immission is an object that represents the data sent from a shell component
 * to a process that implements a multi-language protocol. It is the union
 * of all data types that a component can receive from Storm.
 *
 * <p> Immissions are objects sent to the ISerializer interface, for
 * serialization according to the wire protocol implemented by the serializer.
 * The Immission class allows for a decoupling between the serialized
 * representation of the data and the data itself.</p>
 */
public class Immission {
	private String id;
	private String comp;
	private String stream;
	private long task;
	private List<Object> tuple;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getTask() {
		return task;
	}
	public void setTask(long task) {
		this.task = task;
	}
	public List<Object> getTuple() {
		return tuple;
	}
	public void setTuple(List<Object> tuple) {
		this.tuple = tuple;
	}
}
