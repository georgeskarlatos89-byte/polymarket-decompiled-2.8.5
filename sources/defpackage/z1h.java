package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z1h {
    private static final /* synthetic */ z1h[] $VALUES;
    public static final z1h BUTT;
    public static final z1h ROUND;
    public static final z1h UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [z1h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z1h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [z1h, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BUTT", 0);
        BUTT = r0;
        ?? r1 = new Enum("ROUND", 1);
        ROUND = r1;
        ?? r2 = new Enum("UNKNOWN", 2);
        UNKNOWN = r2;
        $VALUES = new z1h[]{r0, r1, r2};
    }

    public static z1h valueOf(String str) {
        return (z1h) Enum.valueOf(z1h.class, str);
    }

    public static z1h[] values() {
        return (z1h[]) $VALUES.clone();
    }
}
