package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xmd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xmd[] $VALUES;
    public static final xmd Horizontal;
    public static final xmd Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xmd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xmd] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        Vertical = r0;
        ?? r1 = new Enum("Horizontal", 1);
        Horizontal = r1;
        xmd[] xmdVarArr = {r0, r1};
        $VALUES = xmdVarArr;
        $ENTRIES = new wg7(xmdVarArr);
    }

    public static xmd valueOf(String str) {
        return (xmd) Enum.valueOf(xmd.class, str);
    }

    public static xmd[] values() {
        return (xmd[]) $VALUES.clone();
    }
}
