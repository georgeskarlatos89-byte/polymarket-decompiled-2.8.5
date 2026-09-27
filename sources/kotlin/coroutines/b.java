package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class b implements f {
    public final Function1 a;
    public final f b;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.a = function1;
        this.b = fVar instanceof b ? ((b) fVar).b : fVar;
    }
}
