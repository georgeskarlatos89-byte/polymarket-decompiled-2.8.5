package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.i61;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/model/BankAccount$Status", "", "Lcom/stripe/android/model/BankAccount$Status;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "a", "Companion", "i61", "New", "Validated", "Verified", "VerificationFailed", "Errored", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankAccount$Status {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ BankAccount$Status[] $VALUES;
    public static final i61 Companion;
    public static final BankAccount$Status Errored;
    public static final BankAccount$Status New;
    public static final BankAccount$Status Validated;
    public static final BankAccount$Status VerificationFailed;
    public static final BankAccount$Status Verified;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [i61, java.lang.Object] */
    static {
        BankAccount$Status bankAccount$Status = new BankAccount$Status("New", 0, "new");
        New = bankAccount$Status;
        BankAccount$Status bankAccount$Status2 = new BankAccount$Status("Validated", 1, "validated");
        Validated = bankAccount$Status2;
        BankAccount$Status bankAccount$Status3 = new BankAccount$Status("Verified", 2, "verified");
        Verified = bankAccount$Status3;
        BankAccount$Status bankAccount$Status4 = new BankAccount$Status("VerificationFailed", 3, "verification_failed");
        VerificationFailed = bankAccount$Status4;
        BankAccount$Status bankAccount$Status5 = new BankAccount$Status("Errored", 4, "errored");
        Errored = bankAccount$Status5;
        BankAccount$Status[] bankAccount$StatusArr = {bankAccount$Status, bankAccount$Status2, bankAccount$Status3, bankAccount$Status4, bankAccount$Status5};
        $VALUES = bankAccount$StatusArr;
        $ENTRIES = new wg7(bankAccount$StatusArr);
        Companion = new Object();
    }

    public BankAccount$Status(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static BankAccount$Status valueOf(String str) {
        return (BankAccount$Status) Enum.valueOf(BankAccount$Status.class, str);
    }

    public static BankAccount$Status[] values() {
        return (BankAccount$Status[]) $VALUES.clone();
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
