package com.socure.docv.capturesdk.common.mapper;

import defpackage.q55;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends q55 {
    public Object k;
    public Object l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, q55 q55Var) {
        super(q55Var);
        this.o = dVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
