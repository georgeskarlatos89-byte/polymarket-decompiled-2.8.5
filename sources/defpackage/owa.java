package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class owa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ owa[] $VALUES;
    public static final owa Ltr;
    public static final owa Rtl;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, owa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, owa] */
    static {
        ?? r0 = new Enum("Ltr", 0);
        Ltr = r0;
        ?? r1 = new Enum("Rtl", 1);
        Rtl = r1;
        owa[] owaVarArr = {r0, r1};
        $VALUES = owaVarArr;
        $ENTRIES = new wg7(owaVarArr);
    }

    public static owa valueOf(String str) {
        return (owa) Enum.valueOf(owa.class, str);
    }

    public static owa[] values() {
        return (owa[]) $VALUES.clone();
    }
}
