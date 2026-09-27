package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.j61;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/stripe/android/model/BankAccount$Type", "", "Lcom/stripe/android/model/BankAccount$Type;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "a", "Companion", "j61", "Company", "Individual", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankAccount$Type {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ BankAccount$Type[] $VALUES;
    public static final j61 Companion;
    public static final BankAccount$Type Company;
    public static final BankAccount$Type Individual;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [j61, java.lang.Object] */
    static {
        BankAccount$Type bankAccount$Type = new BankAccount$Type("Company", 0, "company");
        Company = bankAccount$Type;
        BankAccount$Type bankAccount$Type2 = new BankAccount$Type("Individual", 1, "individual");
        Individual = bankAccount$Type2;
        BankAccount$Type[] bankAccount$TypeArr = {bankAccount$Type, bankAccount$Type2};
        $VALUES = bankAccount$TypeArr;
        $ENTRIES = new wg7(bankAccount$TypeArr);
        Companion = new Object();
    }

    public BankAccount$Type(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static BankAccount$Type valueOf(String str) {
        return (BankAccount$Type) Enum.valueOf(BankAccount$Type.class, str);
    }

    public static BankAccount$Type[] values() {
        return (BankAccount$Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
