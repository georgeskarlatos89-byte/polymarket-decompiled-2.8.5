package com.socure.docv.capturesdk.common.view.model;

import defpackage.m51;
import defpackage.sv6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public b(String str, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual(this.a, bVar.a) || !Intrinsics.areEqual(this.b, bVar.b) || !Intrinsics.areEqual(this.c, bVar.c) || !Intrinsics.areEqual(this.d, bVar.d)) {
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
        int a = com.socure.docv.capturesdk.api.a.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ((a + hashCode) * 31);
    }

    public final String toString() {
        return sv6.p(m51.r("Button(label=", this.a, ", labelColor=", this.b, ", borderColor="), this.c, ", bgColor=", this.d, ")");
    }
}
