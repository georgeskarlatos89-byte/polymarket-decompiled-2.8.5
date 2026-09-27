package com.fingerprintjs.android.fpjs_pro_internal;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0080\b\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/n;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class n {
    public volatile String a;
    public volatile String b;
    public volatile Integer c;
    public volatile int d;
    public volatile Long e;
    public volatile Long f;
    public volatile Long g;
    public volatile Long h;
    public volatile Long i;
    public volatile Long j;

    public n(String str, String str2, Integer num, int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        num = (i2 & 4) != 0 ? null : num;
        i = (i2 & 8) != 0 ? 0 : i;
        l = (i2 & 16) != 0 ? null : l;
        l2 = (i2 & 32) != 0 ? null : l2;
        l3 = (i2 & 64) != 0 ? null : l3;
        l4 = (i2 & 128) != 0 ? null : l4;
        l5 = (i2 & 256) != 0 ? null : l5;
        l6 = (i2 & Barcode.FORMAT_UPC_A) != 0 ? null : l6;
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = i;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = l5;
        this.j = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Intrinsics.areEqual(this.a, nVar.a) && Intrinsics.areEqual(this.b, nVar.b) && Intrinsics.areEqual(this.c, nVar.c) && this.d == nVar.d && Intrinsics.areEqual(this.e, nVar.e) && Intrinsics.areEqual(this.f, nVar.f) && Intrinsics.areEqual(this.g, nVar.g) && Intrinsics.areEqual(this.h, nVar.h) && Intrinsics.areEqual(this.i, nVar.i) && Intrinsics.areEqual(this.j, nVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 0;
        if (this.a == null) {
            hashCode = 0;
        } else {
            hashCode = this.a.hashCode();
        }
        int i2 = hashCode * 31;
        if (this.b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = this.b.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (this.c == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = this.c.hashCode();
        }
        int b = woa.b(this.d, (i3 + hashCode3) * 31, 31);
        if (this.e == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = this.e.hashCode();
        }
        int i4 = (b + hashCode4) * 31;
        if (this.f == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = this.f.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        if (this.g == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = this.g.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        if (this.h == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = this.h.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        if (this.i == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = this.i.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        if (this.j != null) {
            i = this.j.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        return "";
    }

    public n() {
        this(null, null, null, 0, null, null, null, null, null, null, 1023, null);
    }
}
