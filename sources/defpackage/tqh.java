package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tqh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tqh[] $VALUES;
    public static final tqh Centered;
    public static final tqh Leading;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tqh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tqh] */
    static {
        ?? r0 = new Enum("Centered", 0);
        Centered = r0;
        ?? r1 = new Enum("Leading", 1);
        Leading = r1;
        tqh[] tqhVarArr = {r0, r1};
        $VALUES = tqhVarArr;
        $ENTRIES = new wg7(tqhVarArr);
    }

    public static tqh valueOf(String str) {
        return (tqh) Enum.valueOf(tqh.class, str);
    }

    public static tqh[] values() {
        return (tqh[]) $VALUES.clone();
    }
}
