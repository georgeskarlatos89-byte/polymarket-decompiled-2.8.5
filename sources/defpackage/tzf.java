package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tzf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tzf[] $VALUES;
    public static final tzf Restart;
    public static final tzf Reverse;

    /* JADX WARN: Type inference failed for: r0v0, types: [tzf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tzf, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Restart", 0);
        Restart = r0;
        ?? r1 = new Enum("Reverse", 1);
        Reverse = r1;
        tzf[] tzfVarArr = {r0, r1};
        $VALUES = tzfVarArr;
        $ENTRIES = new wg7(tzfVarArr);
    }

    public static tzf valueOf(String str) {
        return (tzf) Enum.valueOf(tzf.class, str);
    }

    public static tzf[] values() {
        return (tzf[]) $VALUES.clone();
    }
}
