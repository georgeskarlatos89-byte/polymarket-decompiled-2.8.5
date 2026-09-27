package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wfd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wfd[] $VALUES;
    public static final wfd ADD;
    public static final wfd NO_OP;
    public static final wfd REMOVE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wfd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wfd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wfd] */
    static {
        ?? r0 = new Enum("NO_OP", 0);
        NO_OP = r0;
        ?? r1 = new Enum("ADD", 1);
        ADD = r1;
        ?? r2 = new Enum("REMOVE", 2);
        REMOVE = r2;
        wfd[] wfdVarArr = {r0, r1, r2};
        $VALUES = wfdVarArr;
        $ENTRIES = new wg7(wfdVarArr);
    }

    public static wfd valueOf(String str) {
        return (wfd) Enum.valueOf(wfd.class, str);
    }

    public static wfd[] values() {
        return (wfd[]) $VALUES.clone();
    }
}
