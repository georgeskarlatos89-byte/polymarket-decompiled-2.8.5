package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r50 {
    public final /* synthetic */ int a;
    public final ho b;
    public final y50 c;
    public final a35 d;
    public final y50 e;
    public final ArrayList f;

    public r50(ho hoVar, dt4 dt4Var, int i) {
        this.a = i;
        dt4Var.getClass();
        switch (i) {
            case 1:
                this.b = hoVar;
                ArrayList arrayList = new ArrayList();
                this.f = arrayList;
                StringBuilder sb = new StringBuilder("amplitude-android-");
                String str = dt4Var.e;
                sb.append(str);
                this.c = a(dt4Var, "amplitude-disk-queue", sb.toString());
                this.e = a(dt4Var, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str);
                File dir = dt4Var.b.getDir("amplitude-kotlin-" + str, 0);
                String str2 = dt4Var.e;
                String str3 = dt4Var.a;
                ah5 ah5Var = dt4Var.o;
                xrb x = dt4Var.g.x(hoVar);
                String g = k84.g("amplitude-identity-", str);
                dir.getClass();
                xl9 xl9Var = new xl9(str2, str3, ah5Var, dir, g, x);
                arrayList.add(dir);
                this.d = new a35(xl9Var);
                return;
            default:
                this.b = hoVar;
                ArrayList arrayList2 = new ArrayList();
                this.f = arrayList2;
                StringBuilder sb2 = new StringBuilder("amplitude-android-");
                String str4 = dt4Var.a;
                sb2.append(str4);
                this.c = a(dt4Var, "amplitude-disk-queue", sb2.toString());
                this.e = a(dt4Var, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str4);
                Context context = dt4Var.b;
                StringBuilder sb3 = new StringBuilder("amplitude-kotlin-");
                String str5 = dt4Var.e;
                sb3.append(str5);
                File dir2 = context.getDir(sb3.toString(), 0);
                String str6 = dt4Var.e;
                String str7 = dt4Var.a;
                ah5 ah5Var2 = dt4Var.o;
                xrb x2 = dt4Var.g.x(hoVar);
                String g2 = k84.g("amplitude-identity-", str5);
                dir2.getClass();
                xl9 xl9Var2 = new xl9(str6, str7, ah5Var2, dir2, g2, x2);
                arrayList2.add(dir2);
                this.d = new a35(xl9Var2);
                return;
        }
    }

    public final y50 a(dt4 dt4Var, String str, String str2) {
        int i = this.a;
        ho hoVar = this.b;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                File dir = dt4Var.b.getDir(str, 0);
                dir.getClass();
                arrayList.add(dir);
                SharedPreferences sharedPreferences = dt4Var.b.getSharedPreferences(str2, 0);
                String str3 = dt4Var.a;
                xrb x = dt4Var.g.x(hoVar);
                sharedPreferences.getClass();
                return new y50(str3, x, sharedPreferences, dir, hoVar.m, new a5e(this, 5));
            default:
                File dir2 = dt4Var.b.getDir(str, 0);
                dir2.getClass();
                arrayList.add(dir2);
                SharedPreferences sharedPreferences2 = dt4Var.b.getSharedPreferences(str2, 0);
                String str4 = dt4Var.e;
                xrb x2 = dt4Var.g.x(hoVar);
                sharedPreferences2.getClass();
                return new y50(str4, x2, sharedPreferences2, dir2, hoVar.m, new a5e(this, 6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r12.y(r0) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        if (r2.y(r0) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
    
        if (r12.y(r0) == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0130, code lost:
    
        if (r2.y(r0) == r5) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q55 q55Var) {
        q50 q50Var;
        int i;
        y50 d;
        Iterator it;
        s50 s50Var;
        int i2;
        y50 d2;
        Iterator it2;
        int i3 = this.a;
        y50 y50Var = this.c;
        a35 a35Var = this.d;
        ho hoVar = this.b;
        y50 y50Var2 = null;
        switch (i3) {
            case 0:
                if (q55Var instanceof q50) {
                    q50Var = (q50) q55Var;
                    int i4 = q50Var.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        q50Var.n = i4 - Integer.MIN_VALUE;
                        Object obj = q50Var.l;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = q50Var.n;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    this = q50Var.k;
                                    ResultKt.a(obj);
                                    it = this.f.iterator();
                                    while (it.hasNext()) {
                                        File file = (File) it.next();
                                        String[] list = file.list();
                                        if (list != null && list.length == 0) {
                                            file.delete();
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = q50Var.k;
                            ResultKt.a(obj);
                        } else {
                            ResultKt.a(obj);
                            new bm9(a35Var, hoVar.e(), hoVar.f()).l();
                            y50 g = hoVar.g();
                            if (!(g instanceof y50)) {
                                g = null;
                            }
                            if (g != null) {
                                m64 m64Var = new m64(y50Var, g, hoVar.f());
                                q50Var.k = this;
                                q50Var.n = 1;
                                break;
                            }
                        }
                        d = this.b.d();
                        if (d instanceof y50) {
                            y50Var2 = d;
                        }
                        if (y50Var2 != null) {
                            m64 m64Var2 = new m64(this.e, y50Var2, this.b.f());
                            q50Var.k = this;
                            q50Var.n = 2;
                            break;
                        }
                        it = this.f.iterator();
                        while (it.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                q50Var = new q50(this, q55Var);
                Object obj2 = q50Var.l;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = q50Var.n;
                if (i == 0) {
                }
                d = this.b.d();
                if (d instanceof y50) {
                }
                if (y50Var2 != null) {
                }
                it = this.f.iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                if (q55Var instanceof s50) {
                    s50Var = (s50) q55Var;
                    int i5 = s50Var.n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        s50Var.n = i5 - Integer.MIN_VALUE;
                        Object obj3 = s50Var.l;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = s50Var.n;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    this = s50Var.k;
                                    ResultKt.a(obj3);
                                    it2 = this.f.iterator();
                                    while (it2.hasNext()) {
                                        File file2 = (File) it2.next();
                                        String[] list2 = file2.list();
                                        if (list2 != null && list2.length == 0) {
                                            file2.delete();
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = s50Var.k;
                            ResultKt.a(obj3);
                            d2 = this.b.d();
                            if (d2 instanceof y50) {
                                y50Var2 = d2;
                            }
                            if (y50Var2 != null) {
                                m64 m64Var3 = new m64(this.e, y50Var2, this.b.f());
                                s50Var.k = this;
                                s50Var.n = 2;
                                break;
                            }
                            it2 = this.f.iterator();
                            while (it2.hasNext()) {
                            }
                            return Unit.INSTANCE;
                        }
                        ResultKt.a(obj3);
                        new bm9(a35Var, hoVar.e(), hoVar.f()).l();
                        if (Intrinsics.areEqual(hoVar.a.e, "$default_instance")) {
                            y50 g2 = hoVar.g();
                            if (!(g2 instanceof y50)) {
                                g2 = null;
                            }
                            if (g2 != null) {
                                m64 m64Var4 = new m64(y50Var, g2, hoVar.f());
                                s50Var.k = this;
                                s50Var.n = 1;
                                break;
                            }
                            d2 = this.b.d();
                            if (d2 instanceof y50) {
                            }
                            if (y50Var2 != null) {
                            }
                        }
                        it2 = this.f.iterator();
                        while (it2.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                s50Var = new s50(this, q55Var);
                Object obj32 = s50Var.l;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = s50Var.n;
                if (i2 == 0) {
                }
                break;
        }
    }
}
