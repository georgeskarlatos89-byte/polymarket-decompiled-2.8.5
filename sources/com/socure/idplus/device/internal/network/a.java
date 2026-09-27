package com.socure.idplus.device.internal.network;

import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    public final Integer a;
    public final String b;
    public final String c;

    public a(Integer num) {
        this.a = num;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        Integer num = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("DataError(responseCode=");
        sb.append(num);
        sb.append(", code=");
        sb.append(str);
        sb.append(", message=");
        return woa.r(sb, str2, ")");
    }

    public a(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }
}
