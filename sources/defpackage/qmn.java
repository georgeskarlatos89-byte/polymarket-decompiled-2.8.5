package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qmn {
    public final int a;
    public final epi b = new epi();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public qmn(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 16 + String.valueOf(bundle).length());
        }
        this.b.b(bundle);
    }

    public final void c(jtn jtnVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 14 + jtnVar.toString().length());
        }
        this.b.a(jtnVar);
    }

    public final String toString() {
        int i = this.c;
        int length = String.valueOf(i).length();
        int i2 = this.a;
        int length2 = String.valueOf(i2).length();
        boolean a = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a).length() + 1);
        sv6.w(i, i2, "Request { what=", " id=", sb);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
