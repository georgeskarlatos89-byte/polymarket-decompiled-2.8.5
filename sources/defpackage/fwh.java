package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fwh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fwh[] $VALUES;
    public static final fwh Corners;
    public static final fwh RedCards;
    public static final fwh YellowCards;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fwh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fwh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fwh] */
    static {
        ?? r0 = new Enum("YellowCards", 0);
        YellowCards = r0;
        ?? r1 = new Enum("RedCards", 1);
        RedCards = r1;
        ?? r2 = new Enum("Corners", 2);
        Corners = r2;
        fwh[] fwhVarArr = {r0, r1, r2};
        $VALUES = fwhVarArr;
        $ENTRIES = new wg7(fwhVarArr);
    }

    public static fwh valueOf(String str) {
        return (fwh) Enum.valueOf(fwh.class, str);
    }

    public static fwh[] values() {
        return (fwh[]) $VALUES.clone();
    }
}
