package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcrg implements InvocationHandler {
    private final List zza;
    private boolean zzb;
    private String zzc;

    public zzcrg(List list) {
        this.zza = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = zzcrk.zza;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.zzb = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.zza;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                int i = 0;
                while (true) {
                    List list2 = this.zza;
                    if (i < size) {
                        if (list2.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.zzc = str;
                            return str;
                        }
                        i++;
                    } else {
                        String str2 = (String) list2.get(0);
                        this.zzc = str2;
                        return str2;
                    }
                }
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.zzc = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }

    public final /* synthetic */ boolean zza() {
        return this.zzb;
    }

    public final /* synthetic */ String zzb() {
        return this.zzc;
    }
}
