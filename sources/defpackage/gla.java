package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gla {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gla[] $VALUES;
    public static final gla INTERNAL;
    public static final gla PRIVATE;
    public static final gla PROTECTED;
    public static final gla PUBLIC;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gla] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gla] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gla] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, gla] */
    static {
        ?? r0 = new Enum("PUBLIC", 0);
        PUBLIC = r0;
        ?? r1 = new Enum("PROTECTED", 1);
        PROTECTED = r1;
        ?? r2 = new Enum("INTERNAL", 2);
        INTERNAL = r2;
        ?? r3 = new Enum("PRIVATE", 3);
        PRIVATE = r3;
        gla[] glaVarArr = {r0, r1, r2, r3};
        $VALUES = glaVarArr;
        $ENTRIES = new wg7(glaVarArr);
    }

    public static gla valueOf(String str) {
        return (gla) Enum.valueOf(gla.class, str);
    }

    public static gla[] values() {
        return (gla[]) $VALUES.clone();
    }
}
