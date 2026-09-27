package com.socure.idplus.device.internal.mediaDevice.model;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/ChangeReason;", "", "(Ljava/lang/String;I)V", "INITIAL", "PERMISSIONS_CHANGED", "AVAILABILITY_CHANGED", "UNKNOWN", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChangeReason {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ChangeReason[] $VALUES;
    public static final ChangeReason INITIAL = new ChangeReason("INITIAL", 0);
    public static final ChangeReason PERMISSIONS_CHANGED = new ChangeReason("PERMISSIONS_CHANGED", 1);
    public static final ChangeReason AVAILABILITY_CHANGED = new ChangeReason("AVAILABILITY_CHANGED", 2);
    public static final ChangeReason UNKNOWN = new ChangeReason("UNKNOWN", 3);

    private static final /* synthetic */ ChangeReason[] $values() {
        return new ChangeReason[]{INITIAL, PERMISSIONS_CHANGED, AVAILABILITY_CHANGED, UNKNOWN};
    }

    static {
        ChangeReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ChangeReason(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ChangeReason valueOf(String str) {
        return (ChangeReason) Enum.valueOf(ChangeReason.class, str);
    }

    public static ChangeReason[] values() {
        return (ChangeReason[]) $VALUES.clone();
    }
}
