package com.socure.docv.capturesdk.models;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n {
    public final Integer a;
    public final String b;

    public n(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Intrinsics.areEqual(this.a, nVar.a) && Intrinsics.areEqual(this.b, nVar.b)) {
            return true;
        }
        return false;
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
        int i2 = hashCode * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "EnvironmentModel(id=" + this.a + ", name=" + this.b + ")";
    }
}
