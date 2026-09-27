package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mge[] $VALUES;
    public static final mge FullPage;
    public static final mge PrimaryButtonAnchored;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mge] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mge] */
    static {
        ?? r0 = new Enum("PrimaryButtonAnchored", 0);
        PrimaryButtonAnchored = r0;
        ?? r1 = new Enum("FullPage", 1);
        FullPage = r1;
        mge[] mgeVarArr = {r0, r1};
        $VALUES = mgeVarArr;
        $ENTRIES = new wg7(mgeVarArr);
    }

    public static mge valueOf(String str) {
        return (mge) Enum.valueOf(mge.class, str);
    }

    public static mge[] values() {
        return (mge[]) $VALUES.clone();
    }
}
