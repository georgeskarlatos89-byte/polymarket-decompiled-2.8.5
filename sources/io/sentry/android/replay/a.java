package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a extends Lambda implements Function0 {
    public static final a i = new a(0, 0);
    public static final a j = new a(0, 1);
    public static final a k = new a(0, 2);
    public static final a l = new a(0, 3);
    public static final a m = new a(0, 4);
    public static final a n = new a(0, 5);
    public static final a o = new a(0, 6);
    public static final a p = new a(0, 7);
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Method method;
        switch (this.h) {
            case 0:
                return new Regex("_[a-z]");
            case 1:
                return new io.sentry.util.l();
            case 2:
                r rVar = new r();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new com.appsflyer.a(rVar, 22));
                return rVar;
            case 3:
                Class cls = (Class) y.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 4:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th) {
                    Log.w("WindowManagerSpy", th);
                    return null;
                }
            case 5:
                Class cls2 = (Class) y.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 6:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused) {
                    return null;
                }
            default:
                Class cls3 = (Class) e0.a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused2) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
