package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cie {
    public static final cie ActionRequired;
    public static final cie Approved;
    public static final cie Declined;
    private static final /* synthetic */ cie[] b;
    private static final /* synthetic */ ug7 c;
    private final String a;

    static {
        cie cieVar = new cie("ActionRequired", 0, "Action Required");
        ActionRequired = cieVar;
        cie cieVar2 = new cie("Approved", 1, "Approved");
        Approved = cieVar2;
        cie cieVar3 = new cie("Declined", 2, "Declined");
        Declined = cieVar3;
        cie[] cieVarArr = {cieVar, cieVar2, cieVar3};
        b = cieVarArr;
        c = new wg7(cieVarArr);
    }

    public cie(String str, int i, String str2) {
        this.a = str2;
    }

    public static ug7 a() {
        return c;
    }

    public static cie valueOf(String str) {
        return (cie) Enum.valueOf(cie.class, str);
    }

    public static cie[] values() {
        return (cie[]) b.clone();
    }

    public final String b() {
        return this.a;
    }
}
