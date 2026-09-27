package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import skip.foundation.URLSessionTask;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class glj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ URLSessionTask b;
    public final /* synthetic */ Ref.ObjectRef c;

    public /* synthetic */ glj(URLSessionTask uRLSessionTask, Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = uRLSessionTask;
        this.c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Ref.ObjectRef objectRef = this.c;
        URLSessionTask uRLSessionTask = this.b;
        switch (i) {
            case 0:
                return URLSessionTask.o(uRLSessionTask, objectRef);
            default:
                return URLSessionTask.n(uRLSessionTask, objectRef);
        }
    }
}
