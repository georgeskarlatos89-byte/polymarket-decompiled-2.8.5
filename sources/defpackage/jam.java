package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jam extends fcm {
    public final boolean a;

    public jam(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        fcm fcmVar = (fcm) obj;
        int zza = fcmVar.zza();
        int c = fcm.c(MessagePack.Code.NEGFIXINT_PREFIX);
        if (c != zza) {
            return c - fcmVar.zza();
        }
        jam jamVar = (jam) fcmVar;
        int i2 = 21;
        if (true != this.a) {
            i = 20;
        } else {
            i = 21;
        }
        if (true != jamVar.a) {
            i2 = 20;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jam.class == obj.getClass() && this.a == ((jam) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(fcm.c(MessagePack.Code.NEGFIXINT_PREFIX)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.fcm
    public final int zza() {
        return fcm.c(MessagePack.Code.NEGFIXINT_PREFIX);
    }
}
