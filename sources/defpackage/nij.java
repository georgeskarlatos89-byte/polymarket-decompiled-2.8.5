package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nij {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nij[] $VALUES;
    public static final nij IN;
    public static final nij INV;
    public static final nij OUT;
    private final String presentation;

    static {
        nij nijVar = new nij("IN", 0, "in");
        IN = nijVar;
        nij nijVar2 = new nij("OUT", 1, "out");
        OUT = nijVar2;
        nij nijVar3 = new nij("INV", 2, "");
        INV = nijVar3;
        nij[] nijVarArr = {nijVar, nijVar2, nijVar3};
        $VALUES = nijVarArr;
        $ENTRIES = new wg7(nijVarArr);
    }

    public nij(String str, int i, String str2) {
        this.presentation = str2;
    }

    public static nij valueOf(String str) {
        return (nij) Enum.valueOf(nij.class, str);
    }

    public static nij[] values() {
        return (nij[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.presentation;
    }
}
