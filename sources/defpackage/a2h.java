package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a2h {
    private static final /* synthetic */ a2h[] $VALUES;
    public static final a2h BEVEL;
    public static final a2h MITER;
    public static final a2h ROUND;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a2h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a2h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a2h] */
    static {
        ?? r0 = new Enum("MITER", 0);
        MITER = r0;
        ?? r1 = new Enum("ROUND", 1);
        ROUND = r1;
        ?? r2 = new Enum("BEVEL", 2);
        BEVEL = r2;
        $VALUES = new a2h[]{r0, r1, r2};
    }

    public static a2h valueOf(String str) {
        return (a2h) Enum.valueOf(a2h.class, str);
    }

    public static a2h[] values() {
        return (a2h[]) $VALUES.clone();
    }
}
