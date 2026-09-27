package com.socure.idplus.device.internal.mediaDevice.model;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/CameraType;", "", "(Ljava/lang/String;I)V", "DEPTH", "EXTERNAL", "UNKNOWN", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CameraType[] $VALUES;
    public static final CameraType DEPTH = new CameraType("DEPTH", 0);
    public static final CameraType EXTERNAL = new CameraType("EXTERNAL", 1);
    public static final CameraType UNKNOWN = new CameraType("UNKNOWN", 2);

    private static final /* synthetic */ CameraType[] $values() {
        return new CameraType[]{DEPTH, EXTERNAL, UNKNOWN};
    }

    static {
        CameraType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CameraType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CameraType valueOf(String str) {
        return (CameraType) Enum.valueOf(CameraType.class, str);
    }

    public static CameraType[] values() {
        return (CameraType[]) $VALUES.clone();
    }
}
