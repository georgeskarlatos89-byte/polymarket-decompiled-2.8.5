package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cx6 {
    private static final /* synthetic */ cx6[] $VALUES;
    public static final cx6 CENTER;
    public static final cx6 LEFT_ALIGN;
    public static final cx6 RIGHT_ALIGN;

    /* JADX WARN: Type inference failed for: r0v0, types: [cx6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cx6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cx6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LEFT_ALIGN", 0);
        LEFT_ALIGN = r0;
        ?? r1 = new Enum("RIGHT_ALIGN", 1);
        RIGHT_ALIGN = r1;
        ?? r2 = new Enum("CENTER", 2);
        CENTER = r2;
        $VALUES = new cx6[]{r0, r1, r2};
    }

    public static cx6 valueOf(String str) {
        return (cx6) Enum.valueOf(cx6.class, str);
    }

    public static cx6[] values() {
        return (cx6[]) $VALUES.clone();
    }
}
