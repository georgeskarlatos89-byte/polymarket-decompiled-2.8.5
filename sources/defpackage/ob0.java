package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ob0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ob0[] $VALUES;
    public static final ob0 CALL_BY_NAME;
    public static final ob0 POSITIONAL_CALL;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ob0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ob0] */
    static {
        ?? r0 = new Enum("CALL_BY_NAME", 0);
        CALL_BY_NAME = r0;
        ?? r1 = new Enum("POSITIONAL_CALL", 1);
        POSITIONAL_CALL = r1;
        ob0[] ob0VarArr = {r0, r1};
        $VALUES = ob0VarArr;
        $ENTRIES = new wg7(ob0VarArr);
    }

    public static ob0 valueOf(String str) {
        return (ob0) Enum.valueOf(ob0.class, str);
    }

    public static ob0[] values() {
        return (ob0[]) $VALUES.clone();
    }
}
