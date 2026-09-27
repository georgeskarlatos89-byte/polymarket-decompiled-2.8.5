package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class etc implements LifecycleOwner, ViewModelStoreOwner, i49, ngg {
    public final st6 a;
    public ztc b;
    public final Bundle c;
    public n6b d;
    public final ntc e;
    public final String f;
    public final Bundle g;
    public final ew9 h = new ew9(this);
    public final Lazy i = LazyKt.lazy(new pla(this, 24));

    public etc(st6 st6Var, ztc ztcVar, Bundle bundle, n6b n6bVar, ntc ntcVar, String str, Bundle bundle2) {
        this.a = st6Var;
        this.b = ztcVar;
        this.c = bundle;
        this.d = n6bVar;
        this.e = ntcVar;
        this.f = str;
        this.g = bundle2;
    }

    public final void a(n6b n6bVar) {
        n6bVar.getClass();
        ew9 ew9Var = this.h;
        ew9Var.getClass();
        ew9Var.m = n6bVar;
        ew9Var.k();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof etc)) {
            etc etcVar = (etc) obj;
            Bundle bundle = etcVar.c;
            if (Intrinsics.areEqual(this.f, etcVar.f) && Intrinsics.areEqual(this.b, etcVar.b) && Intrinsics.areEqual((p7b) this.h.l, (p7b) etcVar.h.l) && Intrinsics.areEqual(getSavedStateRegistry(), etcVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.c;
                if (!Intrinsics.areEqual(bundle2, bundle)) {
                    if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Object obj3 = bundle2.get(str);
                                if (bundle != null) {
                                    obj2 = bundle.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!Intrinsics.areEqual(obj3, obj2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // defpackage.i49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context context;
        ew9 ew9Var = this.h;
        ew9Var.getClass();
        Application application2 = null;
        a aVar = new a(null, 1, null);
        etc etcVar = (etc) ew9Var.d;
        LinkedHashMap linkedHashMap = aVar.a;
        linkedHashMap.put(wym.a, etcVar);
        linkedHashMap.put(wym.b, etcVar);
        Bundle d = ew9Var.d();
        if (d != null) {
            linkedHashMap.put(wym.c, d);
        }
        st6 st6Var = this.a;
        if (st6Var != null) {
            Context context2 = st6Var.a;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
                if (application != null) {
                    application2 = application;
                }
                if (application2 != null) {
                    yej yejVar = jak.f;
                    yejVar.getClass();
                    linkedHashMap.put(yejVar, application2);
                }
                return aVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return aVar;
    }

    @Override // defpackage.i49
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return (pgg) this.h.n;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final p6b getLifecycle() {
        return (p7b) this.h.l;
    }

    @Override // defpackage.ngg
    public final lgg getSavedStateRegistry() {
        return ((mgg) this.h.j).b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ew9 ew9Var = this.h;
        if (ew9Var.c) {
            if (((p7b) ew9Var.l).d != n6b.DESTROYED) {
                ntc ntcVar = (ntc) ew9Var.h;
                if (ntcVar != null) {
                    String str = ew9Var.b;
                    LinkedHashMap linkedHashMap = ntcVar.b;
                    ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(str);
                    if (viewModelStore == null) {
                        ViewModelStore viewModelStore2 = new ViewModelStore();
                        linkedHashMap.put(str, viewModelStore2);
                        return viewModelStore2;
                    }
                    return viewModelStore;
                }
                dmk.n("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
                return null;
            }
            dmk.n("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        dmk.n("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        return null;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i2 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return getSavedStateRegistry().hashCode() + ((((p7b) this.h.l).hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.h.toString();
    }
}
