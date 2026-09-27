package com.socure.docv.capturesdk.models;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x {
    public final Integer a;
    public final m b;
    public final o c;
    public final j d;
    public final d0 e;
    public final String f;
    public final n g;
    public final String h;
    public final r i;

    public x(Integer num, m mVar, o oVar, j jVar, d0 d0Var, String str, n nVar, String str2, r rVar) {
        mVar.getClass();
        oVar.getClass();
        this.a = num;
        this.b = mVar;
        this.c = oVar;
        this.d = jVar;
        this.e = d0Var;
        this.f = str;
        this.g = nVar;
        this.h = str2;
        this.i = rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (!Intrinsics.areEqual(this.a, xVar.a) || !Intrinsics.areEqual(this.b, xVar.b) || !Intrinsics.areEqual(this.c, xVar.c) || !Intrinsics.areEqual(this.d, xVar.d) || !Intrinsics.areEqual(this.e, xVar.e) || !Intrinsics.areEqual(this.f, xVar.f) || !Intrinsics.areEqual(this.g, xVar.g) || !Intrinsics.areEqual(this.h, xVar.h) || !Intrinsics.areEqual(this.i, xVar.i)) {
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
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (this.g.hashCode() + hdi.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return this.i.hashCode() + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        return "GlobalConfigModel(accountId=" + this.a + ", customization=" + this.b + ", errorLabels=" + this.c + ", commonLabels=" + this.d + ", nativeLabelsModel=" + this.e + ", eventId=" + this.f + ", environment=" + this.g + ", language=" + this.h + ", flags=" + this.i + ")";
    }
}
