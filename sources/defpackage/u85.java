package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class u85 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ u85[] $VALUES;
    public static final u85 COROUTINE_SUSPENDED;
    public static final u85 RESUMED;
    public static final u85 UNDECIDED;

    /* JADX WARN: Type inference failed for: r0v0, types: [u85, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u85, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u85, java.lang.Enum] */
    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = r0;
        ?? r1 = new Enum("UNDECIDED", 1);
        UNDECIDED = r1;
        ?? r2 = new Enum("RESUMED", 2);
        RESUMED = r2;
        u85[] u85VarArr = {r0, r1, r2};
        $VALUES = u85VarArr;
        $ENTRIES = new wg7(u85VarArr);
    }

    public static u85 valueOf(String str) {
        return (u85) Enum.valueOf(u85.class, str);
    }

    public static u85[] values() {
        return (u85[]) $VALUES.clone();
    }
}
