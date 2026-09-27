package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q0e[] $VALUES;
    public static final q0e USER_ACTION_COMMIT;
    public static final q0e USER_ACTION_DEFAULT;
    public static final q0e USER_ACTION_SETUP_NOW;
    private final String stringValue;

    static {
        q0e q0eVar = new q0e("USER_ACTION_DEFAULT", 0, "");
        USER_ACTION_DEFAULT = q0eVar;
        q0e q0eVar2 = new q0e("USER_ACTION_COMMIT", 1, "commit");
        USER_ACTION_COMMIT = q0eVar2;
        q0e q0eVar3 = new q0e("USER_ACTION_SETUP_NOW", 2, "setup_now");
        USER_ACTION_SETUP_NOW = q0eVar3;
        q0e[] q0eVarArr = {q0eVar, q0eVar2, q0eVar3};
        $VALUES = q0eVarArr;
        $ENTRIES = new wg7(q0eVarArr);
    }

    public q0e(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static q0e valueOf(String str) {
        return (q0e) Enum.valueOf(q0e.class, str);
    }

    public static q0e[] values() {
        return (q0e[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}
