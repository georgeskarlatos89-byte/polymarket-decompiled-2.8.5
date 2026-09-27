package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.UserManager;
import io.sentry.android.core.c2;
import io.sentry.android.core.m0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class fum {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final abe c = new abe(6);

    public static final void a(Intent intent, String str, String str2, String str3) {
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.fromParts("mailto", str, null));
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (str3 != null) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, xej, ujb, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, xej, java.lang.Runnable, u2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [wzg, java.lang.Object, u2] */
    public static u2 c(Context context, Callable callable, Executor executor) {
        e3g e3gVar = new e3g(callable, 22);
        if (d(context)) {
            ?? obj = new Object();
            obj.a = new wej((xej) obj, e3gVar);
            executor.execute(obj);
            return obj;
        }
        ?? obj2 = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        c2 c2Var = new c2(atomicBoolean, context, obj2, e3gVar, executor);
        context.registerReceiver(c2Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (d(context) && atomicBoolean.compareAndSet(false, true)) {
            try {
                context.unregisterReceiver(c2Var);
            } catch (IllegalArgumentException e) {
                m0.q("DirectBootUtils", "Failed to unregister receiver", e);
            }
            ?? obj3 = new Object();
            obj3.a = new wej((xej) obj3, e3gVar);
            executor.execute(obj3);
            obj2.setFuture(obj3);
            return obj2;
        }
        obj2.addListener(new w93(6, obj2, atomicBoolean, context, c2Var, false), pt6.INSTANCE);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Context context) {
        boolean z;
        if (b) {
            return true;
        }
        synchronized (fum.class) {
            try {
                if (b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    z = false;
                    if (i > 2) {
                        break;
                    }
                    UserManager userManager = a;
                    if (userManager == null) {
                        userManager = (UserManager) context.getSystemService(UserManager.class);
                        a = userManager;
                    }
                    if (userManager == null) {
                        z = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e) {
                        m0.q("DirectBootUtils", "Failed to check if user is unlocked.", e);
                        a = null;
                        i++;
                    }
                }
                if (z) {
                    a = null;
                }
                if (z) {
                    b = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract x7g b(bz2 bz2Var, mta mtaVar);
}
