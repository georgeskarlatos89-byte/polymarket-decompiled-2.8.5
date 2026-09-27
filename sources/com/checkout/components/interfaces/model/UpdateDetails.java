package com.checkout.components.interfaces.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/UpdateDetails;", "", "amount", "", "currency", "", "<init>", "(ILjava/lang/String;)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UpdateDetails {
    public static final int $stable = 0;
    private final int amount;
    private final String currency;

    public /* synthetic */ UpdateDetails(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ UpdateDetails copy$default(UpdateDetails updateDetails, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = updateDetails.amount;
        }
        if ((i2 & 2) != 0) {
            str = updateDetails.currency;
        }
        return updateDetails.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final UpdateDetails copy(int amount, String currency) {
        return new UpdateDetails(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateDetails)) {
            return false;
        }
        UpdateDetails updateDetails = (UpdateDetails) other;
        if (this.amount == updateDetails.amount && Intrinsics.areEqual(this.currency, updateDetails.currency)) {
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.amount) * 31;
        String str = this.currency;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "UpdateDetails(amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    public UpdateDetails(int i, String str) {
        this.amount = i;
        this.currency = str;
    }
}
