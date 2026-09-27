package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j6d {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ j6d[] $VALUES;
    public static final j6d Timeout;
    public static final j6d UserInitiated;
    private final String analyticsValue;

    static {
        j6d j6dVar = new j6d("UserInitiated", 0, "user_initiated");
        UserInitiated = j6dVar;
        j6d j6dVar2 = new j6d("Timeout", 1, "scanning_timeout");
        Timeout = j6dVar2;
        j6d[] j6dVarArr = {j6dVar, j6dVar2};
        $VALUES = j6dVarArr;
        $ENTRIES = new wg7(j6dVarArr);
    }

    public j6d(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static j6d valueOf(String str) {
        return (j6d) Enum.valueOf(j6d.class, str);
    }

    public static j6d[] values() {
        return (j6d[]) $VALUES.clone();
    }

    public final String a() {
        return this.analyticsValue;
    }
}
