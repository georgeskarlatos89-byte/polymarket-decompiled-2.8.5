package com.socure.idplus.device.internal.mediaDevice.model;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/AudioOutputType;", "", "(Ljava/lang/String;I)V", "BUILT_IN_SPEAKER", "BUILT_IN_EARPIECE", "USB_DEVICE", "HDMI", "WIRED_HEADPHONES", "BLUETOOTH_A2DP", "BLUETOOTH_SCO", "LINE_OUT", "USB_ACCESSORY", "USB_HEADSET", "IP", "HEARING_AID", "FM", "BUS", "WIRED_HEADSET", "BLUETOOTH_LE_HEADSET", "BLUETOOTH_LE_SPEAKER", "BLUETOOTH_LE_BROADCAST", "TELEPHONY", "UNKNOWN", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AudioOutputType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AudioOutputType[] $VALUES;
    public static final AudioOutputType BUILT_IN_SPEAKER = new AudioOutputType("BUILT_IN_SPEAKER", 0);
    public static final AudioOutputType BUILT_IN_EARPIECE = new AudioOutputType("BUILT_IN_EARPIECE", 1);
    public static final AudioOutputType USB_DEVICE = new AudioOutputType("USB_DEVICE", 2);
    public static final AudioOutputType HDMI = new AudioOutputType("HDMI", 3);
    public static final AudioOutputType WIRED_HEADPHONES = new AudioOutputType("WIRED_HEADPHONES", 4);
    public static final AudioOutputType BLUETOOTH_A2DP = new AudioOutputType("BLUETOOTH_A2DP", 5);
    public static final AudioOutputType BLUETOOTH_SCO = new AudioOutputType("BLUETOOTH_SCO", 6);
    public static final AudioOutputType LINE_OUT = new AudioOutputType("LINE_OUT", 7);
    public static final AudioOutputType USB_ACCESSORY = new AudioOutputType("USB_ACCESSORY", 8);
    public static final AudioOutputType USB_HEADSET = new AudioOutputType("USB_HEADSET", 9);
    public static final AudioOutputType IP = new AudioOutputType("IP", 10);
    public static final AudioOutputType HEARING_AID = new AudioOutputType("HEARING_AID", 11);
    public static final AudioOutputType FM = new AudioOutputType("FM", 12);
    public static final AudioOutputType BUS = new AudioOutputType("BUS", 13);
    public static final AudioOutputType WIRED_HEADSET = new AudioOutputType("WIRED_HEADSET", 14);
    public static final AudioOutputType BLUETOOTH_LE_HEADSET = new AudioOutputType("BLUETOOTH_LE_HEADSET", 15);
    public static final AudioOutputType BLUETOOTH_LE_SPEAKER = new AudioOutputType("BLUETOOTH_LE_SPEAKER", 16);
    public static final AudioOutputType BLUETOOTH_LE_BROADCAST = new AudioOutputType("BLUETOOTH_LE_BROADCAST", 17);
    public static final AudioOutputType TELEPHONY = new AudioOutputType("TELEPHONY", 18);
    public static final AudioOutputType UNKNOWN = new AudioOutputType("UNKNOWN", 19);

    private static final /* synthetic */ AudioOutputType[] $values() {
        return new AudioOutputType[]{BUILT_IN_SPEAKER, BUILT_IN_EARPIECE, USB_DEVICE, HDMI, WIRED_HEADPHONES, BLUETOOTH_A2DP, BLUETOOTH_SCO, LINE_OUT, USB_ACCESSORY, USB_HEADSET, IP, HEARING_AID, FM, BUS, WIRED_HEADSET, BLUETOOTH_LE_HEADSET, BLUETOOTH_LE_SPEAKER, BLUETOOTH_LE_BROADCAST, TELEPHONY, UNKNOWN};
    }

    static {
        AudioOutputType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private AudioOutputType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AudioOutputType valueOf(String str) {
        return (AudioOutputType) Enum.valueOf(AudioOutputType.class, str);
    }

    public static AudioOutputType[] values() {
        return (AudioOutputType[]) $VALUES.clone();
    }
}
