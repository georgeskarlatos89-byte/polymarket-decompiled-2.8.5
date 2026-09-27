package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wyg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wyg[] $VALUES;
    public static final wyg SESSION_ENDED;
    public static final wyg SESSION_STARTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wyg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wyg] */
    static {
        ?? r0 = new Enum("SESSION_STARTED", 0);
        SESSION_STARTED = r0;
        ?? r1 = new Enum("SESSION_ENDED", 1);
        SESSION_ENDED = r1;
        wyg[] wygVarArr = {r0, r1};
        $VALUES = wygVarArr;
        $ENTRIES = new wg7(wygVarArr);
    }

    public static wyg valueOf(String str) {
        return (wyg) Enum.valueOf(wyg.class, str);
    }

    public static wyg[] values() {
        return (wyg[]) $VALUES.clone();
    }
}
