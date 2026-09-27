package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 BACKING_FIELD;
    public static final t0 DELEGATE_FIELD;
    public static final t0 PROPERTY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t0] */
    static {
        ?? r0 = new Enum("PROPERTY", 0);
        PROPERTY = r0;
        ?? r1 = new Enum("BACKING_FIELD", 1);
        BACKING_FIELD = r1;
        ?? r2 = new Enum("DELEGATE_FIELD", 2);
        DELEGATE_FIELD = r2;
        t0[] t0VarArr = {r0, r1, r2};
        $VALUES = t0VarArr;
        $ENTRIES = new wg7(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
