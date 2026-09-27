package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mwh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mwh[] $VALUES;
    public static final mwh AFTER_DOT;
    public static final mwh BEGINNING;
    public static final mwh MIDDLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mwh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mwh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mwh] */
    static {
        ?? r0 = new Enum("BEGINNING", 0);
        BEGINNING = r0;
        ?? r1 = new Enum("MIDDLE", 1);
        MIDDLE = r1;
        ?? r2 = new Enum("AFTER_DOT", 2);
        AFTER_DOT = r2;
        mwh[] mwhVarArr = {r0, r1, r2};
        $VALUES = mwhVarArr;
        $ENTRIES = new wg7(mwhVarArr);
    }

    public static mwh valueOf(String str) {
        return (mwh) Enum.valueOf(mwh.class, str);
    }

    public static mwh[] values() {
        return (mwh[]) $VALUES.clone();
    }
}
