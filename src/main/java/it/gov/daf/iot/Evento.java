package it.gov.daf.iot;

import java.util.Arrays;

public class Evento {

	private long version = 1;
	private String id;
	private Long ts;
	private String temporalGranularity;
	private Double eventCertainty = 1.0D;
	private Integer eventTypeId;
	private String eventSubtypeId;
	private String eventAnnotation;
	private String source;
	private String location;
	private byte[] body;

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getTemporalGranularity() {
		return temporalGranularity;
	}

	public void setTemporalGranularity(String temporalGranularity) {
		this.temporalGranularity = temporalGranularity;
	}

	public Double getEventCertainty() {
		return eventCertainty;
	}

	public void setEventCertainty(Double eventCertainty) {
		this.eventCertainty = eventCertainty;
	}

	public Integer getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getEventSubtypeId() {
		return eventSubtypeId;
	}

	public void setEventSubtypeId(String eventSubtypeId) {
		this.eventSubtypeId = eventSubtypeId;
	}

	public String getEventAnnotation() {
		return eventAnnotation;
	}

	public void setEventAnnotation(String eventAnnotation) {
		this.eventAnnotation = eventAnnotation;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Evento [version=" + version + ", id=" + id + ", ts=" + ts + ", temporalGranularity="
				+ temporalGranularity + ", eventCertainty=" + eventCertainty + ", eventTypeId=" + eventTypeId
				+ ", eventSubtypeId=" + eventSubtypeId + ", eventAnnotation=" + eventAnnotation + ", source=" + source
				+ ", location=" + location + ", body=" + Arrays.toString(body) + "]";
	}

}
