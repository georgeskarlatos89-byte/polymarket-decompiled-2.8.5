package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ng5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ng5[] $VALUES;
    public static final ng5 Cancelled;
    public static final ng5 None;
    public static final ng5 RedirectCancelled;
    public static final ng5 Redirected;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ng5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ng5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ng5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ng5] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("Cancelled", 1);
        Cancelled = r1;
        ?? r2 = new Enum("Redirected", 2);
        Redirected = r2;
        ?? r3 = new Enum("RedirectCancelled", 3);
        RedirectCancelled = r3;
        ng5[] ng5VarArr = {r0, r1, r2, r3};
        $VALUES = ng5VarArr;
        $ENTRIES = new wg7(ng5VarArr);
    }

    public static ng5 valueOf(String str) {
        return (ng5) Enum.valueOf(ng5.class, str);
    }

    public static ng5[] values() {
        return (ng5[]) $VALUES.clone();
    }
}
