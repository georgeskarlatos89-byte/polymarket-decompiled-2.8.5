package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mhg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mhg[] $VALUES;
    public static final mhg BottomBar;
    public static final mhg Fab;
    public static final mhg MainContent;
    public static final mhg Snackbar;
    public static final mhg TopBar;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mhg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mhg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mhg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mhg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, mhg] */
    static {
        ?? r0 = new Enum("TopBar", 0);
        TopBar = r0;
        ?? r1 = new Enum("MainContent", 1);
        MainContent = r1;
        ?? r2 = new Enum("Snackbar", 2);
        Snackbar = r2;
        ?? r3 = new Enum("Fab", 3);
        Fab = r3;
        ?? r4 = new Enum("BottomBar", 4);
        BottomBar = r4;
        mhg[] mhgVarArr = {r0, r1, r2, r3, r4};
        $VALUES = mhgVarArr;
        $ENTRIES = new wg7(mhgVarArr);
    }

    public static mhg valueOf(String str) {
        return (mhg) Enum.valueOf(mhg.class, str);
    }

    public static mhg[] values() {
        return (mhg[]) $VALUES.clone();
    }
}
