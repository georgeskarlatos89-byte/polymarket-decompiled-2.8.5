package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wl6 {
    private static final /* synthetic */ wl6[] $VALUES;
    public static final wl6 BASELINE;
    public static final wl6 BOTTOM;
    public static final wl6 HORIZONTAL_DIMENSION;
    public static final wl6 LEFT;
    public static final wl6 RIGHT;
    public static final wl6 TOP;
    public static final wl6 UNKNOWN;
    public static final wl6 VERTICAL_DIMENSION;

    /* JADX WARN: Type inference failed for: r0v0, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [wl6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [wl6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("HORIZONTAL_DIMENSION", 1);
        HORIZONTAL_DIMENSION = r1;
        ?? r2 = new Enum("VERTICAL_DIMENSION", 2);
        VERTICAL_DIMENSION = r2;
        ?? r3 = new Enum("LEFT", 3);
        LEFT = r3;
        ?? r4 = new Enum("RIGHT", 4);
        RIGHT = r4;
        ?? r5 = new Enum("TOP", 5);
        TOP = r5;
        ?? r6 = new Enum("BOTTOM", 6);
        BOTTOM = r6;
        ?? r7 = new Enum("BASELINE", 7);
        BASELINE = r7;
        $VALUES = new wl6[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public static wl6 valueOf(String str) {
        return (wl6) Enum.valueOf(wl6.class, str);
    }

    public static wl6[] values() {
        return (wl6[]) $VALUES.clone();
    }
}
