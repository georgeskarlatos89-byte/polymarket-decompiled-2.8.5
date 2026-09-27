package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes4.dex */
public final class zvc {
    public static final yvc Companion = new Object();
    public final Integer a;
    public final String b;
    public final boolean c;

    public /* synthetic */ zvc(int i, Integer num, String str, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvc)) {
            return false;
        }
        zvc zvcVar = (zvc) obj;
        if (Intrinsics.areEqual(this.a, zvcVar.a) && Intrinsics.areEqual(this.b, zvcVar.b) && this.c == zvcVar.c) {
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
        return Boolean.hashCode(this.c) + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuyParams(outcomeIndex=");
        sb.append(this.a);
        sb.append(", marketSlug=");
        sb.append(this.b);
        sb.append(", long=");
        return ix2.r(sb, this.c, ")");
    }

    public zvc(String str, boolean z, Integer num) {
        this.a = num;
        this.b = str;
        this.c = z;
    }
}
