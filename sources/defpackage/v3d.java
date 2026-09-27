package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v3d {
    private static final /* synthetic */ v3d[] $VALUES;
    public static final v3d CONNECTED;
    public static final v3d METERED;
    public static final v3d NOT_REQUIRED;
    public static final v3d NOT_ROAMING;
    public static final v3d TEMPORARILY_UNMETERED;
    public static final v3d UNMETERED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v3d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v3d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v3d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, v3d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, v3d] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, v3d] */
    static {
        ?? r0 = new Enum("NOT_REQUIRED", 0);
        NOT_REQUIRED = r0;
        ?? r1 = new Enum("CONNECTED", 1);
        CONNECTED = r1;
        ?? r2 = new Enum("UNMETERED", 2);
        UNMETERED = r2;
        ?? r3 = new Enum("NOT_ROAMING", 3);
        NOT_ROAMING = r3;
        ?? r4 = new Enum("METERED", 4);
        METERED = r4;
        ?? r5 = new Enum("TEMPORARILY_UNMETERED", 5);
        TEMPORARILY_UNMETERED = r5;
        $VALUES = new v3d[]{r0, r1, r2, r3, r4, r5};
    }

    public static v3d valueOf(String str) {
        return (v3d) Enum.valueOf(v3d.class, str);
    }

    public static v3d[] values() {
        return (v3d[]) $VALUES.clone();
    }
}
