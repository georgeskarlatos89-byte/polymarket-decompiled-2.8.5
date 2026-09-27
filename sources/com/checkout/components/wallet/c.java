package com.checkout.components.wallet;

import com.google.android.gms.tasks.Task;
import defpackage.fq8;
import defpackage.ka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends fq8 implements Function1 {
    public c(ka kaVar) {
        super(1, 0, ka.class, kaVar, "launch", "launch(Ljava/lang/Object;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Task task = (Task) obj;
        task.getClass();
        ((ka) this.receiver).a(task, null);
        return Unit.INSTANCE;
    }
}
