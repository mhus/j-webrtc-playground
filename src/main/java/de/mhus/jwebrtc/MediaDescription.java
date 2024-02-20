package de.mhus.jwebrtc;

import java.util.List;

public class MediaDescription {
    private String media;
    private int port;
    private int numberOfPorts;
    private String proto;
    private List<RtpCodec> codecList;
    private String rtpProtocol;

    public String getMedia() {
        return media;
    }

    public int getPort() {
        return port;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public String getProto() {
        return proto;
    }

    public List<RtpCodec> getCodecList() {
        return codecList;
    }

    public String getRtpProtocol() {
        return rtpProtocol;
    }
}
