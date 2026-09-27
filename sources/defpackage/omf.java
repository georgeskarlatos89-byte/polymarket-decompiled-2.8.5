package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import io.radar.sdk.RadarActivityManager;
import io.radar.sdk.RadarFirebaseMessagingService;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class omf implements iid, rp8, sx6, icg, k05 {
    public final /* synthetic */ int a;

    public /* synthetic */ omf(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void b(int i, long j) {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void n(Object obj, Object obj2, String str) {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new RuntimeException(str + obj + obj2);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    @Override // defpackage.k05
    public void accept(Object obj) {
        ((hdg) obj).b.getClass();
    }

    @Override // defpackage.rp8
    public Object apply(Object obj) {
        byte[] decode;
        boolean z = false;
        switch (this.a) {
            case 5:
                return obj;
            case 10:
                return null;
            case 20:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        ysk a = my0.a();
                        a.K(rawQuery.getString(1));
                        a.c = j6f.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a.a = decode;
                        arrayList.add(a.l());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                if (((Cursor) obj).getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.iid
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                RadarActivityManager.a(exc);
                return;
            case 1:
                RadarFirebaseMessagingService.Companion.a(exc);
                return;
            default:
                return;
        }
    }

    private final void s(Exception exc) {
    }

    @Override // defpackage.sx6
    public double c(double d) {
        return d;
    }
}
