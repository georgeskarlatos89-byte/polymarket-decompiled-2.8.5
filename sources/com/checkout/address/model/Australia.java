package com.checkout.address.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/address/model/Australia;", "Lcom/checkout/address/model/State;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "b", "getDisplayName", "displayName", "ACT", "NSW", "NT", "QLD", "SA", "TAS", "VIC", "WA", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Australia implements State {
    public static final Australia ACT;
    public static final Australia NSW;
    public static final Australia NT;
    public static final Australia QLD;
    public static final Australia SA;
    public static final Australia TAS;
    public static final Australia VIC;
    public static final Australia WA;
    private static final /* synthetic */ Australia[] c;
    private static final /* synthetic */ ug7 d;

    /* renamed from: a, reason: from kotlin metadata */
    private final String code;

    /* renamed from: b, reason: from kotlin metadata */
    private final String displayName;

    static {
        Australia australia = new Australia("ACT", 0, "ACT", "Australian Capital Territory");
        ACT = australia;
        Australia australia2 = new Australia("NSW", 1, "NSW", "New South Wales");
        NSW = australia2;
        Australia australia3 = new Australia("NT", 2, "NT", "Northern Territory");
        NT = australia3;
        Australia australia4 = new Australia("QLD", 3, "QLD", "Queensland");
        QLD = australia4;
        Australia australia5 = new Australia("SA", 4, "SA", "South Australia");
        SA = australia5;
        Australia australia6 = new Australia("TAS", 5, "TAS", "Tasmania");
        TAS = australia6;
        Australia australia7 = new Australia("VIC", 6, "VIC", "Victoria");
        VIC = australia7;
        Australia australia8 = new Australia("WA", 7, "WA", "Western Australia");
        WA = australia8;
        Australia[] australiaArr = {australia, australia2, australia3, australia4, australia5, australia6, australia7, australia8};
        c = australiaArr;
        d = new wg7(australiaArr);
    }

    private Australia(String str, int i, String str2, String str3) {
        this.code = str2;
        this.displayName = str3;
    }

    public static ug7 getEntries() {
        return d;
    }

    public static Australia valueOf(String str) {
        return (Australia) Enum.valueOf(Australia.class, str);
    }

    public static Australia[] values() {
        return (Australia[]) c.clone();
    }

    @Override // com.checkout.address.model.State
    public final String getCode() {
        return this.code;
    }

    @Override // com.checkout.address.model.State
    public final String getDisplayName() {
        return this.displayName;
    }
}
