package com.checkout.components.interfaces.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.zca;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "", "", "countryCode", AttributeType.NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCountryCode", "getCountryCode$annotations", "()V", "b", "getNumber", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class PhoneNetworkEntity {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final String countryCode;

    /* renamed from: b, reason: from kotlin metadata */
    private final String number;

    public PhoneNetworkEntity(@zca(name = "country_code") String str, String str2) {
        str.getClass();
        str2.getClass();
        this.countryCode = str;
        this.number = str2;
    }

    public static /* synthetic */ PhoneNetworkEntity copy$default(PhoneNetworkEntity phoneNetworkEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneNetworkEntity.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = phoneNetworkEntity.number;
        }
        return phoneNetworkEntity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final PhoneNetworkEntity copy(@zca(name = "country_code") String countryCode, String number) {
        countryCode.getClass();
        number.getClass();
        return new PhoneNetworkEntity(countryCode, number);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneNetworkEntity)) {
            return false;
        }
        PhoneNetworkEntity phoneNetworkEntity = (PhoneNetworkEntity) other;
        if (Intrinsics.areEqual(this.countryCode, phoneNetworkEntity.countryCode) && Intrinsics.areEqual(this.number, phoneNetworkEntity.number)) {
            return true;
        }
        return false;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getNumber() {
        return this.number;
    }

    public final int hashCode() {
        return this.number.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("PhoneNetworkEntity(countryCode=", this.countryCode, ", number=", this.number, ")");
    }

    @zca(name = "country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }
}
