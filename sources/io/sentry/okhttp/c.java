package io.sentry.okhttp;

import io.sentry.f7;
import io.sentry.m1;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ IOException i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, IOException iOException) {
        super(1);
        this.h = i;
        this.i = iOException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        IOException iOException = this.i;
        switch (i) {
            case 0:
                m1 m1Var = (m1) obj;
                m1Var.getClass();
                m1Var.a(f7.INTERNAL_ERROR);
                m1Var.o(iOException);
                return Unit.INSTANCE;
            case 1:
                m1 m1Var2 = (m1) obj;
                m1Var2.getClass();
                m1Var2.o(iOException);
                m1Var2.a(f7.INTERNAL_ERROR);
                return Unit.INSTANCE;
            case 2:
                m1 m1Var3 = (m1) obj;
                m1Var3.getClass();
                if (!m1Var3.e()) {
                    m1Var3.a(f7.INTERNAL_ERROR);
                    m1Var3.o(iOException);
                }
                return Unit.INSTANCE;
            case 3:
                m1 m1Var4 = (m1) obj;
                m1Var4.getClass();
                m1Var4.a(f7.INTERNAL_ERROR);
                m1Var4.o(iOException);
                return Unit.INSTANCE;
            case 4:
                m1 m1Var5 = (m1) obj;
                m1Var5.getClass();
                if (!m1Var5.e()) {
                    m1Var5.a(f7.INTERNAL_ERROR);
                    m1Var5.o(iOException);
                }
                return Unit.INSTANCE;
            default:
                m1 m1Var6 = (m1) obj;
                m1Var6.getClass();
                m1Var6.a(f7.INTERNAL_ERROR);
                m1Var6.o(iOException);
                return Unit.INSTANCE;
        }
    }
}
