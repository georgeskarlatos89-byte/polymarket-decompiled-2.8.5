package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class t4j {
    private static final /* synthetic */ t4j[] $VALUES;
    public static final t4j AUTH_ERROR;
    public static final t4j BAD_CONFIG;
    public static final t4j OK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t4j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t4j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t4j] */
    static {
        ?? r0 = new Enum("OK", 0);
        OK = r0;
        ?? r1 = new Enum("BAD_CONFIG", 1);
        BAD_CONFIG = r1;
        ?? r2 = new Enum("AUTH_ERROR", 2);
        AUTH_ERROR = r2;
        $VALUES = new t4j[]{r0, r1, r2};
    }

    public static t4j valueOf(String str) {
        return (t4j) Enum.valueOf(t4j.class, str);
    }

    public static t4j[] values() {
        return (t4j[]) $VALUES.clone();
    }
}
