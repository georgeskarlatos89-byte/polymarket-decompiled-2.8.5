package com.checkout.components.rememberme.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "", "Lcom/checkout/components/rememberme/model/TokenData;", "tokenData", "", "type", "<init>", "(Lcom/checkout/components/rememberme/model/TokenData;Ljava/lang/String;)V", "copy", "(Lcom/checkout/components/rememberme/model/TokenData;Ljava/lang/String;)Lcom/checkout/components/rememberme/model/CvvTokenPayload;", "a", "Lcom/checkout/components/rememberme/model/TokenData;", "getTokenData", "()Lcom/checkout/components/rememberme/model/TokenData;", "getTokenData$annotations", "()V", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class CvvTokenPayload {

    /* renamed from: a, reason: from kotlin metadata */
    public final TokenData tokenData;

    /* renamed from: b, reason: from kotlin metadata */
    public final String type;

    public CvvTokenPayload(@zca(name = "token_data") TokenData tokenData, @zca(name = "type") String str) {
        tokenData.getClass();
        str.getClass();
        this.tokenData = tokenData;
        this.type = str;
    }

    public final CvvTokenPayload copy(@zca(name = "token_data") TokenData tokenData, @zca(name = "type") String type) {
        tokenData.getClass();
        type.getClass();
        return new CvvTokenPayload(tokenData, type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvvTokenPayload)) {
            return false;
        }
        CvvTokenPayload cvvTokenPayload = (CvvTokenPayload) obj;
        if (Intrinsics.areEqual(this.tokenData, cvvTokenPayload.tokenData) && Intrinsics.areEqual(this.type, cvvTokenPayload.type)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.tokenData.cvv.hashCode() * 31);
    }

    public final String toString() {
        return "CvvTokenPayload(tokenData=" + this.tokenData + ", type=" + this.type + ")";
    }

    public /* synthetic */ CvvTokenPayload(TokenData tokenData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenData, (i & 2) != 0 ? "cvv" : str);
    }

    @zca(name = "token_data")
    public static /* synthetic */ void getTokenData$annotations() {
    }

    @zca(name = "type")
    public static /* synthetic */ void getType$annotations() {
    }
}
