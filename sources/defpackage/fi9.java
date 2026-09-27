package defpackage;

import android.view.View;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class fi9 implements xk9, rp8, qhd, x5h, k05, u6c {
    public final /* synthetic */ int a;

    public /* synthetic */ fi9(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new ParseException(str + obj, 0);
    }

    public static /* synthetic */ void g(String str) {
        throw new ParseException(str, 0);
    }

    public static /* synthetic */ void h(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, int i) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new RuntimeException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5 + obj6 + obj7);
    }

    public static /* synthetic */ void n(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void w(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3);
    }

    @Override // defpackage.x5h
    public boolean a() {
        return false;
    }

    @Override // defpackage.k05
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.rp8
    public Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.xk9
    public boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.u6c
    public int c(Object obj) {
        String str = ((n6c) obj).a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (u1k.a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    @Override // defpackage.qhd
    public vlk onApplyWindowInsets(View view, vlk vlkVar) {
        switch (this.a) {
            case 3:
                return IntercomCarouselActivity.j(view, vlkVar);
            case 4:
                return IntercomNoteActivity.h(view, vlkVar);
            default:
                return IntercomSheetActivity.h(view, vlkVar);
        }
    }
}
