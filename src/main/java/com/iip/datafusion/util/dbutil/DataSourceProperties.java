package com.iip.datafusion.util.dbutil;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSourceProperties {
    @JsonProperty("id")
    private String id;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("type")
    private String driverClassName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("user")
    private String username;
    @JsonProperty("pwd")
    private String password;

    public DataSourceProperties() {
        super();
    }

    @JsonCreator
    public DataSourceProperties(@JsonProperty("id")String id,
                                @JsonProperty("displayName")String displayName,
                                @JsonProperty("type")String driverClassName,
                                @JsonProperty("url")String url,
                                @JsonProperty("user")String username,
                                @JsonProperty("pwd")String password) {
        this.id = id;
        this.displayName = displayName;
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
