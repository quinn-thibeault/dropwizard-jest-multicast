package com.meltmedia.dropwizard.jestmulticast;

import java.util.Collection;

/**
 * Created by qthibeault on 8/25/16.
 */

public class MulticastConfiguration {

    private String clusterName;
    private Collection<String> databaseUrls;
    private Integer connectionTimeout = 30000;
    private Integer readTimeout = 30000;
    private Integer maxTotalConnections = 1;
    private Integer maxTotalConnectionsPerRoute = 1;
    private Boolean critical = false;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Collection<String> getDatabaseUrls() {
        return databaseUrls;
    }

    public void setDatabaseUrls(Collection<String> databaseUrls) {
        this.databaseUrls = databaseUrls;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public void setMaxTotalConnections(Integer maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }

    public Integer getMaxTotalConnectionsPerRoute() {
        return maxTotalConnectionsPerRoute;
    }

    public void setMaxTotalConnectionsPerRoute(Integer maxTotalConnectionsPerRoute) {
        this.maxTotalConnectionsPerRoute = maxTotalConnectionsPerRoute;
    }

    public Boolean isCritical() {
        return critical;
    }

    public void setCritical(Boolean critical) {
        this.critical = critical;
    }
}