package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cbm extends fcm {
    public final long a;

    public cbm(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fcm fcmVar = (fcm) obj;
        if (zza() != fcmVar.zza()) {
            return zza() - fcmVar.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((cbm) fcmVar).a);
        if (abs < abs2) {
            return -1;
        }
        if (abs > abs2) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cbm.class == obj.getClass() && this.a == ((cbm) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // defpackage.fcm
    public final int zza() {
        byte b;
        if (this.a >= 0) {
            b = 0;
        } else {
            b = 32;
        }
        return fcm.c(b);
    }
}
