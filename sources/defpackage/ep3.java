package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ep3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ep3[] $VALUES;
    public static final ep3 Standard;
    public static final ep3 TeamHeader;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ep3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ep3] */
    static {
        ?? r0 = new Enum("Standard", 0);
        Standard = r0;
        ?? r1 = new Enum("TeamHeader", 1);
        TeamHeader = r1;
        ep3[] ep3VarArr = {r0, r1};
        $VALUES = ep3VarArr;
        $ENTRIES = new wg7(ep3VarArr);
    }

    public static ep3 valueOf(String str) {
        return (ep3) Enum.valueOf(ep3.class, str);
    }

    public static ep3[] values() {
        return (ep3[]) $VALUES.clone();
    }
}
