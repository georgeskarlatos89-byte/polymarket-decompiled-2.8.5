package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sic {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sic[] $VALUES;
    public static final sic ABSTRACT;
    public static final qic Companion;
    public static final sic FINAL;
    public static final sic OPEN;
    public static final sic SEALED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sic] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qic] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sic] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sic] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, sic] */
    static {
        ?? r0 = new Enum("FINAL", 0);
        FINAL = r0;
        ?? r1 = new Enum("SEALED", 1);
        SEALED = r1;
        ?? r2 = new Enum("OPEN", 2);
        OPEN = r2;
        ?? r3 = new Enum("ABSTRACT", 3);
        ABSTRACT = r3;
        sic[] sicVarArr = {r0, r1, r2, r3};
        $VALUES = sicVarArr;
        $ENTRIES = new wg7(sicVarArr);
        Companion = new Object();
    }

    public static sic valueOf(String str) {
        return (sic) Enum.valueOf(sic.class, str);
    }

    public static sic[] values() {
        return (sic[]) $VALUES.clone();
    }
}
