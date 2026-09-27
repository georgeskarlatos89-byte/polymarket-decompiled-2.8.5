package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class f4c {
    private static final /* synthetic */ f4c[] $VALUES;
    public static final f4c BOTH;
    public static final f4c END;
    public static final f4c NONE;
    public static final f4c START;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f4c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f4c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f4c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, f4c] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("START", 1);
        START = r1;
        ?? r2 = new Enum("END", 2);
        END = r2;
        ?? r3 = new Enum("BOTH", 3);
        BOTH = r3;
        $VALUES = new f4c[]{r0, r1, r2, r3};
    }

    public static f4c valueOf(String str) {
        return (f4c) Enum.valueOf(f4c.class, str);
    }

    public static f4c[] values() {
        return (f4c[]) $VALUES.clone();
    }
}
