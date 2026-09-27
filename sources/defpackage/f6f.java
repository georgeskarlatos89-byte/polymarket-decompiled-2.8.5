package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f6f {
    private static final /* synthetic */ f6f[] $VALUES;
    public static final f6f DEFAULT;
    public static final f6f HIGHEST;
    public static final f6f VERY_LOW;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f6f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f6f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f6f] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        DEFAULT = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        VERY_LOW = r1;
        ?? r2 = new Enum("HIGHEST", 2);
        HIGHEST = r2;
        $VALUES = new f6f[]{r0, r1, r2};
    }

    public static f6f valueOf(String str) {
        return (f6f) Enum.valueOf(f6f.class, str);
    }

    public static f6f[] values() {
        return (f6f[]) $VALUES.clone();
    }
}
