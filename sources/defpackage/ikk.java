package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ikk {
    private static final /* synthetic */ ikk[] $VALUES;
    public static final ikk CENTER;
    public static final ikk END;
    public static final ikk NONE;
    public static final ikk START;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ikk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ikk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ikk] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ikk] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("START", 1);
        START = r1;
        ?? r2 = new Enum("END", 2);
        END = r2;
        ?? r3 = new Enum("CENTER", 3);
        CENTER = r3;
        $VALUES = new ikk[]{r0, r1, r2, r3};
    }

    public static ikk valueOf(String str) {
        return (ikk) Enum.valueOf(ikk.class, str);
    }

    public static ikk[] values() {
        return (ikk[]) $VALUES.clone();
    }
}
