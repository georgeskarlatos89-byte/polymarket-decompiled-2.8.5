package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nra {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nra[] $VALUES;
    public static final nra IN;
    public static final nra INVARIANT;
    public static final nra OUT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nra] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nra] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nra] */
    static {
        ?? r0 = new Enum("INVARIANT", 0);
        INVARIANT = r0;
        ?? r1 = new Enum("IN", 1);
        IN = r1;
        ?? r2 = new Enum("OUT", 2);
        OUT = r2;
        nra[] nraVarArr = {r0, r1, r2};
        $VALUES = nraVarArr;
        $ENTRIES = new wg7(nraVarArr);
    }

    public static nra valueOf(String str) {
        return (nra) Enum.valueOf(nra.class, str);
    }

    public static nra[] values() {
        return (nra[]) $VALUES.clone();
    }
}
