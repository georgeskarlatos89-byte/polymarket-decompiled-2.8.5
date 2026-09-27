package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f0e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f0e[] $VALUES;
    public static final f0e CREDIT;
    public static final f0e DEBIT;
    private final String stringValue;

    static {
        f0e f0eVar = new f0e("CREDIT", 0, "credit");
        CREDIT = f0eVar;
        f0e f0eVar2 = new f0e("DEBIT", 1, "debit");
        DEBIT = f0eVar2;
        f0e[] f0eVarArr = {f0eVar, f0eVar2};
        $VALUES = f0eVarArr;
        $ENTRIES = new wg7(f0eVarArr);
    }

    public f0e(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static f0e valueOf(String str) {
        return (f0e) Enum.valueOf(f0e.class, str);
    }

    public static f0e[] values() {
        return (f0e[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}
