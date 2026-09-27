package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mtf {
    private static final /* synthetic */ mtf[] $VALUES;
    public static final mtf REDUCED_MOTION;
    public static final mtf STANDARD_MOTION;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mtf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mtf] */
    static {
        ?? r0 = new Enum("STANDARD_MOTION", 0);
        STANDARD_MOTION = r0;
        ?? r1 = new Enum("REDUCED_MOTION", 1);
        REDUCED_MOTION = r1;
        $VALUES = new mtf[]{r0, r1};
    }

    public static mtf valueOf(String str) {
        return (mtf) Enum.valueOf(mtf.class, str);
    }

    public static mtf[] values() {
        return (mtf[]) $VALUES.clone();
    }
}
