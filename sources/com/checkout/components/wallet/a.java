package com.checkout.components.wallet;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.rcg;
import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a implements OnCompleteListener {
    public final /* synthetic */ rcg a;

    public a(rcg rcgVar) {
        this.a = rcgVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        task.getClass();
        rcg rcgVar = this.a;
        Result.Companion companion = Result.INSTANCE;
        rcgVar.resumeWith(Result.m882constructorimpl(task.getResult()));
    }
}
