package com.socure.idplus.device.internal.behavior.model;

import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/LifeCycleType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "INITIALIZED", "FOREGROUNDED", "BACKGROUNDED", "PAUSED", "RESUMED", "DESTROYED", "MOTION_CAPTURE_STARTED", "MOTION_CAPTURE_STOPPED", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LifeCycleType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ LifeCycleType[] $VALUES;
    public static final LifeCycleType UNKNOWN = new LifeCycleType("UNKNOWN", 0);
    public static final LifeCycleType INITIALIZED = new LifeCycleType("INITIALIZED", 1);
    public static final LifeCycleType FOREGROUNDED = new LifeCycleType("FOREGROUNDED", 2);
    public static final LifeCycleType BACKGROUNDED = new LifeCycleType("BACKGROUNDED", 3);
    public static final LifeCycleType PAUSED = new LifeCycleType("PAUSED", 4);
    public static final LifeCycleType RESUMED = new LifeCycleType("RESUMED", 5);
    public static final LifeCycleType DESTROYED = new LifeCycleType("DESTROYED", 6);
    public static final LifeCycleType MOTION_CAPTURE_STARTED = new LifeCycleType("MOTION_CAPTURE_STARTED", 7);
    public static final LifeCycleType MOTION_CAPTURE_STOPPED = new LifeCycleType("MOTION_CAPTURE_STOPPED", 8);

    private static final /* synthetic */ LifeCycleType[] $values() {
        return new LifeCycleType[]{UNKNOWN, INITIALIZED, FOREGROUNDED, BACKGROUNDED, PAUSED, RESUMED, DESTROYED, MOTION_CAPTURE_STARTED, MOTION_CAPTURE_STOPPED};
    }

    static {
        LifeCycleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private LifeCycleType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static LifeCycleType valueOf(String str) {
        return (LifeCycleType) Enum.valueOf(LifeCycleType.class, str);
    }

    public static LifeCycleType[] values() {
        return (LifeCycleType[]) $VALUES.clone();
    }
}
