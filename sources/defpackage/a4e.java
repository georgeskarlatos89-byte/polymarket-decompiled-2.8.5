package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a4e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a4e[] $VALUES;
    public static final a4e Abandoned;
    public static final a4e Automatic;
    public static final z3e Companion;
    public static final a4e Duplicate;
    public static final a4e FailedInvoice;
    public static final a4e Fraudulent;
    public static final a4e RequestedByCustomer;
    public static final a4e VoidInvoice;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z3e] */
    static {
        a4e a4eVar = new a4e("Duplicate", 0, "duplicate");
        Duplicate = a4eVar;
        a4e a4eVar2 = new a4e("Fraudulent", 1, "fraudulent");
        Fraudulent = a4eVar2;
        a4e a4eVar3 = new a4e("RequestedByCustomer", 2, "requested_by_customer");
        RequestedByCustomer = a4eVar3;
        a4e a4eVar4 = new a4e("Abandoned", 3, "abandoned");
        Abandoned = a4eVar4;
        a4e a4eVar5 = new a4e("FailedInvoice", 4, "failed_invoice");
        FailedInvoice = a4eVar5;
        a4e a4eVar6 = new a4e("VoidInvoice", 5, "void_invoice");
        VoidInvoice = a4eVar6;
        a4e a4eVar7 = new a4e("Automatic", 6, MetricTracker.CarouselSource.AUTOMATIC);
        Automatic = a4eVar7;
        a4e[] a4eVarArr = {a4eVar, a4eVar2, a4eVar3, a4eVar4, a4eVar5, a4eVar6, a4eVar7};
        $VALUES = a4eVarArr;
        $ENTRIES = new wg7(a4eVarArr);
        Companion = new Object();
    }

    public a4e(String str, int i, String str2) {
        this.code = str2;
    }

    public static final /* synthetic */ String a(a4e a4eVar) {
        return a4eVar.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static a4e valueOf(String str) {
        return (a4e) Enum.valueOf(a4e.class, str);
    }

    public static a4e[] values() {
        return (a4e[]) $VALUES.clone();
    }
}
