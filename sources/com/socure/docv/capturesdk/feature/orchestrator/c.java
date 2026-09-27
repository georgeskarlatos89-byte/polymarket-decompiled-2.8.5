package com.socure.docv.capturesdk.feature.orchestrator;

import defpackage.q55;
import defpackage.u85;
import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, q55 q55Var) {
        super(q55Var);
        this.l = dVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = this.l.a(this);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return new Result(a);
    }
}
