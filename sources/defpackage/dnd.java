package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dnd {
    private static final /* synthetic */ dnd[] $VALUES;
    public static final dnd DROP_WORK_REQUEST;
    public static final dnd RUN_AS_NON_EXPEDITED_WORK_REQUEST;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dnd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dnd] */
    static {
        ?? r0 = new Enum("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = r0;
        ?? r1 = new Enum("DROP_WORK_REQUEST", 1);
        DROP_WORK_REQUEST = r1;
        $VALUES = new dnd[]{r0, r1};
    }

    public static dnd valueOf(String str) {
        return (dnd) Enum.valueOf(dnd.class, str);
    }

    public static dnd[] values() {
        return (dnd[]) $VALUES.clone();
    }
}
