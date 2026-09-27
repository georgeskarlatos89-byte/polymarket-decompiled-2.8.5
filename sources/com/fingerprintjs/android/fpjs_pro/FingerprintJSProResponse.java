package com.fingerprintjs.android.fpjs_pro;

import defpackage.hdi;
import defpackage.k84;
import defpackage.m51;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\b\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/FingerprintJSProResponse;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FingerprintJSProResponse {
    public final String a;
    public final String b;
    public final d c;
    public final boolean d;
    public final String e;
    public final n f;
    public final String g;
    public final String h;
    public final w i;
    public final w j;
    public final String k;
    public final String l;

    public FingerprintJSProResponse(String str, String str2, d dVar, boolean z, String str3, n nVar, String str4, String str5, w wVar, w wVar2, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = dVar;
        this.d = z;
        this.e = str3;
        this.f = nVar;
        this.g = str4;
        this.h = str5;
        this.i = wVar;
        this.j = wVar2;
        this.k = str6;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FingerprintJSProResponse) {
                FingerprintJSProResponse fingerprintJSProResponse = (FingerprintJSProResponse) obj;
                if (!Intrinsics.areEqual(this.a, fingerprintJSProResponse.a) || !Intrinsics.areEqual(this.b, fingerprintJSProResponse.b) || !Intrinsics.areEqual(this.c, fingerprintJSProResponse.c) || this.d != fingerprintJSProResponse.d || !Intrinsics.areEqual(this.e, fingerprintJSProResponse.e) || !Intrinsics.areEqual(this.f, fingerprintJSProResponse.f) || !Intrinsics.areEqual(this.g, fingerprintJSProResponse.g) || !Intrinsics.areEqual(this.h, fingerprintJSProResponse.h) || !Intrinsics.areEqual(this.i, fingerprintJSProResponse.i) || !Intrinsics.areEqual(this.j, fingerprintJSProResponse.j) || !Intrinsics.areEqual(this.k, fingerprintJSProResponse.k) || !Intrinsics.areEqual(this.l, fingerprintJSProResponse.l) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.e.hashCode() + hdi.g(hdi.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a), 31, this.d)) * 31;
        int i = 0;
        n nVar = this.f;
        if (nVar == null) {
            hashCode = 0;
        } else {
            hashCode = nVar.hashCode();
        }
        int hashCode3 = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        return (this.l.hashCode() + ((hashCode3 + i) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder r = m51.r("FingerprintJSProResponse(requestId=", this.a, ", visitorId=", this.b, ", confidenceScore=");
        r.append(this.c);
        r.append(", visitorFound=");
        r.append(this.d);
        r.append(", ipAddress=");
        r.append(this.e);
        r.append(", ipLocation=");
        r.append(this.f);
        r.append(", osName=");
        k84.q(r, this.g, ", osVersion=", this.h, ", firstSeenAt=");
        r.append(this.i);
        r.append(", lastSeenAt=");
        r.append(this.j);
        r.append(", sealedResult=");
        return sv6.p(r, this.k, ", asJson=", this.l, ", errorMessage=null)");
    }
}
