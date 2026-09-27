package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rbm extends fcm {
    public final String a;

    public rbm(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fcm fcmVar = (fcm) obj;
        int zza = fcmVar.zza();
        int c = fcm.c((byte) 96);
        if (c != zza) {
            return c - fcmVar.zza();
        }
        String str = ((rbm) fcmVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rbm.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((rbm) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(fcm.c((byte) 96)), this.a});
    }

    public final String toString() {
        return woa.r(new StringBuilder("\""), this.a, "\"");
    }

    @Override // defpackage.fcm
    public final int zza() {
        return fcm.c((byte) 96);
    }
}
