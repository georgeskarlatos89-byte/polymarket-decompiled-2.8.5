package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wre {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wre[] $VALUES;
    public static final wre Before;
    public static final wre Destination;
    public static final wre Enrichment;
    public static final wre Observe;
    public static final wre Utility;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wre] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wre] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wre] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wre] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, wre] */
    static {
        ?? r0 = new Enum("Before", 0);
        Before = r0;
        ?? r1 = new Enum("Enrichment", 1);
        Enrichment = r1;
        ?? r2 = new Enum("Destination", 2);
        Destination = r2;
        ?? r3 = new Enum("Utility", 3);
        Utility = r3;
        ?? r4 = new Enum("Observe", 4);
        Observe = r4;
        wre[] wreVarArr = {r0, r1, r2, r3, r4};
        $VALUES = wreVarArr;
        $ENTRIES = new wg7(wreVarArr);
    }

    public static wre valueOf(String str) {
        return (wre) Enum.valueOf(wre.class, str);
    }

    public static wre[] values() {
        return (wre[]) $VALUES.clone();
    }
}
