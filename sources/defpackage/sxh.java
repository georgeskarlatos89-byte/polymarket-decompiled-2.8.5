package defpackage;

import android.graphics.ImageDecoder;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sxh implements ux5 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final hld c;
    public final vug d;

    public sxh(ImageDecoder.Source source, AutoCloseable autoCloseable, hld hldVar, vug vugVar) {
        this.a = source;
        this.b = autoCloseable;
        this.c = hldVar;
        this.d = vugVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.Ref$a, java.lang.Object] */
    @Override // defpackage.ux5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(Continuation continuation) {
        rxh rxhVar;
        int i;
        vug vugVar;
        try {
            try {
                if (continuation instanceof rxh) {
                    rxhVar = (rxh) continuation;
                    int i2 = rxhVar.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        rxhVar.n = i2 - Integer.MIN_VALUE;
                        Object obj = rxhVar.l;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = rxhVar.n;
                        if (i == 0) {
                            if (i == 1) {
                                vugVar = rxhVar.k;
                                ResultKt.a(obj);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj);
                            vug vugVar2 = this.d;
                            rxhVar.k = vugVar2;
                            rxhVar.n = 1;
                            if (vugVar2.a(rxhVar) == u85Var) {
                                return u85Var;
                            }
                            vugVar = vugVar2;
                        }
                        AutoCloseable autoCloseable = this.b;
                        ?? obj2 = new Object();
                        lx5 lx5Var = new lx5(new ef1(ImageDecoder.decodeBitmap(this.a, new j90(this, obj2, 1))), obj2.a);
                        dgn.a(autoCloseable, null);
                        return lx5Var;
                    }
                }
                ?? obj22 = new Object();
                lx5 lx5Var2 = new lx5(new ef1(ImageDecoder.decodeBitmap(this.a, new j90(this, obj22, 1))), obj22.a);
                dgn.a(autoCloseable, null);
                return lx5Var2;
            } finally {
            }
            AutoCloseable autoCloseable2 = this.b;
        } finally {
            vugVar.d();
        }
        rxhVar = new rxh(this, (q55) continuation);
        Object obj3 = rxhVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = rxhVar.n;
        if (i == 0) {
        }
    }
}
