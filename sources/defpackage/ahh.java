package defpackage;

import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.gson.JsonParseException;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ahh implements ehh, r8a, qhd, vvi, TimeProvider, yk4, vu7 {
    public static final ahh b = new ahh(10);
    public static final ahh c = new ahh(11);
    public static final ahh d = new ahh(12);
    public static final ahh e = new ahh(13);
    public static final ahh f = new ahh(14);
    public final /* synthetic */ int a;

    public /* synthetic */ ahh(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void d(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new JsonParseException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.vu7
    public su7[] c() {
        switch (this.a) {
            case zh4.REMOTE_EXCEPTION /* 19 */:
                k3j k3jVar = new k3j(0L);
                we8 we8Var = jr9.b;
                return new su7[]{new afj(1, 1, rbi.K0, k3jVar, new lh6(0, wwf.e))};
            default:
                return new su7[]{new ugk()};
        }
    }

    @Override // defpackage.yk4
    public Object create(uk4 uk4Var) {
        wtc wtcVar = (wtc) uk4Var;
        switch (this.a) {
            case 16:
                return TransportRegistrar.c(wtcVar);
            case 17:
                return TransportRegistrar.b(wtcVar);
            default:
                return TransportRegistrar.a(wtcVar);
        }
    }

    @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.ehh
    public boolean e() {
        return false;
    }

    @Override // defpackage.r8a
    public boolean g(g6f g6fVar, String str) {
        g6fVar.getClass();
        str.getClass();
        if (g6fVar.a() >= g6f.ERROR.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qhd
    public vlk onApplyWindowInsets(View view, vlk vlkVar) {
        switch (this.a) {
            case 2:
                int i = Stripe3ds2TransactionActivity.d;
                view.getClass();
                fz9 i2 = vlkVar.a.i(519);
                i2.getClass();
                view.setPaddingRelative(i2.d, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                return vlk.b;
            default:
                int i3 = StripeBrowserLauncherActivity.b;
                view.getClass();
                fz9 i4 = vlkVar.a.i(519);
                i4.getClass();
                view.setPaddingRelative(i4.d, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                return vlk.b;
        }
    }
}
