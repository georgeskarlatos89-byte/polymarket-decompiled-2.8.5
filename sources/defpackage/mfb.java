package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mfb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mfb[] $VALUES;
    public static final mfb InlineKnockout;
    public static final mfb Primary;
    public static final mfb TermsKnockoutBlack;
    public static final mfb TermsKnockoutWhite;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mfb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mfb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mfb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mfb] */
    static {
        ?? r0 = new Enum("Primary", 0);
        Primary = r0;
        ?? r1 = new Enum("InlineKnockout", 1);
        InlineKnockout = r1;
        ?? r2 = new Enum("TermsKnockoutBlack", 2);
        TermsKnockoutBlack = r2;
        ?? r3 = new Enum("TermsKnockoutWhite", 3);
        TermsKnockoutWhite = r3;
        mfb[] mfbVarArr = {r0, r1, r2, r3};
        $VALUES = mfbVarArr;
        $ENTRIES = new wg7(mfbVarArr);
    }

    public static mfb valueOf(String str) {
        return (mfb) Enum.valueOf(mfb.class, str);
    }

    public static mfb[] values() {
        return (mfb[]) $VALUES.clone();
    }
}
