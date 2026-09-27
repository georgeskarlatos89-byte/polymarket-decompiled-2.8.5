package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j3c {
    private static final /* synthetic */ j3c[] $VALUES;
    public static final j3c MASK_MODE_ADD;
    public static final j3c MASK_MODE_INTERSECT;
    public static final j3c MASK_MODE_NONE;
    public static final j3c MASK_MODE_SUBTRACT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j3c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j3c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j3c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j3c] */
    static {
        ?? r0 = new Enum("MASK_MODE_ADD", 0);
        MASK_MODE_ADD = r0;
        ?? r1 = new Enum("MASK_MODE_SUBTRACT", 1);
        MASK_MODE_SUBTRACT = r1;
        ?? r2 = new Enum("MASK_MODE_INTERSECT", 2);
        MASK_MODE_INTERSECT = r2;
        ?? r3 = new Enum("MASK_MODE_NONE", 3);
        MASK_MODE_NONE = r3;
        $VALUES = new j3c[]{r0, r1, r2, r3};
    }

    public static j3c valueOf(String str) {
        return (j3c) Enum.valueOf(j3c.class, str);
    }

    public static j3c[] values() {
        return (j3c[]) $VALUES.clone();
    }
}
