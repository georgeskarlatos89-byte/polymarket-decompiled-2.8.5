package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oy4 {
    private static final /* synthetic */ oy4[] $VALUES;
    public static final oy4 BASELINE;
    public static final oy4 BOTTOM;
    public static final oy4 CENTER;
    public static final oy4 CENTER_X;
    public static final oy4 CENTER_Y;
    public static final oy4 LEFT;
    public static final oy4 NONE;
    public static final oy4 RIGHT;
    public static final oy4 TOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, oy4] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, oy4] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("LEFT", 1);
        LEFT = r1;
        ?? r2 = new Enum("TOP", 2);
        TOP = r2;
        ?? r3 = new Enum("RIGHT", 3);
        RIGHT = r3;
        ?? r4 = new Enum("BOTTOM", 4);
        BOTTOM = r4;
        ?? r5 = new Enum("BASELINE", 5);
        BASELINE = r5;
        ?? r6 = new Enum("CENTER", 6);
        CENTER = r6;
        ?? r7 = new Enum("CENTER_X", 7);
        CENTER_X = r7;
        ?? r8 = new Enum("CENTER_Y", 8);
        CENTER_Y = r8;
        $VALUES = new oy4[]{r0, r1, r2, r3, r4, r5, r6, r7, r8};
    }

    public static oy4 valueOf(String str) {
        return (oy4) Enum.valueOf(oy4.class, str);
    }

    public static oy4[] values() {
        return (oy4[]) $VALUES.clone();
    }
}
