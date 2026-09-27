package defpackage;

import com.polymarket.android.PolymarketApplication;
import io.sentry.c6;
import io.sentry.h5;
import io.sentry.j0;
import io.sentry.protocol.o;
import io.sentry.protocol.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class xbc implements sbj, xk9, vu7, c6, rp8 {
    public final /* synthetic */ int a;

    public /* synthetic */ xbc(rye ryeVar) {
        this.a = 27;
    }

    public static /* synthetic */ void e(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void f(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void n(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void r(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void s(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new GeneralSecurityException(str + obj);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void w(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.sbj
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                yec yecVar = (yec) obj;
                yecVar.getClass();
                xnl xnlVar = nff.a;
                xnlVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    xnlVar.a(yecVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return q6f.b;
        }
    }

    @Override // defpackage.xk9
    public boolean b(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                if (i5 == 84 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vu7
    public su7[] c() {
        switch (this.a) {
            case 5:
                return new su7[]{new pmc(rbi.K0, 16)};
            case 14:
                return new su7[]{new Object()};
            default:
                return new su7[]{new rgf()};
        }
    }

    public h5 d(h5 h5Var, j0 j0Var) {
        String str;
        boolean z;
        int i = PolymarketApplication.b;
        Iterable d = h5Var.d();
        if (d == null) {
            d = CollectionsKt.emptyList();
        }
        Iterable iterable = d;
        boolean z2 = iterable instanceof Collection;
        boolean z3 = true;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                o oVar = ((v) it.next()).f;
                if (oVar != null) {
                    str = oVar.a;
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, "SentryOkHttpInterceptor")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                String str2 = ((v) it2.next()).a;
                if (str2 != null && StringsKt.L(str2, "SigmaDevice", false)) {
                    break;
                }
            }
        }
        z3 = false;
        if (z || z3) {
            return null;
        }
        return h5Var;
    }

    public /* synthetic */ xbc(int i) {
        this.a = i;
    }
}
