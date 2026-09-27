package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vze {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vze[] $VALUES;
    public static final vze All;
    public static final vze Bottom;
    public static final vze None;
    public static final vze Top;

    /* JADX WARN: Type inference failed for: r0v0, types: [vze, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vze, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [vze, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [vze, java.lang.Enum] */
    static {
        ?? r0 = new Enum("All", 0);
        All = r0;
        ?? r1 = new Enum("Top", 1);
        Top = r1;
        ?? r2 = new Enum("Bottom", 2);
        Bottom = r2;
        ?? r3 = new Enum("None", 3);
        None = r3;
        vze[] vzeVarArr = {r0, r1, r2, r3};
        $VALUES = vzeVarArr;
        $ENTRIES = new wg7(vzeVarArr);
    }

    public static vze valueOf(String str) {
        return (vze) Enum.valueOf(vze.class, str);
    }

    public static vze[] values() {
        return (vze[]) $VALUES.clone();
    }
}
