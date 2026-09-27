package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bbh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bbh[] $VALUES;
    public static final bbh Indefinite;
    public static final bbh Long;
    public static final bbh Short;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bbh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bbh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bbh] */
    static {
        ?? r0 = new Enum("Short", 0);
        Short = r0;
        ?? r1 = new Enum("Long", 1);
        Long = r1;
        ?? r2 = new Enum("Indefinite", 2);
        Indefinite = r2;
        bbh[] bbhVarArr = {r0, r1, r2};
        $VALUES = bbhVarArr;
        $ENTRIES = new wg7(bbhVarArr);
    }

    public static bbh valueOf(String str) {
        return (bbh) Enum.valueOf(bbh.class, str);
    }

    public static bbh[] values() {
        return (bbh[]) $VALUES.clone();
    }
}
