package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h6f {
    private static final /* synthetic */ h6f[] $VALUES;
    public static final h6f HIGH;
    public static final h6f IMMEDIATE;
    public static final h6f LOW;
    public static final h6f NORMAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h6f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h6f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h6f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, h6f] */
    static {
        ?? r0 = new Enum("IMMEDIATE", 0);
        IMMEDIATE = r0;
        ?? r1 = new Enum("HIGH", 1);
        HIGH = r1;
        ?? r2 = new Enum("NORMAL", 2);
        NORMAL = r2;
        ?? r3 = new Enum("LOW", 3);
        LOW = r3;
        $VALUES = new h6f[]{r0, r1, r2, r3};
    }

    public static h6f valueOf(String str) {
        return (h6f) Enum.valueOf(h6f.class, str);
    }

    public static h6f[] values() {
        return (h6f[]) $VALUES.clone();
    }
}
