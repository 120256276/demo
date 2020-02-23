package com.test.crud.bean;

import java.util.Date;

public class ClentInfo {
    private Integer id;

    private String ip;

    private String host;

    private String port;

    private String url;

    private String uri;

    private String method;

    private Date time;

    private String note1;

    private String note2;

    private String note3;

    private String note4;

    private String note5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3 == null ? null : note3.trim();
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4 == null ? null : note4.trim();
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5 == null ? null : note5.trim();
    }

	@Override
	public String toString() {
		return "ClentInfo [ip=" + ip + ", host=" + host + ", port=" + port
				+ ", url=" + url + ", uri=" + uri + ", method=" + method
				+ ", time=" + time + ", note1=" + note1 + ", note2=" + note2
				+ ", note3=" + note3 + ", note4=" + note4 + ", note5=" + note5
				+ "]";
	}
    
    
}