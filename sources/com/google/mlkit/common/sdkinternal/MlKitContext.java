package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import defpackage.al4;
import defpackage.arn;
import defpackage.ck4;
import defpackage.fpi;
import defpackage.gl4;
import defpackage.jl4;
import defpackage.nhk;
import defpackage.p8a;
import defpackage.py2;
import defpackage.ry9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class MlKitContext {
    private static final Object zza = new Object();
    private static MlKitContext zzb;
    private jl4 zzc;

    private MlKitContext() {
    }

    public static MlKitContext getInstance() {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (zza) {
            if (zzb != null) {
                z = true;
            } else {
                z = false;
            }
            arn.j("MlKitContext has not been initialized", z);
            mlKitContext = zzb;
            arn.h(mlKitContext);
        }
        return mlKitContext;
    }

    public static MlKitContext initialize(Context context, List<ComponentRegistrar> list) {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    z = true;
                } else {
                    z = false;
                }
                arn.j("MlKitContext is already initialized", z);
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context zzc = zzc(context);
                HashMap hashMap = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    hashMap.put(componentRegistrar.getClass(), componentRegistrar);
                }
                ArrayList arrayList = new ArrayList(hashMap.values());
                p8a p8aVar = fpi.a;
                ck4[] ck4VarArr = {ck4.c(zzc, Context.class, new Class[0]), ck4.c(mlKitContext2, MlKitContext.class, new Class[0])};
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new gl4((ComponentRegistrar) it.next(), 0));
                }
                jl4 jl4Var = new jl4(p8aVar, arrayList2, Arrays.asList(ck4VarArr), al4.g0);
                mlKitContext2.zzc = jl4Var;
                jl4Var.c(true);
                mlKitContext = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mlKitContext;
    }

    public static MlKitContext initializeIfNeeded(Context context) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zza(context);
            }
        }
        return mlKitContext;
    }

    public static MlKitContext zza(Context context) {
        MlKitContext zzb2;
        synchronized (zza) {
            zzb2 = zzb(context, fpi.a);
        }
        return zzb2;
    }

    public static MlKitContext zzb(Context context, Executor executor) {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (zza) {
            if (zzb == null) {
                z = true;
            } else {
                z = false;
            }
            arn.j("MlKitContext is already initialized", z);
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context zzc = zzc(context);
            ArrayList A = new ry9(27, zzc, new nhk(MlKitComponentDiscoveryService.class, 21)).A();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            py2 py2Var = al4.g0;
            arrayList.addAll(A);
            arrayList2.add(ck4.c(zzc, Context.class, new Class[0]));
            arrayList2.add(ck4.c(mlKitContext2, MlKitContext.class, new Class[0]));
            jl4 jl4Var = new jl4(executor, arrayList, arrayList2, py2Var);
            mlKitContext2.zzc = jl4Var;
            jl4Var.c(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    public <T> T get(Class<T> cls) {
        boolean z;
        if (zzb == this) {
            z = true;
        } else {
            z = false;
        }
        arn.j("MlKitContext has been deleted", z);
        arn.h(this.zzc);
        return (T) this.zzc.b(cls);
    }

    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    public static MlKitContext initializeIfNeeded(Context context, List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = initialize(context, list);
            }
        }
        return mlKitContext;
    }

    public static MlKitContext initializeIfNeeded(Context context, Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zzb(context, executor);
            }
        }
        return mlKitContext;
    }
}
