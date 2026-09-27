package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k2f {
    private static final /* synthetic */ k2f[] $VALUES;
    public static final k2f DISPLAY_P3;
    public static final k2f SRGB;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k2f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k2f] */
    static {
        ?? r0 = new Enum("SRGB", 0);
        SRGB = r0;
        ?? r1 = new Enum("DISPLAY_P3", 1);
        DISPLAY_P3 = r1;
        $VALUES = new k2f[]{r0, r1};
    }

    public static k2f valueOf(String str) {
        return (k2f) Enum.valueOf(k2f.class, str);
    }

    public static k2f[] values() {
        return (k2f[]) $VALUES.clone();
    }
}
