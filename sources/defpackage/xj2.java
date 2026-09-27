package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xj2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xj2[] $VALUES;
    public static final xj2 Cashout;
    public static final xj2 Logo;

    /* JADX WARN: Type inference failed for: r0v0, types: [xj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xj2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Cashout", 0);
        Cashout = r0;
        ?? r1 = new Enum("Logo", 1);
        Logo = r1;
        xj2[] xj2VarArr = {r0, r1};
        $VALUES = xj2VarArr;
        $ENTRIES = new wg7(xj2VarArr);
    }

    public static xj2 valueOf(String str) {
        return (xj2) Enum.valueOf(xj2.class, str);
    }

    public static xj2[] values() {
        return (xj2[]) $VALUES.clone();
    }
}
