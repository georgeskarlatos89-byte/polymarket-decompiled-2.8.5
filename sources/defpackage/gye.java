package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gye {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gye[] $VALUES;
    public static final gye Payment;
    public static final gye Setup;
    private final String type;

    static {
        gye gyeVar = new gye("Payment", 0, "payment");
        Payment = gyeVar;
        gye gyeVar2 = new gye("Setup", 1, "setup");
        Setup = gyeVar2;
        gye[] gyeVarArr = {gyeVar, gyeVar2};
        $VALUES = gyeVarArr;
        $ENTRIES = new wg7(gyeVarArr);
    }

    public gye(String str, int i, String str2) {
        this.type = str2;
    }

    public static gye valueOf(String str) {
        return (gye) Enum.valueOf(gye.class, str);
    }

    public static gye[] values() {
        return (gye[]) $VALUES.clone();
    }

    public final String a() {
        return this.type;
    }
}
