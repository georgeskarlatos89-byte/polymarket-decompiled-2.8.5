package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class t6k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ t6k[] $VALUES;
    public static final t6k EMAIL;
    public static final t6k SMS;
    private final String value;

    static {
        t6k t6kVar = new t6k("EMAIL", 0, "EMAIL");
        EMAIL = t6kVar;
        t6k t6kVar2 = new t6k("SMS", 1, "SMS");
        SMS = t6kVar2;
        t6k[] t6kVarArr = {t6kVar, t6kVar2};
        $VALUES = t6kVarArr;
        $ENTRIES = new wg7(t6kVarArr);
    }

    public t6k(String str, int i, String str2) {
        this.value = str2;
    }

    public static t6k valueOf(String str) {
        return (t6k) Enum.valueOf(t6k.class, str);
    }

    public static t6k[] values() {
        return (t6k[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
