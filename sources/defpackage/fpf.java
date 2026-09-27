package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fpf {
    private static final /* synthetic */ fpf[] $VALUES;
    public static final fpf CLOSED;
    public static final fpf CONNECTING;
    public static final fpf OPEN;
    public static final fpf RAW;
    public static final fpf SHUTDOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fpf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fpf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fpf] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, fpf] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, fpf] */
    static {
        ?? r0 = new Enum("RAW", 0);
        RAW = r0;
        ?? r1 = new Enum("CONNECTING", 1);
        CONNECTING = r1;
        ?? r2 = new Enum("OPEN", 2);
        OPEN = r2;
        ?? r3 = new Enum("CLOSED", 3);
        CLOSED = r3;
        ?? r4 = new Enum("SHUTDOWN", 4);
        SHUTDOWN = r4;
        $VALUES = new fpf[]{r0, r1, r2, r3, r4};
    }

    public static fpf valueOf(String str) {
        return (fpf) Enum.valueOf(fpf.class, str);
    }

    public static fpf[] values() {
        return (fpf[]) $VALUES.clone();
    }
}
