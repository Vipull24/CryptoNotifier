package org.example.models;

import java.util.Map;


public class DestinationDataDTO {
    DestinationType type;
    Map<String, String> properties;

    public DestinationDataDTO(DestinationType type, Map<String, String> properties) {
        this.type = type;
        this.properties = properties;
    }

    public DestinationDataDTO() {
    }

    public DestinationType getType() {
        return type;
    }

    public void setType(DestinationType type) {
        this.type = type;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DestinationDataDTO{" +
                "destinationType=" + type +
                ", destinationData=" + properties +
                '}';
    }
}
