package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.socure.docv.capturesdk.api.Keys;
import io.sentry.android.core.m0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n58 {
    public static final Object j = new Object();
    public static final fl0 k = new b7h();
    public final Context a;
    public final String b;
    public final b68 c;
    public final jl4 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final dya g;
    public final lgf h;
    public final CopyOnWriteArrayList i;

    public n58(Context context, String str, b68 b68Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.a = context;
        arn.e(str);
        this.b = str;
        this.c = b68Var;
        zx0 zx0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList A = new ry9(27, context, new nhk(ComponentDiscoveryService.class, 21)).A();
        Trace.endSection();
        Trace.beginSection("Runtime");
        mtj mtjVar = mtj.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(A);
        arrayList.add(new gl4(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new gl4(new ExecutorsRegistrar(), 1));
        arrayList2.add(ck4.c(context, Context.class, new Class[0]));
        arrayList2.add(ck4.c(this, n58.class, new Class[0]));
        arrayList2.add(ck4.c(b68Var, b68.class, new Class[0]));
        ndg ndgVar = new ndg(28);
        if (u0n.e(context) && FirebaseInitProvider.b.get()) {
            arrayList2.add(ck4.c(zx0Var, zx0.class, new Class[0]));
        }
        jl4 jl4Var = new jl4(mtjVar, arrayList, arrayList2, ndgVar);
        this.d = jl4Var;
        Trace.endSection();
        this.g = new dya(new il4(2, this, context));
        this.h = jl4Var.i(z46.class);
        k58 k58Var = new k58(this);
        a();
        if (atomicBoolean.get()) {
            d31.e.a.get();
        }
        copyOnWriteArrayList.add(k58Var);
        Trace.endSection();
    }

    public static n58 b() {
        n58 n58Var;
        synchronized (j) {
            try {
                n58Var = (n58) k.get("[DEFAULT]");
                if (n58Var != null) {
                    ((z46) n58Var.h.get()).b();
                } else {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    String str = bsn.a;
                    if (str == null) {
                        str = Application.getProcessName();
                        bsn.a = str;
                    }
                    sb.append(str);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n58Var;
    }

    public static n58 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                b68 a = b68.a(context);
                if (a == null) {
                    m0.p("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static n58 f(Context context, b68 b68Var) {
        n58 n58Var;
        AtomicReference atomicReference = l58.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = l58.a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        d31.a(application);
                        d31 d31Var = d31.e;
                        d31Var.getClass();
                        synchronized (d31Var) {
                            d31Var.c.add(obj);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            fl0 fl0Var = k;
            arn.j("FirebaseApp name [DEFAULT] already exists!", !fl0Var.containsKey("[DEFAULT]"));
            arn.i(context, "Application context cannot be null.");
            n58Var = new n58(context, "[DEFAULT]", b68Var);
            fl0Var.put("[DEFAULT]", n58Var);
        }
        n58Var.d();
        return n58Var;
    }

    public final void a() {
        arn.j("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(sgn.b(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(sgn.b(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void d() {
        Context context = this.a;
        boolean e = u0n.e(context);
        String str = this.b;
        if (!e) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = m58.b;
            if (atomicReference.get() == null) {
                m58 m58Var = new m58(context);
                while (!atomicReference.compareAndSet(null, m58Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(m58Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.c("[DEFAULT]".equals(str));
        ((z46) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n58)) {
            return false;
        }
        n58 n58Var = (n58) obj;
        n58Var.a();
        return this.b.equals(n58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        ss9 ss9Var = new ss9(this);
        ss9Var.R(this.b, Keys.KEY_NAME);
        ss9Var.R(this.c, "options");
        return ss9Var.toString();
    }
}
