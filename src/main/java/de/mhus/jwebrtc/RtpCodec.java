package de.mhus.jwebrtc;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class RtpCodec {
    private int PayloadType;
    private String encodingName;
}
