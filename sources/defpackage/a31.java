package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a31 {
    private static final /* synthetic */ a31[] $VALUES;
    public static final a31 FATAL_ERROR;
    public static final a31 INVALID_PAYLOAD;
    public static final a31 OK;
    public static final a31 TRANSIENT_ERROR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a31] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a31] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a31] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, a31] */
    static {
        ?? r0 = new Enum("OK", 0);
        OK = r0;
        ?? r1 = new Enum("TRANSIENT_ERROR", 1);
        TRANSIENT_ERROR = r1;
        ?? r2 = new Enum("FATAL_ERROR", 2);
        FATAL_ERROR = r2;
        ?? r3 = new Enum("INVALID_PAYLOAD", 3);
        INVALID_PAYLOAD = r3;
        $VALUES = new a31[]{r0, r1, r2, r3};
    }

    public static a31 valueOf(String str) {
        return (a31) Enum.valueOf(a31.class, str);
    }

    public static a31[] values() {
        return (a31[]) $VALUES.clone();
    }
}
