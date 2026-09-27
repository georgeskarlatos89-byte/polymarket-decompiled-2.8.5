package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vve {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vve[] $VALUES;
    public static final vve Content;
    public static final vve Loading;
    public static final vve Status;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vve] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vve] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vve] */
    static {
        ?? r0 = new Enum("Loading", 0);
        Loading = r0;
        ?? r1 = new Enum("Status", 1);
        Status = r1;
        ?? r2 = new Enum("Content", 2);
        Content = r2;
        vve[] vveVarArr = {r0, r1, r2};
        $VALUES = vveVarArr;
        $ENTRIES = new wg7(vveVarArr);
    }

    public static vve valueOf(String str) {
        return (vve) Enum.valueOf(vve.class, str);
    }

    public static vve[] values() {
        return (vve[]) $VALUES.clone();
    }
}
