package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cyg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cyg[] $VALUES;
    public static final cyg EU;
    public static final cyg US;

    /* JADX WARN: Type inference failed for: r0v0, types: [cyg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cyg, java.lang.Enum] */
    static {
        ?? r0 = new Enum("US", 0);
        US = r0;
        ?? r1 = new Enum("EU", 1);
        EU = r1;
        cyg[] cygVarArr = {r0, r1};
        $VALUES = cygVarArr;
        $ENTRIES = new wg7(cygVarArr);
    }

    public static cyg valueOf(String str) {
        return (cyg) Enum.valueOf(cyg.class, str);
    }

    public static cyg[] values() {
        return (cyg[]) $VALUES.clone();
    }
}
