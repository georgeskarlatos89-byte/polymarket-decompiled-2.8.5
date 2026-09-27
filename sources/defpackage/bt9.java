package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bt9 {
    private static final /* synthetic */ bt9[] $VALUES;
    public static final bt9 BLOCKS;
    public static final bt9 BLOCKS_AND_INLINES;
    public static final bt9 NONE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bt9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bt9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bt9] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("BLOCKS", 1);
        BLOCKS = r1;
        ?? r2 = new Enum("BLOCKS_AND_INLINES", 2);
        BLOCKS_AND_INLINES = r2;
        $VALUES = new bt9[]{r0, r1, r2};
    }

    public static bt9 valueOf(String str) {
        return (bt9) Enum.valueOf(bt9.class, str);
    }

    public static bt9[] values() {
        return (bt9[]) $VALUES.clone();
    }
}
