package com.google.android.gms.tasks;

import defpackage.bid;
import defpackage.fzn;
import defpackage.iid;
import defpackage.p55;
import defpackage.tid;
import defpackage.xbi;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Task<TResult> {
    public void a(bid bidVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, bid bidVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void c(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract fzn d(iid iidVar);

    public abstract fzn e(Executor executor, iid iidVar);

    public abstract fzn f(tid tidVar);

    public abstract fzn g(Executor executor, tid tidVar);

    public abstract Exception getException();

    public abstract TResult getResult();

    public Task h(p55 p55Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task i(Executor executor, p55 p55Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract boolean isSuccessful();

    public Task j(p55 p55Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public Task k(Executor executor, p55 p55Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Object l();

    public abstract boolean m();

    public abstract boolean n();

    public Task o(xbi xbiVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task p(Executor executor, xbi xbiVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
