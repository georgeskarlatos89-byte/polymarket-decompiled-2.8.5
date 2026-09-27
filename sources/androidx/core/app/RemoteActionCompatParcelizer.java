package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.k7k;
import defpackage.l7k;
import defpackage.m7k;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(k7k k7kVar) {
        ?? obj = new Object();
        m7k m7kVar = obj.a;
        boolean z = true;
        if (k7kVar.e(1)) {
            m7kVar = k7kVar.g();
        }
        obj.a = (IconCompat) m7kVar;
        CharSequence charSequence = obj.b;
        if (k7kVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((l7k) k7kVar).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (k7kVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((l7k) k7kVar).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) k7kVar.f(obj.d, 4);
        boolean z2 = obj.e;
        if (k7kVar.e(5)) {
            if (((l7k) k7kVar).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!k7kVar.e(6)) {
            z = z3;
        } else if (((l7k) k7kVar).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, k7k k7kVar) {
        k7kVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        k7kVar.h(1);
        k7kVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        k7kVar.h(2);
        Parcel parcel = ((l7k) k7kVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        k7kVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        k7kVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        k7kVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        k7kVar.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
