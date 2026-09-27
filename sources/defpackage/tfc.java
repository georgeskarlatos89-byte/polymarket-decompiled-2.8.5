package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tfc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tfc[] $VALUES;
    public static final tfc Brand;
    public static final tfc Elevated;

    /* JADX WARN: Type inference failed for: r0v0, types: [tfc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tfc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Brand", 0);
        Brand = r0;
        ?? r1 = new Enum("Elevated", 1);
        Elevated = r1;
        tfc[] tfcVarArr = {r0, r1};
        $VALUES = tfcVarArr;
        $ENTRIES = new wg7(tfcVarArr);
    }

    public static tfc valueOf(String str) {
        return (tfc) Enum.valueOf(tfc.class, str);
    }

    public static tfc[] values() {
        return (tfc[]) $VALUES.clone();
    }
}
