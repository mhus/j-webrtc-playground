package de.mhus.jwebrtc;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

// https://datatracker.ietf.org/doc/html/rfc4566

@Builder
@Getter
public class Sdp {
    private static final String LB = "\r\n"; // 0x0d0a
    private List<MediaDescription> mediaDescriptionList;
    private List<IceCandidate> iceCandidates;
    private int port;
    private String rtpProtocol;

    public String toString() {
        StringBuilder sdp = new StringBuilder();

        sdp.append("v=0").append(LB);

        if (mediaDescriptionList != null) {
            mediaDescriptionList.forEach((mediaDescription -> {
                // Media Description
                sdp.append("m=").append(mediaDescription.getMedia()).append(' ').append(mediaDescription.getPort());
                if (mediaDescription.getNumberOfPorts() > 1)
                    sdp.append('/').append(mediaDescription.getNumberOfPorts());
                sdp.append(' ').append(mediaDescription.getProto());
                mediaDescription.getCodecList().forEach(c -> sdp.append(' ').append(c.getPayloadType()));
                sdp.append(LB);
                // rtpmap
                mediaDescription.getCodecList().forEach(c -> {
                    {
                        sdp.append("a=rtpmap:").append(c.getPayloadType()).append(' ').append(c.getEncodingName()).append(LB);
                    }
                });
            }));

        }
        if (iceCandidates != null) {

        }

        return sdp.toString();
    }
}
