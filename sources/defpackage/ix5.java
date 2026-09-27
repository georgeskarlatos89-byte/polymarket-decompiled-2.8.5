package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ix5 {
    private static final /* synthetic */ ix5[] $VALUES;
    public static final ix5 DATA_CACHE;
    public static final ix5 ENCODE;
    public static final ix5 FINISHED;
    public static final ix5 INITIALIZE;
    public static final ix5 RESOURCE_CACHE;
    public static final ix5 SOURCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ix5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ix5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ix5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ix5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ix5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ix5] */
    static {
        ?? r0 = new Enum("INITIALIZE", 0);
        INITIALIZE = r0;
        ?? r1 = new Enum("RESOURCE_CACHE", 1);
        RESOURCE_CACHE = r1;
        ?? r2 = new Enum("DATA_CACHE", 2);
        DATA_CACHE = r2;
        ?? r3 = new Enum("SOURCE", 3);
        SOURCE = r3;
        ?? r4 = new Enum("ENCODE", 4);
        ENCODE = r4;
        ?? r5 = new Enum("FINISHED", 5);
        FINISHED = r5;
        $VALUES = new ix5[]{r0, r1, r2, r3, r4, r5};
    }

    public static ix5 valueOf(String str) {
        return (ix5) Enum.valueOf(ix5.class, str);
    }

    public static ix5[] values() {
        return (ix5[]) $VALUES.clone();
    }
}
