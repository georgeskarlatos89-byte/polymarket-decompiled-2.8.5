package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ro9 {
    private static final /* synthetic */ ro9[] $VALUES;
    public static final ro9 ERROR_CONVERSION;
    public static final ro9 SUCCESS;
    public static final ro9 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ro9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ro9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ro9] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("SUCCESS", 1);
        SUCCESS = r1;
        ?? r2 = new Enum("ERROR_CONVERSION", 2);
        ERROR_CONVERSION = r2;
        $VALUES = new ro9[]{r0, r1, r2};
    }

    public static ro9 valueOf(String str) {
        return (ro9) Enum.valueOf(ro9.class, str);
    }

    public static ro9[] values() {
        return (ro9[]) $VALUES.clone();
    }
}
