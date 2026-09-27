package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dbd {
    public final CharSequence a;
    public final long b;
    public final ble c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public dbd(CharSequence charSequence, long j, ble bleVar) {
        this.a = charSequence;
        this.b = j;
        this.c = bleVar;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dbd dbdVar = (dbd) arrayList.get(i);
            ble bleVar = dbdVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = dbdVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", dbdVar.b);
            if (bleVar != null) {
                bundle.putCharSequence("sender", bleVar.a);
                bundle.putParcelable("sender_person", cbd.a(kon.b(bleVar)));
            }
            String str = dbdVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = dbdVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", dbdVar.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
