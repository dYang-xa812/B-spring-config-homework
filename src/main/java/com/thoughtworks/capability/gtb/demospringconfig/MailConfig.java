package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ConfigurationProperties("mail")
public class MailConfig {
    private String hostname;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String,String> additionalHeaders;
    private Credentials credentials;

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    @Override
    public String toString() {
        String mapAsString = additionalHeaders.keySet().stream()
                .map(key -> key + "=" + additionalHeaders.get(key))
                .collect(Collectors.joining(",","{","}"));
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRecipients=" + defaultRecipients +
                ", additionalHeaders=" + mapAsString +
                ", credentials=" + credentials.toString() +
                '}';
    }
}
