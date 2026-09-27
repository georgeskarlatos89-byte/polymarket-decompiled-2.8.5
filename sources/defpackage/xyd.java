package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xyd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xyd[] $VALUES;
    public static final xyd Applied;
    public static final xyd ApplyPending;
    public static final xyd Cancelled;
    public static final xyd InitialPending;
    public static final xyd Invalid;
    public static final xyd RecomposePending;
    public static final xyd Recomposing;

    /* JADX WARN: Type inference failed for: r0v0, types: [xyd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xyd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xyd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xyd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [xyd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [xyd, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [xyd, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Invalid", 0);
        Invalid = r0;
        ?? r1 = new Enum("Cancelled", 1);
        Cancelled = r1;
        ?? r2 = new Enum("InitialPending", 2);
        InitialPending = r2;
        ?? r3 = new Enum("RecomposePending", 3);
        RecomposePending = r3;
        ?? r4 = new Enum("Recomposing", 4);
        Recomposing = r4;
        ?? r5 = new Enum("ApplyPending", 5);
        ApplyPending = r5;
        ?? r6 = new Enum("Applied", 6);
        Applied = r6;
        xyd[] xydVarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = xydVarArr;
        $ENTRIES = new wg7(xydVarArr);
    }

    public static xyd valueOf(String str) {
        return (xyd) Enum.valueOf(xyd.class, str);
    }

    public static xyd[] values() {
        return (xyd[]) $VALUES.clone();
    }
}
