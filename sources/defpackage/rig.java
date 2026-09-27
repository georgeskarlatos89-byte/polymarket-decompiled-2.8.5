package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rig {
    private static final /* synthetic */ rig[] $VALUES;
    public static final rig DEVICE_CHARGING;
    public static final rig DEVICE_IDLE;
    public static final rig NETWORK_UNMETERED;

    /* JADX WARN: Type inference failed for: r0v0, types: [rig, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rig, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rig, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        NETWORK_UNMETERED = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        DEVICE_IDLE = r1;
        ?? r2 = new Enum("DEVICE_CHARGING", 2);
        DEVICE_CHARGING = r2;
        $VALUES = new rig[]{r0, r1, r2};
    }

    public static rig valueOf(String str) {
        return (rig) Enum.valueOf(rig.class, str);
    }

    public static rig[] values() {
        return (rig[]) $VALUES.clone();
    }
}
