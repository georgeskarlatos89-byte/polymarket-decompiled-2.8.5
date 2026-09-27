package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lbd {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public lbd(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(wj9 wj9Var) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        Notification notification = this.d;
        uj9 uj9Var = (uj9) wj9Var;
        uj9Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(wj9.e);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            obtain.writeTypedObject(notification, 0);
            uj9Var.f.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return woa.r(sb, this.c, "]");
    }
}
