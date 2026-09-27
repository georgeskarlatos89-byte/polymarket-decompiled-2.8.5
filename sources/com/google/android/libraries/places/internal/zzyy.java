package com.google.android.libraries.places.internal;

import defpackage.tid;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzyy implements tid {
    private final /* synthetic */ Function1 zza;

    public zzyy(Function1 function1) {
        function1.getClass();
        this.zza = function1;
    }

    @Override // defpackage.tid
    public final /* synthetic */ void onSuccess(Object obj) {
        this.zza.invoke(obj);
    }
}
