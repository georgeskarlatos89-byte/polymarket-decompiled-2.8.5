package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class pqh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pqh[] $VALUES;
    public static final pqh BottomLeft;
    public static final pqh TopLeft;
    public static final pqh TopRight;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pqh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pqh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pqh] */
    static {
        ?? r0 = new Enum("TopLeft", 0);
        TopLeft = r0;
        ?? r1 = new Enum("TopRight", 1);
        TopRight = r1;
        ?? r2 = new Enum("BottomLeft", 2);
        BottomLeft = r2;
        pqh[] pqhVarArr = {r0, r1, r2};
        $VALUES = pqhVarArr;
        $ENTRIES = new wg7(pqhVarArr);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static pqh valueOf(String str) {
        return (pqh) Enum.valueOf(pqh.class, str);
    }

    public static pqh[] values() {
        return (pqh[]) $VALUES.clone();
    }
}
