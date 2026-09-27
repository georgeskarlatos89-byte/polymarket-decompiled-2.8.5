package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f3g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f3g[] $VALUES;
    public static final f3g Ltr;
    public static final f3g Rtl;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f3g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f3g] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        Ltr = r0;
        ?? r1 = new Enum("Rtl", 1);
        Rtl = r1;
        f3g[] f3gVarArr = {r0, r1};
        $VALUES = f3gVarArr;
        $ENTRIES = new wg7(f3gVarArr);
    }

    public static f3g valueOf(String str) {
        return (f3g) Enum.valueOf(f3g.class, str);
    }

    public static f3g[] values() {
        return (f3g[]) $VALUES.clone();
    }
}
