package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mhb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mhb[] $VALUES;
    public static final mhb LoggedIn;
    public static final mhb LoggedOut;
    public static final mhb NeedsVerification;
    public static final mhb NeedsWebVerification;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mhb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mhb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mhb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mhb] */
    static {
        ?? r0 = new Enum("LoggedIn", 0);
        LoggedIn = r0;
        ?? r1 = new Enum("NeedsVerification", 1);
        NeedsVerification = r1;
        ?? r2 = new Enum("NeedsWebVerification", 2);
        NeedsWebVerification = r2;
        ?? r3 = new Enum("LoggedOut", 3);
        LoggedOut = r3;
        mhb[] mhbVarArr = {r0, r1, r2, r3};
        $VALUES = mhbVarArr;
        $ENTRIES = new wg7(mhbVarArr);
    }

    public static mhb valueOf(String str) {
        return (mhb) Enum.valueOf(mhb.class, str);
    }

    public static mhb[] values() {
        return (mhb[]) $VALUES.clone();
    }
}
