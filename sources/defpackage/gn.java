package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gn {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gn[] $VALUES;
    public static final gn EC;
    public static final gn RSA;
    private final String key;

    static {
        gn gnVar = new gn("EC", 0, "EC");
        EC = gnVar;
        gn gnVar2 = new gn("RSA", 1, "RSA");
        RSA = gnVar2;
        gn[] gnVarArr = {gnVar, gnVar2};
        $VALUES = gnVarArr;
        $ENTRIES = new wg7(gnVarArr);
    }

    public gn(String str, int i, String str2) {
        this.key = str2;
    }

    public static gn valueOf(String str) {
        return (gn) Enum.valueOf(gn.class, str);
    }

    public static gn[] values() {
        return (gn[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.key;
    }
}
