package de.mhus.jwebrtc;

import lombok.Getter;


public class RtcNegotiation {


    @Getter
    private final RtcConfiguration configuration;
    private Sdp offer;
    private Sdp answer;

    public RtcNegotiation(RtcConfiguration configuration) {
        this.configuration = configuration;
    }

    public Sdp getOffer() {
        offer = Sdp.builder()
                .mediaDescriptionList(configuration.getMediaDescriptionList())
                .iceCandidates(configuration.getIceResolver().resolve())
                .build();
        return offer;
    }

    public void setAnswer(String answer) {
        answer = Sdp.builder().toString();
        //TODO: from string to Sdp, validate answer
    }

    public Sdp getAnswer(String offer) {
        //TODO: from string to Sdp, calculate answer
        return null;
    }

    public RtcConnection start() {
        return null;
    }
}
