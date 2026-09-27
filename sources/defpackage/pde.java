package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class pde {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pde[] $VALUES;
    public static final ode Companion;
    public static final pde Filled;
    public static final pde Outlined;

    /* renamed from: default, reason: not valid java name */
    private static final pde f413default;

    /* JADX WARN: Type inference failed for: r0v0, types: [pde, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pde, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ode, java.lang.Object] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Outlined", 1);
        Outlined = r1;
        pde[] pdeVarArr = {r0, r1};
        $VALUES = pdeVarArr;
        $ENTRIES = new wg7(pdeVarArr);
        Companion = new Object();
        f413default = r0;
    }

    public static final /* synthetic */ pde a() {
        return f413default;
    }

    public static pde valueOf(String str) {
        return (pde) Enum.valueOf(pde.class, str);
    }

    public static pde[] values() {
        return (pde[]) $VALUES.clone();
    }
}
