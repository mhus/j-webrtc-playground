package de.mhus.jwebrtc;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class RtcConfiguration {

    private IceResolver iceResolver;
    private List<MediaDescription> mediaDescriptionList;

}
