package com.socure.idplus.device.internal.behavior.model;

import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/Orientation;", "", "(Ljava/lang/String;I)V", "PORTRAIT_PRIMARY", "PORTRAIT_SECONDARY", "LANDSCAPE_PRIMARY", "LANDSCAPE_SECONDARY", "UNKNOWN", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Orientation {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation PORTRAIT_PRIMARY = new Orientation("PORTRAIT_PRIMARY", 0);
    public static final Orientation PORTRAIT_SECONDARY = new Orientation("PORTRAIT_SECONDARY", 1);
    public static final Orientation LANDSCAPE_PRIMARY = new Orientation("LANDSCAPE_PRIMARY", 2);
    public static final Orientation LANDSCAPE_SECONDARY = new Orientation("LANDSCAPE_SECONDARY", 3);
    public static final Orientation UNKNOWN = new Orientation("UNKNOWN", 4);

    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{PORTRAIT_PRIMARY, PORTRAIT_SECONDARY, LANDSCAPE_PRIMARY, LANDSCAPE_SECONDARY, UNKNOWN};
    }

    static {
        Orientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private Orientation(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
