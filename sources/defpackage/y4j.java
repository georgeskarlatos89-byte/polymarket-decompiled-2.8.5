package defpackage;

import java.util.Set;
import kotlin.collections.ArraysKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y4j {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y4j[] $VALUES;
    public static final y4j ApplePay;
    public static final x4j Companion;
    public static final y4j GooglePay;
    public static final y4j Masterpass;
    public static final y4j VisaCheckout;
    private final Set<String> code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x4j] */
    static {
        y4j y4jVar = new y4j("ApplePay", 0, vzg.b("apple_pay"));
        ApplePay = y4jVar;
        y4j y4jVar2 = new y4j("GooglePay", 1, ArraysKt.l0(new String[]{"android_pay", "google"}));
        GooglePay = y4jVar2;
        y4j y4jVar3 = new y4j("Masterpass", 2, vzg.b("masterpass"));
        Masterpass = y4jVar3;
        y4j y4jVar4 = new y4j("VisaCheckout", 3, vzg.b("visa_checkout"));
        VisaCheckout = y4jVar4;
        y4j[] y4jVarArr = {y4jVar, y4jVar2, y4jVar3, y4jVar4};
        $VALUES = y4jVarArr;
        $ENTRIES = new wg7(y4jVarArr);
        Companion = new Object();
    }

    public y4j(String str, int i, Set set) {
        this.code = set;
    }

    public static final /* synthetic */ Set a(y4j y4jVar) {
        return y4jVar.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static y4j valueOf(String str) {
        return (y4j) Enum.valueOf(y4j.class, str);
    }

    public static y4j[] values() {
        return (y4j[]) $VALUES.clone();
    }
}
