package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class awa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ awa[] $VALUES;
    public static final awa ACTIVITY_CLEAR_TOP;
    public static final awa ACTIVITY_NEW_TASK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, awa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, awa] */
    static {
        ?? r0 = new Enum("ACTIVITY_NEW_TASK", 0);
        ACTIVITY_NEW_TASK = r0;
        ?? r1 = new Enum("ACTIVITY_CLEAR_TOP", 1);
        ACTIVITY_CLEAR_TOP = r1;
        awa[] awaVarArr = {r0, r1};
        $VALUES = awaVarArr;
        $ENTRIES = new wg7(awaVarArr);
    }

    public static awa valueOf(String str) {
        return (awa) Enum.valueOf(awa.class, str);
    }

    public static awa[] values() {
        return (awa[]) $VALUES.clone();
    }
}
