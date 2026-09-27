package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mz4 {
    private static final /* synthetic */ mz4[] $VALUES;
    public static final mz4 FIXED;
    public static final mz4 MATCH_CONSTRAINT;
    public static final mz4 MATCH_PARENT;
    public static final mz4 WRAP_CONTENT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mz4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mz4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mz4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mz4] */
    static {
        ?? r0 = new Enum("FIXED", 0);
        FIXED = r0;
        ?? r1 = new Enum("WRAP_CONTENT", 1);
        WRAP_CONTENT = r1;
        ?? r2 = new Enum("MATCH_CONSTRAINT", 2);
        MATCH_CONSTRAINT = r2;
        ?? r3 = new Enum("MATCH_PARENT", 3);
        MATCH_PARENT = r3;
        $VALUES = new mz4[]{r0, r1, r2, r3};
    }

    public static mz4 valueOf(String str) {
        return (mz4) Enum.valueOf(mz4.class, str);
    }

    public static mz4[] values() {
        return (mz4[]) $VALUES.clone();
    }
}
