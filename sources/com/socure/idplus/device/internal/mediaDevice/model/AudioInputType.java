package com.socure.idplus.device.internal.mediaDevice.model;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/AudioInputType;", "", "(Ljava/lang/String;I)V", "BUILT_IN_MIC", "LINE_IN", "WIRED_HEADSET", "USB_DEVICE", "USB_ACCESSORY", "USB_HEADSET", "BLUETOOTH_SCO", "BLUETOOTH_HEADSET", "FM_TUNER", "TELEPHONY", "IP", "BUS", "REMOTE_SUBMIX", "UNKNOWN", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AudioInputType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AudioInputType[] $VALUES;
    public static final AudioInputType BUILT_IN_MIC = new AudioInputType("BUILT_IN_MIC", 0);
    public static final AudioInputType LINE_IN = new AudioInputType("LINE_IN", 1);
    public static final AudioInputType WIRED_HEADSET = new AudioInputType("WIRED_HEADSET", 2);
    public static final AudioInputType USB_DEVICE = new AudioInputType("USB_DEVICE", 3);
    public static final AudioInputType USB_ACCESSORY = new AudioInputType("USB_ACCESSORY", 4);
    public static final AudioInputType USB_HEADSET = new AudioInputType("USB_HEADSET", 5);
    public static final AudioInputType BLUETOOTH_SCO = new AudioInputType("BLUETOOTH_SCO", 6);
    public static final AudioInputType BLUETOOTH_HEADSET = new AudioInputType("BLUETOOTH_HEADSET", 7);
    public static final AudioInputType FM_TUNER = new AudioInputType("FM_TUNER", 8);
    public static final AudioInputType TELEPHONY = new AudioInputType("TELEPHONY", 9);
    public static final AudioInputType IP = new AudioInputType("IP", 10);
    public static final AudioInputType BUS = new AudioInputType("BUS", 11);
    public static final AudioInputType REMOTE_SUBMIX = new AudioInputType("REMOTE_SUBMIX", 12);
    public static final AudioInputType UNKNOWN = new AudioInputType("UNKNOWN", 13);

    private static final /* synthetic */ AudioInputType[] $values() {
        return new AudioInputType[]{BUILT_IN_MIC, LINE_IN, WIRED_HEADSET, USB_DEVICE, USB_ACCESSORY, USB_HEADSET, BLUETOOTH_SCO, BLUETOOTH_HEADSET, FM_TUNER, TELEPHONY, IP, BUS, REMOTE_SUBMIX, UNKNOWN};
    }

    static {
        AudioInputType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private AudioInputType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AudioInputType valueOf(String str) {
        return (AudioInputType) Enum.valueOf(AudioInputType.class, str);
    }

    public static AudioInputType[] values() {
        return (AudioInputType[]) $VALUES.clone();
    }
}
