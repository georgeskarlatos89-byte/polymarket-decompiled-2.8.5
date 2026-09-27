package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.k84;
import defpackage.m51;
import defpackage.sv6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public f0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        str7 = (i & 64) != 0 ? null : str7;
        str8 = (i & 128) != 0 ? null : str8;
        str9 = (i & 256) != 0 ? null : str9;
        str10 = (i & Barcode.FORMAT_UPC_A) != 0 ? null : str10;
        str11 = (i & Barcode.FORMAT_UPC_E) != 0 ? null : str11;
        String str12 = (i & 2048) == 0 ? "" : null;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (Intrinsics.areEqual(this.a, f0Var.a) && Intrinsics.areEqual(this.b, f0Var.b) && Intrinsics.areEqual(this.c, f0Var.c) && Intrinsics.areEqual(this.d, f0Var.d) && Intrinsics.areEqual(this.e, f0Var.e) && Intrinsics.areEqual(this.f, f0Var.f) && Intrinsics.areEqual(this.g, f0Var.g) && Intrinsics.areEqual(this.h, f0Var.h) && Intrinsics.areEqual(this.i, f0Var.i) && Intrinsics.areEqual(this.j, f0Var.j) && Intrinsics.areEqual(this.k, f0Var.k) && Intrinsics.areEqual(this.l, f0Var.l) && Intrinsics.areEqual(null, null)) {
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
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.g;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.h;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str9 = this.i;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str10 = this.j;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str11 = this.k;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str12 = this.l;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (i12 + i) * 31;
    }

    public final String toString() {
        StringBuilder r = m51.r("Labels(document=", this.a, ", primaryText=", this.b, ", documentsCollected=");
        k84.q(r, this.c, ", secondaryText=", this.d, ", tertiaryText=");
        k84.q(r, this.e, ", tertiaryAnnotation=", this.f, ", uploadDocumentButton=");
        k84.q(r, this.g, ", scanDocumentButton=", this.h, ", uploadMainText=");
        k84.q(r, this.i, ", scanMainText=", this.j, ", uploadSecondaryText=");
        return sv6.p(r, this.k, ", scanSecondaryText=", this.l, ", disclaimerText=null)");
    }
}
