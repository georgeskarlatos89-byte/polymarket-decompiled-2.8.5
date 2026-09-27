package defpackage;

import android.content.Context;
import android.net.Uri;
import io.sentry.android.core.m0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class xbn implements gci {
    public final String a;
    public final sz8 b;
    public volatile int c = -1;
    public nbi d;

    public xbn(String str, sz8 sz8Var) {
        this.a = str;
        this.b = sz8Var;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:54:0x0109 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:37:0x008f, B:39:0x0093, B:40:0x00a8, B:42:0x00b4, B:44:0x00c6, B:46:0x00d4, B:52:0x00f5, B:54:0x0109, B:55:0x010f, B:57:0x0120, B:59:0x0128, B:60:0x0143, B:73:0x0156, B:76:0x015c, B:62:0x0167, B:66:0x0171, B:68:0x0177, B:69:0x017c, B:79:0x00fb, B:80:0x00e9, B:81:0x00e1, B:83:0x017e), top: B:36:0x008f, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:37:0x008f, B:39:0x0093, B:40:0x00a8, B:42:0x00b4, B:44:0x00c6, B:46:0x00d4, B:52:0x00f5, B:54:0x0109, B:55:0x010f, B:57:0x0120, B:59:0x0128, B:60:0x0143, B:73:0x0156, B:76:0x015c, B:62:0x0167, B:66:0x0171, B:68:0x0177, B:69:0x017c, B:79:0x00fb, B:80:0x00e9, B:81:0x00e1, B:83:0x017e), top: B:36:0x008f, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0177 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:37:0x008f, B:39:0x0093, B:40:0x00a8, B:42:0x00b4, B:44:0x00c6, B:46:0x00d4, B:52:0x00f5, B:54:0x0109, B:55:0x010f, B:57:0x0120, B:59:0x0128, B:60:0x0143, B:73:0x0156, B:76:0x015c, B:62:0x0167, B:66:0x0171, B:68:0x0177, B:69:0x017c, B:79:0x00fb, B:80:0x00e9, B:81:0x00e1, B:83:0x017e), top: B:36:0x008f, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [lym, java.lang.Exception] */
    @Override // defpackage.gci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        mgn mgnVar;
        Object obj;
        String str;
        Object obj2;
        b7h b7hVar;
        String str2;
        zwm zwmVar;
        if (x5n.c == null) {
            Object obj3 = zwm.j;
            x5n.c = new Exception();
        }
        Context context = (Context) zwm.k.get();
        Object obj4 = null;
        if (context != null) {
            zwm zwmVar2 = zwm.l;
            if (zwmVar2 == null) {
                Context applicationContext = context.getApplicationContext();
                try {
                    applicationContext.getClass();
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    Class<?> cls = applicationContext2.getClass();
                    new StringBuilder(String.valueOf(cls).length() + 72);
                    cls.toString();
                    throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                } catch (IllegalStateException unused) {
                    synchronized (zwm.j) {
                        try {
                            if (zwm.l != null) {
                                zwmVar = zwm.l;
                            } else {
                                zwmVar = (zwm) new gxm(applicationContext, 0).get();
                                zwm.l = zwmVar;
                                rgn.i(Level.CONFIG, zwmVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                            }
                            zwmVar2 = zwmVar;
                        } finally {
                        }
                    }
                }
            }
            int i = this.c;
            if (i == -1 || i < ((AtomicInteger) this.d.b).get()) {
                synchronized (this) {
                    try {
                        int i2 = this.c;
                        if (i2 == -1) {
                            zwm.b();
                            zwmVar2.getClass();
                            mgnVar = this.b.g(zwmVar2);
                            this.d = mgnVar.f;
                        } else {
                            mgnVar = null;
                        }
                        int i3 = ((AtomicInteger) this.d.b).get();
                        if (i2 < i3) {
                            zwm.b();
                            zwmVar2.getClass();
                            eld c = awm.c(zwmVar2.b);
                            if (c.b()) {
                                vvm vvmVar = (vvm) c.a();
                                Uri a = fwm.a();
                                String str3 = this.a;
                                if (a != null) {
                                    b7hVar = (b7h) vvmVar.a.get(a.toString());
                                } else {
                                    vvmVar.getClass();
                                    b7hVar = null;
                                }
                                if (b7hVar == null) {
                                    str2 = null;
                                } else {
                                    str2 = (String) b7hVar.get(str3);
                                }
                                if (str2 != null) {
                                    try {
                                        obj = b(str2);
                                    } catch (IOException | IllegalArgumentException e) {
                                        m0.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e);
                                    }
                                    if (mgnVar == null) {
                                        mgnVar = this.b.g(zwmVar2);
                                    }
                                    str = mgnVar.c;
                                    if (!zwmVar2.b.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                        ujb g = ((wkc) zwmVar2.a()).g(new ptl(28, zwmVar2, str));
                                        g.addListener(new xq8(g, 1), pt6.INSTANCE);
                                    }
                                    obj2 = ((bxf) mgnVar.a().d).get(this.a);
                                    if (obj2 != null) {
                                        try {
                                            obj4 = c(obj2);
                                        } catch (IOException | ClassCastException e2) {
                                            m0.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e2);
                                        }
                                    }
                                    if (true == c.b()) {
                                        obj = obj4;
                                    }
                                    if (obj == null) {
                                        obj = a();
                                    }
                                    if (obj != null) {
                                        e(obj);
                                        this.c = i3;
                                    }
                                }
                            }
                            obj = null;
                            if (mgnVar == null) {
                            }
                            str = mgnVar.c;
                            if (!zwmVar2.b.getPackageName().equals("com.android.vending")) {
                                ujb g2 = ((wkc) zwmVar2.a()).g(new ptl(28, zwmVar2, str));
                                g2.addListener(new xq8(g2, 1), pt6.INSTANCE);
                            }
                            obj2 = ((bxf) mgnVar.a().d).get(this.a);
                            if (obj2 != null) {
                            }
                            if (true == c.b()) {
                            }
                            if (obj == null) {
                            }
                            if (obj != null) {
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                obj.getClass();
                return obj;
            }
            obj = d();
            obj.getClass();
            return obj;
        }
        synchronized (x5n.a) {
        }
        dmk.n("Must call PhenotypeContext.setContext() first");
        return null;
    }
}
