package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xqf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xqf[] $VALUES;
    public static final xqf FromCompact;
    public static final xqf FromExpanded;
    public static final xqf FromFullScreen;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xqf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xqf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xqf] */
    static {
        ?? r0 = new Enum("FromCompact", 0);
        FromCompact = r0;
        ?? r1 = new Enum("FromExpanded", 1);
        FromExpanded = r1;
        ?? r2 = new Enum("FromFullScreen", 2);
        FromFullScreen = r2;
        xqf[] xqfVarArr = {r0, r1, r2};
        $VALUES = xqfVarArr;
        $ENTRIES = new wg7(xqfVarArr);
    }

    public static xqf valueOf(String str) {
        return (xqf) Enum.valueOf(xqf.class, str);
    }

    public static xqf[] values() {
        return (xqf[]) $VALUES.clone();
    }
}
