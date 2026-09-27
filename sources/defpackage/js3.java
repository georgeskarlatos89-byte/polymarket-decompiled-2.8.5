package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class js3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ js3[] $VALUES;
    public static final js3 Idle;
    public static final js3 Loading;
    public static final js3 ReachedTop;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, js3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, js3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, js3] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Loading", 1);
        Loading = r1;
        ?? r2 = new Enum("ReachedTop", 2);
        ReachedTop = r2;
        js3[] js3VarArr = {r0, r1, r2};
        $VALUES = js3VarArr;
        $ENTRIES = new wg7(js3VarArr);
    }

    public static js3 valueOf(String str) {
        return (js3) Enum.valueOf(js3.class, str);
    }

    public static js3[] values() {
        return (js3[]) $VALUES.clone();
    }
}
