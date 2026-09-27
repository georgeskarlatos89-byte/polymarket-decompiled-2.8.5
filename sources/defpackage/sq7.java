package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sq7 {
    private static final /* synthetic */ sq7[] $VALUES;
    public static final sq7 APPEND;
    public static final sq7 APPEND_OR_REPLACE;
    public static final sq7 KEEP;
    public static final sq7 REPLACE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sq7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sq7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sq7] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, sq7] */
    static {
        ?? r0 = new Enum("REPLACE", 0);
        REPLACE = r0;
        ?? r1 = new Enum("KEEP", 1);
        KEEP = r1;
        ?? r2 = new Enum("APPEND", 2);
        APPEND = r2;
        ?? r3 = new Enum("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = r3;
        $VALUES = new sq7[]{r0, r1, r2, r3};
    }

    public static sq7 valueOf(String str) {
        return (sq7) Enum.valueOf(sq7.class, str);
    }

    public static sq7[] values() {
        return (sq7[]) $VALUES.clone();
    }
}
