package defpackage;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class nw5 {
    public static final ts4 a;
    public static final Function1 b;

    static {
        jsn.a(bsk.class.getSimpleName(), new Exception());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        a = new ts4(false);
        new AtomicInteger(0);
        new AtomicLong(0L);
        Function1 function1 = null;
        try {
            Object newInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            newInstance.getClass();
            hhj.e(1, newInstance);
            function1 = (Function1) newInstance;
        } catch (Throwable unused) {
        }
        b = function1;
        new ts4(true);
    }
}
