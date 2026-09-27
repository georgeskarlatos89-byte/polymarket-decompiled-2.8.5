package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import defpackage.q55;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends q55 {
    public Object k;
    public Button l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, q55 q55Var) {
        super(q55Var);
        this.n = bVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
