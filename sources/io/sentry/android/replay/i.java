package io.sentry.android.replay;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i extends Lambda implements Function1 {
    public final /* synthetic */ long h;
    public final /* synthetic */ j i;
    public final /* synthetic */ Ref.ObjectRef j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j, j jVar, Ref.ObjectRef objectRef) {
        super(1);
        this.h = j;
        this.i = jVar;
        this.j = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        if (kVar.b < this.h) {
            this.i.g(kVar.a);
            return Boolean.TRUE;
        }
        Ref.ObjectRef objectRef = this.j;
        if (objectRef.a == null) {
            objectRef.a = kVar.c;
        }
        return Boolean.FALSE;
    }
}
