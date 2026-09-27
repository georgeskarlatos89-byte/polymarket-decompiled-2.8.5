package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pxn {
    public static pxn e;
    public static HandlerThread f;
    public static Handler g;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public pxn(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    public static void a(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pxn, java.lang.Object] */
    public static synchronized pxn e(Context context) {
        pxn pxnVar;
        synchronized (pxn.class) {
            pxn pxnVar2 = e;
            pxnVar = pxnVar2;
            if (pxnVar2 == null) {
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new rsc("MessengerIpcClient")));
                ?? obj = new Object();
                obj.d = new kfn(obj);
                obj.a = 1;
                obj.c = unconfigurableScheduledExecutorService;
                obj.b = context.getApplicationContext();
                e = obj;
                pxnVar = obj;
            }
        }
        return pxnVar;
    }

    public int b() {
        int i = this.a;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return Barcode.FORMAT_UPC_A;
        }
        return 2048;
    }

    public void c() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                if (this.a > 0) {
                    z = true;
                } else {
                    z = false;
                }
                pfn.f(z);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(2:45|(1:(1:(5:49|50|41|42|43)(2:51|52))(4:53|54|55|39))(3:56|57|58))(3:9|10|(9:12|(1:14)(1:35)|(6:22|23|(1:25)|26|(1:28)(1:33)|(2:30|31))|34|23|(0)|26|(0)(0)|(0)))|36|(2:38|31)|39))|63|6|7|(0)(0)|36|(0)|39|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r0.b(r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0035, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:50:0x0030, B:41:0x00f1, B:39:0x00db, B:36:0x00c4, B:10:0x005b, B:12:0x0061, B:14:0x0067, B:16:0x0079, B:19:0x0080, B:22:0x0089, B:23:0x0092, B:25:0x009c, B:26:0x00ac, B:33:0x00bf), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:50:0x0030, B:41:0x00f1, B:39:0x00db, B:36:0x00c4, B:10:0x005b, B:12:0x0061, B:14:0x0067, B:16:0x0079, B:19:0x0080, B:22:0x0089, B:23:0x0092, B:25:0x009c, B:26:0x00ac, B:33:0x00bf), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(q55 q55Var) {
        egc egcVar;
        u85 u85Var;
        int i;
        dt4 dt4Var;
        r50 r50Var;
        String str;
        String str2;
        fs5 fs5Var;
        Object H;
        ho hoVar = (ho) this.b;
        if (q55Var instanceof egc) {
            egcVar = (egc) q55Var;
            int i2 = egcVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                egcVar.o = i2 - Integer.MIN_VALUE;
                Object obj = egcVar.m;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = egcVar.o;
                if (i == 0) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        this = hoVar;
                        ((xrb) this.d).c("Failed to migrate storage: " + th.getMessage());
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this = egcVar.k;
                                ResultKt.a(obj);
                                ((SharedPreferences) this.c).edit().putInt("storage_version", ezh.V3.a()).apply();
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dt4 dt4Var2 = egcVar.l;
                        pxn pxnVar = egcVar.k;
                        ResultKt.a(obj);
                        dt4Var = dt4Var2;
                        this = pxnVar;
                        r50 r50Var2 = new r50((ho) this.b, dt4Var, 1);
                        egcVar.k = this;
                        egcVar.l = null;
                        egcVar.o = 3;
                    } else {
                        dt4 dt4Var3 = egcVar.l;
                        pxn pxnVar2 = egcVar.k;
                        ResultKt.a(obj);
                        dt4Var = dt4Var3;
                        this = pxnVar2;
                    }
                } else {
                    ResultKt.a(obj);
                    dt4Var = hoVar.a;
                    if (dt4Var.p) {
                        LinkedHashMap linkedHashMap = gs5.a;
                        String str3 = dt4Var.e;
                        if (str3 != null) {
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            str = str3.toLowerCase(locale);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, "$default_instance")) {
                            str2 = "com.amplitude.api_".concat(str);
                            LinkedHashMap linkedHashMap2 = gs5.a;
                            fs5Var = (fs5) linkedHashMap2.get(str2);
                            if (fs5Var == null) {
                                fs5Var = new fs5(dt4Var.b, str2, dt4Var.g.x(hoVar));
                                linkedHashMap2.put(str2, fs5Var);
                            }
                            egcVar.k = this;
                            egcVar.l = dt4Var;
                            egcVar.o = 1;
                            H = new qje(6, hoVar, fs5Var).H(egcVar);
                            if (H == u85Var) {
                                H = Unit.INSTANCE;
                            }
                            if (H == u85Var) {
                                return u85Var;
                            }
                        }
                        str2 = "com.amplitude.api";
                        LinkedHashMap linkedHashMap22 = gs5.a;
                        fs5Var = (fs5) linkedHashMap22.get(str2);
                        if (fs5Var == null) {
                        }
                        egcVar.k = this;
                        egcVar.l = dt4Var;
                        egcVar.o = 1;
                        H = new qje(6, hoVar, fs5Var).H(egcVar);
                        if (H == u85Var) {
                        }
                        if (H == u85Var) {
                        }
                    }
                }
                r50Var = new r50((ho) this.b, dt4Var, 0);
                egcVar.k = this;
                egcVar.l = dt4Var;
                egcVar.o = 2;
                if (r50Var.b(egcVar) == u85Var) {
                    return u85Var;
                }
                r50 r50Var22 = new r50((ho) this.b, dt4Var, 1);
                egcVar.k = this;
                egcVar.l = null;
                egcVar.o = 3;
            }
        }
        egcVar = new egc(this, q55Var);
        Object obj2 = egcVar.m;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = egcVar.o;
        if (i == 0) {
        }
        r50Var = new r50((ho) this.b, dt4Var, 0);
        egcVar.k = this;
        egcVar.l = dt4Var;
        egcVar.o = 2;
        if (r50Var.b(egcVar) == u85Var) {
        }
        r50 r50Var222 = new r50((ho) this.b, dt4Var, 1);
        egcVar.k = this;
        egcVar.l = null;
        egcVar.o = 3;
    }

    public synchronized fzn f(qmn qmnVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(qmnVar.toString());
            }
            if (!((kfn) this.d).a(qmnVar)) {
                kfn kfnVar = new kfn(this);
                this.d = kfnVar;
                kfnVar.a(qmnVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return qmnVar.b.a;
    }

    public pxn(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        this.b = flow;
        this.a = i;
        this.c = bufferOverflow;
        this.d = coroutineContext;
    }
}
